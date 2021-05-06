package gameSoftware.dataAcces.concretes;

import gameSoftware.dataAcces.abstracts.UserDao;
import gameSoftware.entities.concretes.User;

public class UserManagerDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullan�c� Adana Taraf�ndan eklendi : "+user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullan�c� Adana Taraf�ndan g�ncellendi : "+user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullan�c� Adana Taraf�ndan Silindi : "+user.getFirstName());
		
	}

}
