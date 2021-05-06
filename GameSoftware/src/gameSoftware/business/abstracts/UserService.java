package gameSoftware.business.abstracts;

import gameSoftware.entities.concretes.User;

public interface UserService {
	void add(User user);
	void upDate(User user);
	void delete (User user);
}
