package kodlamaIoInheritance;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.email="fahrettinbeyazit@gmail.com";
		student.firstName="Fahrettin Beyazıt";
		student.lastName="Tokat";
		student.username="fahrettinbeyazit";
		student.id=1;
		student.password="12345";
		student.studentId=347;
		
		Instructer instructer = new Instructer();
		instructer.email="engindemirog@gmail.com";
		instructer.firstName="Engin";
		instructer.lastName="Demiroğ";
		instructer.username="engindemirog";
		instructer.id=2;
		instructer.password="1122334455";
		instructer.instructerId=1504;
		
		
		
		
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.add(instructer);
		
		userManager.delete(student);
		userManager.delete(instructer);
		
		userManager.upragate(student);
		userManager.upragate(instructer);
	

		
	}

}
