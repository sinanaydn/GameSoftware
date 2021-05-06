package gameSoftware.entities.concretes;

import gameSoftware.entities.abstracts.Entity;

public class User  implements Entity{
	private String firstName;
	private String lastName;
	private String identity;
	public User(String firstName, String lastName, String identity) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.identity = identity;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
}
