package gameSoftware.dataAcces.concretes;

import gameSoftware.dataAcces.abstracts.GamesDao;
import gameSoftware.entities.concretes.Games;

public class GamesManagerDao implements GamesDao{

	@Override
	public void add(Games game) {
		System.out.println("Oyun Adana Taraf�ndan eklendi : "+game.getIsim());
		System.out.println("--------------------------");
	}

	@Override
	public void update(Games game) {
		System.out.println("Oyun Adana Taraf�ndan g�ncellendi : "+game.getIsim());
		
	}

	@Override
	public void delete(Games game) {
		System.out.println("Oyun Adana Taraf�ndan silindi : "+game.getIsim());
		
	}

}
