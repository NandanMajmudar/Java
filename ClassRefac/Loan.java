package ClassRefac;

public class Loan {
	public	boolean isEligible(Person person) {

		if(!hasValidSalary(person)) {
			return false;
		}
		if(!hasValidCreditScore(person)) {
			return false;
		}
		if(!hasValidAssetValue(person)) {
			return false;
		}
		if(!hasValidAge(person)) {
			return false;
		}
		return true;
	}
	
	public boolean hasValidSalary(Person person) {
		if(person.getPersonEconomics().getSalary() > 10000) {
			return true;
		}
		return false;
	}
	
	public boolean hasValidCreditScore(Person person) {
		if(person.getPersonEconomics().getCreditScore() > 650) {
			return true;
		}
		return false;
	}
	
	public boolean hasValidAssetValue(Person person) {
		if(person.getPersonEconomics().getCreditScore() > 500000) {
			return true;
		}
		return false;
	}
	public boolean hasValidAge(Person person) {
		if(person.getAge() > 17 && person.getAge() < 66) {
			return true;
		}
		return false;
	}
}
