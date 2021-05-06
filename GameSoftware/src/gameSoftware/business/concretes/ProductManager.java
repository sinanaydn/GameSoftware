package gameSoftware.business.concretes;


import gameSoftware.business.abstracts.ProductService;
import gameSoftware.dataAcces.concretes.GamesManagerDao;
import gameSoftware.entities.concretes.Games;

public class ProductManager implements ProductService{
	
	private GamesManagerDao gamesmanagerdaos;

	public ProductManager(GamesManagerDao gamesmanagerdaos) {
		
		this.gamesmanagerdaos = gamesmanagerdaos;
	}

	@Override
	public void add(Games game) {
		if (game.getFiyat()>50) {
			System.out.println("Ürün eklendi : "+game.getIsim());
			
			this.gamesmanagerdaos.add(game);
		}else {
			System.out.println("Ürün eklenmedi : "+game.getIsim());
		}
		
	}

	@Override
	public void upDate(Games game) {
		System.out.println(" güncel fiyattýr"+game.getFiyat());
		
	}

	@Override
	public void delete(Games game) {
		System.out.println("ürün silindi :"+ game.getFiyat());
		
	}

}
