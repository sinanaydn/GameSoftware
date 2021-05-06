package gameSoftware;

import gameSoftware.business.abstracts.CompanyService;
import gameSoftware.business.abstracts.ProductService;
import gameSoftware.business.abstracts.UserService;
import gameSoftware.business.concretes.CompanyManager;
import gameSoftware.business.concretes.ProductManager;
import gameSoftware.business.concretes.UserManager;
import gameSoftware.core.concretes.EdevletManagger;

import gameSoftware.dataAcces.concretes.CompanyManagerDao;
import gameSoftware.dataAcces.concretes.GamesManagerDao;
import gameSoftware.dataAcces.concretes.UserManagerDao;
import gameSoftware.entities.concretes.Games;
import gameSoftware.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userService = new UserManager(new EdevletManagger(), new UserManagerDao());

		User user = new User("Sinan", "Aydýn", "12365478910");
		userService.add(user);
		System.out.println("------------------------------------");

		ProductService productService = new ProductManager(new GamesManagerDao());
		Games games = new Games("Metin2", 51);
		productService.add(games);

		CompanyService companyService = new CompanyManager(new CompanyManagerDao());
		companyService.add();

	}

}
