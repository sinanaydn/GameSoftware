package gameSoftware.entities.concretes;

import gameSoftware.entities.abstracts.Entity;

public class Games implements Entity {
	
	private String isim;
	private int fiyat;
	public Games(String isim, int fiyat) {
		
		this.isim = isim;
		this.fiyat = fiyat;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public int getFiyat() {
		return fiyat;
	}
	public void setFiyat(int fiyat) {
		this.fiyat = fiyat;
	}
}
