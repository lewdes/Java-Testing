package com.lew.designpattern;

/**
 * @author lew
 *
 */
public class Contact {
	String firstName;
	String lastName;
	String email;
	long phone;

	public Contact() {

	}

	public Contact(ContactBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.phone = builder.phone;
	}

	public static class ContactBuilder {
		String firstName;
		String lastName;
		String email;
		long phone;

		public ContactBuilder() {

		}

		public ContactBuilder name(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
			return this;
		}

		public ContactBuilder email(String email) {
			this.email = email;
			return this;
		}

		public ContactBuilder phone(long phone) {
			this.phone = phone;
			return this;
		}

		public Contact build() {
			return new Contact(this);
		}
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phone=" + phone
				+ "]";
	}

}
