package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserService;
import eCommerce.dataAccsess.abstracts.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public void add(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Parola 6 haneden k���k olamaz.");
			return;
		}
		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve Soyad en az iki karakterden olu�mal�d�r.");
			return;
		}
		userDao.add(user);
		System.out.println("�ye olundu.");

	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
