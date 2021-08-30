package eCommerce;

import eCommerce.business.abstracts.UserService;
import eCommerce.business.concretes.UserManager;
import eCommerce.dataAccsess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;


public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Talib", "Güler", "ada", "adsadas",true);
		UserService user = new UserManager(new HibernateUserDao());
		user.add(user1);
	}

}
