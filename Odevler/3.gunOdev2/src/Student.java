
public class Student extends User {
	int studentId;

	public Student(int id, String firstName, String lastName, String mail, String password, String education,
			int studentId) {
		super(id, firstName, lastName, mail, password, education);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
		
}
