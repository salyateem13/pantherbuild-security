package gsu.cis4280.security.pantherbuildsecurity.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name = "USER")
public class User implements Serializable {
 
	private static final long serialVersionUID = -3009157732242241606L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
 
	@Column(name = "UserName")
	private String userName;
 
	@Column(name = "FirstName")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;

	@Column(name = "AddressLine1")
	private String address;
	
	@Column(name = "City")
	private String city;
	
	@Column(name = "State")
	private String state;
	
	@Column(name = "ZipCode")
	private int zipCode;
	
	@Column(name = "securityQuestionID")
	private String securityQuestionID;
	
	@Column(name = "SecurityQuestionAnswer")
	private String securityQuestionAnswer;
	
	@Column(name = "isAdmin")
	private boolean isAdmin;
	 
 
 
	protected User() {
	}
 
	public User(String UserName, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public User(long id, String userName, String firstName, String lastName, String address, String city, String state,
			int zipCode, String securityQuestionID, String securityQuestionAnswer, boolean isAdmin) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.securityQuestionID = securityQuestionID;
		this.securityQuestionAnswer = securityQuestionAnswer;
		this.isAdmin = isAdmin;
	}
 
	@Override
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getSecurityQuestionID() {
		return securityQuestionID;
	}

	public void setSecurityQuestionID(String securityQuestionID) {
		this.securityQuestionID = securityQuestionID;
	}

	public String getSecurityQuestionAnswer() {
		return securityQuestionAnswer;
	}

	public void setSecurityQuestionAnswer(String securityQuestionAnswer) {
		this.securityQuestionAnswer = securityQuestionAnswer;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}