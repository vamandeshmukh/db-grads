package com.db.solid.intSub.standard;

interface Rbi {
	// common for all banks in India
}

interface RetailBanking {
	void acceptDeposits();
}

class DB implements Rbi { // investment bank

}

class SBI implements Rbi, RetailBanking {

	@Override
	public void acceptDeposits() {
		// TODO Auto-generated method stub
	} // retail bank

}

public class BankDemo {

}
