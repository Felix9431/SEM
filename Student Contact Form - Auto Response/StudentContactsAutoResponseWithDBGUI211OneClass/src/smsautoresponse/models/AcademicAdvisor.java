package smsautoresponse.models;

public class AcademicAdvisor {

	private static String academicAdvisor;
	private static String studentProgramWebsite;
	
	public AcademicAdvisor(String academicAdvisor, String studentProgramWebsite){
		AcademicAdvisor.academicAdvisor = academicAdvisor;
		AcademicAdvisor.studentProgramWebsite = studentProgramWebsite;
	}

	public static AcademicAdvisor GetYourAcademicAdvisor(int program) {
		System.out.println("program number .........." + program);
		if (program == 1 || program == 2){
			academicAdvisor = "Shannon Gwaltney Phone: 618-453-7253, Email: shanng@siu.edu";
			studentProgramWebsite = "http://ist.siu.edu/";
		}
		
		if (program == 3 || program == 4) {
			academicAdvisor = "Jill Mueller Phone: 618-453-7276, Email: muellerj@siu.edu";
			studentProgramWebsite = "http://est.siu.edu/";
		}
		
		if (program == 5 || program == 6){
			academicAdvisor = "Shannon Gwaltney Phone: 618-453-7253, Email: shanng@siu.edu";
			studentProgramWebsite = "http://trm.siu.edu/";
		}
		
		AcademicAdvisor yourAcademicAdvisor = new AcademicAdvisor(academicAdvisor, studentProgramWebsite);
		return yourAcademicAdvisor;
	}
	
	public String getAcademicAdvisorContactInfo(){
		return academicAdvisor;
	}
	
	public String getStudentProgramWebsite(){
		return studentProgramWebsite;
	}
	
}
