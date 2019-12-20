package pojos;

public class Person {
	String firstName;
	String lastName;
	String email;
	String password;
	String dayOfBirth;
	String monthOfBirth;
	String yearOfBirth;
	String address;
	String city;
	String state;
	String zipCode;
	String mobile;
	String alias;

	public Person(String firstName, String lastName, String email, String password, String dayOfBirth,
			String monthOfBirth, String yearOfBirth, String address, String city, String state, String zipCode,
			String mobile, String alias) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.mobile = mobile;
		this.alias = alias;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}
	

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public String getMonthOfBirth() {
		return monthOfBirth;
	}

	public String getYearOfBirth() {
		return yearOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAlias() {
		return alias;
	}

	public String toString() {

		return getFirstName() + " " + getLastName() + "\n" + getAddress() + "\n" + getCity() + ", " + getState() + " "
				+ getZipCode() + "\n" + "United States" + "\n" + getMobile();
	}

}
