package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class CustomerDetails {

	@Id
	@Column(name="cust_id")
	int cust_id;
	
	@Column(name="cust_name")
	String custname;
	
	@Column(name="dob")
	String dob;
	
	@Column(name="cust_email")
	String cust_email;
	
	@Column(name="phone_no")
	int phone_no;
	
	@Column(name="cust_password")
	String cust_password;
	
	@Column(name="Cust_joiningDate")
	String Cust_joiningDate;
	
	public CustomerDetails() {
		
	}
	
	/*public CustomerDetails(int cust_id, String cust_name, String dob, String cust_email, int phone_no,
			String cust_password, String Cust_joiningDate) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.dob = dob;
		this.cust_email = cust_email;
		this.phone_no = phone_no;
		this.cust_password = cust_password;
		this.Cust_joiningDate = Cust_joiningDate;
	}*/

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public String getCust_name() {
		return custname;
	}

	public void setCust_name(String cust_name) {
		this.custname = cust_name;
	}

	public String getdob() {
		return dob;
	}

	public void setdob(String dob) {
		this.dob = dob;
	}

	public String getCust_email() {
		return cust_email;
	}

	public void setCust_email(String cust_email) {
		this.cust_email = cust_email;
	}

	public int getphone_no() {
		return phone_no;
	}

	public void setphone_no(int phone_no) {
		this.phone_no = phone_no;
	}

	public String getCust_password() {
		return cust_password;
	}

	public void setCust_password(String cust_password) {
		this.cust_password = cust_password;
	}

	public String getCust_joiningDate() {
		return Cust_joiningDate;
	}

	public void setCust_joiningDate(String Cust_joiningDate) {
		this.Cust_joiningDate = Cust_joiningDate;
	}

	@Override
	public String toString() {
		return "CustomerDetails [cust_id=" + cust_id + ", cust_name=" + custname + ", dob=" + dob
				+ ", cust_email=" + cust_email + ", phone_no=" + phone_no + ", cust_password=" + cust_password
				+ ", Cust_joiningDate=" + Cust_joiningDate + "]";
	}
	
	
}
