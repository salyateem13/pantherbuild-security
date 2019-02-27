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
	
	@Column (name = "Password")
	private String password;
	
	@Column (name ="Enabled")
	private boolean enabled;
 
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
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "securityQuestionID")
	private String securityQuestionID;
	
	@Column(name = "SecurityQuestionAnswer")
	private String securityQuestionAnswer;
	
	@Column(name = "Role")
	private String role;
	 
 
 
	protected User() {
	}
 
	public User(String UserName, String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	public User(long id, String password, boolean enabled, String userName, String firstName, String lastName,
			String address, String city, String state, int zipCode, int email, String securityQuestionID,
			String securityQuestionAnswer, String role) {
		super();
		this.id = id;
		this.password = password;
		this.enabled = enabled;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.securityQuestionID = securityQuestionID;
		this.securityQuestionAnswer = securityQuestionAnswer;
		this.role = role;
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
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
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

	public String getRole() {
		return role;
	}

	public void setAdmin(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}