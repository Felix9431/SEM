var mongoose = require('mongoose'),
crypto = require('crypto'),
    Schema = mongoose.Schema;
//passportLocalMongoose = require('passport-local-mongoose');

var UserSchema = new Schema({
    firstName: String,
    lastName: String,
    email: {
        type: String,
        index: true
    },
    username: {
        type: String,
        index:{
        unique: true,
        dropDups:true},
        trim: true,
        required: true
    },
    password: String,
    created: {
        type: Date,
        default: Date.now
    },

    website: {
        type: String,
        get: function (url) {
            if (!url) {
                return url;
            } else {
                if (url.indexOf('http://') !== 0 && url.indexOf('https://') !== 0) {
                    url = 'http://' + url;
                }
                return url;
            }
        }
    }

});

//UserSchema.plugin(passportLocalMongoose);

/*UserSchema.virtual('fullName').get(function () {
    return this.firstName + ' ' + this.lastName;
}).set(function (fullName) {
    var splitName = fullName.split(' ');
    this.firstName = splitName[0] || '';
    this.lastName = splitName[1] || '';
});*/

UserSchema.virtual('fullName').get(function () {
    return this.firstName + ' ' + this.lastName;
}).set(function (fullName) {
    var splitName = fullName.split(' ');
    this.firstName = splitName[0] || '';
    this.lastName = splitName[1] || '';
});
UserSchema.pre('save', function (next) {
    if (this.password) {
        this.salt = new
            Buffer(crypto.randomBytes(16).toString('base64'), 'base64');
        this.password = this.hashPassword(this.password);
    }
    next();
});
UserSchema.methods.hashPassword = function (password) {
    return crypto.pbkdf2Sync(password, this.salt, 10000,
        64).toString('base64');
};
UserSchema.methods.authenticate = function (password) {
    return this.password === this.hashPassword(password);
};
UserSchema.statics.findUniqueUsername = function (username, suffix,
    callback) {
    var _this = this;
    var possibleUsername = username + (suffix || '');
    _this.findOne({
        username: possibleUsername
    }, function (err, user) {
        if (!err) {
            if (!user) {
                callback(possibleUsername);
            } else {
                return _this.findUniqueUsername(username, (suffix || 0) +
                    1, callback);
            }
        } else {
            callback(null);
        }
    });
};
UserSchema.set('toJSON', {
    getters: true,
    virtuals: true
});

UserSchema.set('toJSON', { getters: true, virtual: true });
mongoose.model('User', UserSchema);