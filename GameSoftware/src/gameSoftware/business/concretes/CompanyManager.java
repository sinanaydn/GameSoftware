package gameSoftware.business.concretes;

import gameSoftware.business.abstracts.CompanyService;
import gameSoftware.dataAcces.abstracts.CompanyDao;

public class CompanyManager implements CompanyService{
	
	CompanyDao companydao;

	public CompanyManager(CompanyDao companydao) {
		
		this.companydao = companydao;
	}

	@Override
	public void add() {
		
		this.companydao.add();
	}

}
