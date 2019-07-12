package ClassRefac;

public class Person {
	private String _name;
	private int _age;
	private TelephoneNumber _telephoneNumber;
	private PersonEconomics personEconomics;
	
	public PersonEconomics getPersonEconomics() {
		return new PersonEconomics(12000,600000,750);
	}
	public String getTelephoneNumber() {
		return "(" + this._telephoneNumber.getOfficeAreaCode() + ") " + this._telephoneNumber.getOfficeNumber(); 
	}
	
	public String getName() {
		return _name;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int _age) {
		this._age = _age;
	}
	
}
