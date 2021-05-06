package gameSoftware.business.abstracts;

import gameSoftware.entities.concretes.Games;

public interface ProductService {
	
	void add(Games game);
	void upDate(Games game);
	void delete (Games game);
}
