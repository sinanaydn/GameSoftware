package gameSoftware.dataAcces.concretes;

import gameSoftware.dataAcces.abstracts.UserDao;
import gameSoftware.entities.concretes.User;

public class UserManagerDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanýcý Adana Tarafýndan eklendi : "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanýcý Adana Tarafýndan güncellendi : "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanýcý Adana Tarafýndan Silindi : "+user.getFirstName());
		
	}

}
