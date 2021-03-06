package gameSoftware.dataAcces.concretes;

import gameSoftware.dataAcces.abstracts.GamesDao;
import gameSoftware.entities.concretes.Games;

public class GamesManagerDao implements GamesDao{

	@Override
	public void add(Games game) {
		System.out.println("Oyun Adana Tarafından eklendi : "+game.getIsim());
		System.out.println("--------------------------");
	}

	@Override
	public void update(Games game) {
		System.out.println("Oyun Adana Tarafından güncellendi : "+game.getIsim());
		
	}

	@Override
	public void delete(Games game) {
		System.out.println("Oyun Adana Tarafından silindi : "+game.getIsim());
		
	}

}
