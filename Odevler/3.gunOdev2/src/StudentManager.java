
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" öðrenci olarak eklendi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" öðretmen olarak güncellendi");
	}
}
