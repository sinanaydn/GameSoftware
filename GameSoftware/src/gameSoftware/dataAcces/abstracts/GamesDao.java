package gameSoftware.dataAcces.abstracts;

import gameSoftware.entities.concretes.Games;

public interface GamesDao {
	void add(Games game);

	void update(Games game);

	void delete(Games game);
}
