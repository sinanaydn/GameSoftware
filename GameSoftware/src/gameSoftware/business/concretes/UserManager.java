package gameSoftware.business.concretes;


import gameSoftware.business.abstracts.UserService;
import gameSoftware.core.abstracts.Edevlet;
import gameSoftware.dataAcces.concretes.UserManagerDao;
import gameSoftware.entities.concretes.User;

public class UserManager implements UserService{
	
	private Edevlet edevlets;
	private UserManagerDao userManagerDao;

	public UserManager(Edevlet edevlets, UserManagerDao userManagerDao) {
		
		this.edevlets = edevlets;
		this.userManagerDao=userManagerDao;
	}

	@Override
	public void add(User user) {
		System.out.println("Kontrol ediliyor");
		this.edevlets.control(user);
		System.out.println("kullanýcý baþarýlý þekilde eklendi : "+user.getFirstName());
		this.userManagerDao.add(user);
		
	}

	@Override
	public void upDate(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	


	

}
