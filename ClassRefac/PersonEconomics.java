package ClassRefac;

public class PersonEconomics {
	private int salary;
	private int assetValue;
	private int creditScore;
	
	PersonEconomics(int sal,int assetValue, int creditScore){
		this.salary = sal;
		this.assetValue = assetValue;
		this.creditScore = creditScore;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAssetValue() {
		return assetValue;
	}
	public void setAssetValue(int assetValue) {
		this.assetValue = assetValue;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	
}
