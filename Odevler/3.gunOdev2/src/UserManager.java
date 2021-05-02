
public class UserManager {

	public void add(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" sisteme eklendi.");
		
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" sistemden silindi.");
		
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName()+" sistemde güncellendi.");
		
	}
	
}
