
public class StudentManager extends UserManager {

	@Override
	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ��renci olarak eklendi");
	}
	
	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" ��retmen olarak g�ncellendi");
	}
}
