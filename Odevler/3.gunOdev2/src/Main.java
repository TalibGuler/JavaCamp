
public class Main {

	public static void main(String[] args) {
		Student student =new Student(1, "Talib", "GÜLER", "talib@gmail.com", "123", "C# kursu", 1);
		Instructor instructor =new Instructor(1, "Engin", "DEMİROĞ", "engin@gmail.com", "123", "C# kursu", 1);
		
		System.out.println("-------------------ÖĞRENCİ--------------------");
		UserManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		System.out.println("----------------------------------------------");
		
		System.out.println("-------------------EĞİTMEN--------------------");
		UserManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.update(instructor);
		instructorManager.delete(instructor);
		System.out.println("----------------------------------------------");
	}

}
