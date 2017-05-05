package net.metrosystems.vvv.model;

public class Currency {
	private String currencyName;
	private float currencyAmount;

	
	public Currency(String currencyName, float currencyAmount){
		this.currencyName = currencyName;
		this.currencyAmount = currencyAmount;
	}
	
	public String getCurrencyName() {
		return currencyName;
	}

	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

	public double getCurrencyAmount() {
		return currencyAmount;
	}

	public void setCurrencyAmount(float currencyAmount) {
		this.currencyAmount = currencyAmount;
	}

	
}
