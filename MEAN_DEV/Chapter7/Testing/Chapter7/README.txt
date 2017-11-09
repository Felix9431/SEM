Chapter 6
Facebook authentication
app.get('/oauth/facebook', passport.authenticate('facebook', 
{
		scope:['emails'],
		failureRedirect: '/signin'
}));

should be added to the user.server.routes.js file.