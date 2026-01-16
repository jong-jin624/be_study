package be_study.quiz.quiz50;

import java.util.List;

public class CustomerDTO {
	
	int id;
	String name;
	
//	String contacts;
//	String[] type; // email, phone
//	String[] value; // "john.doe@example.com", "01023456789"
	
//	만약 타입변수가 여러개면 contacts_type, address_type
	
//	Contact[] contacts;
	List<Contact> contacts; // contactList
	
//	String street;
//	String city;
//	String zipcode;
//	어드레스 객체 생성 배열 x List x
	Address address;
	
	List<Order> orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "CustomerDTO [id=" + id + ", name=" + name + ", contacts=" + contacts + ", address=" + address
				+ ", orders=" + orders + "]";
	}
	
	
}
