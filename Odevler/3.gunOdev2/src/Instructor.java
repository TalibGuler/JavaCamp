
public class Instructor extends User{
	int instructorId;

	public Instructor(int id, String firstName, String lastName, String mail, String password, String education,
			int instructorId) {
		super(id, firstName, lastName, mail, password, education);
		this.instructorId = instructorId;
	}
	
	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

}
