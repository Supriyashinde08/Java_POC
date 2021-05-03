package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderDetails {
	
	@Id
	@Column(name="order_id")
	int order_id;
	
	@Column(name="cust_id")
	int cust_id;
	
	@Column(name="addr_id")
	int addr_id;
	
	@Column(name="order_amount")
	int order_amount;
	
	@Column(name="status")
	String status;
	
	@Column(name="order_date")
	String order_date;
	
	public OrderDetails() {
		
	}

	public OrderDetails(int order_id, int cust_id, int addr_id, int order_amount, String status,
			String order_date) {
		super();
		this.order_id = order_id;
		this.cust_id = cust_id;
		this.addr_id = addr_id;
		this.order_amount = order_amount;
		this.status = status;
		this.order_date = order_date;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getAddr_id() {
		return addr_id;
	}

	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	public int getOrder_amount() {
		return order_amount;
	}

	public void setOrder_amount(int order_amount) {
		this.order_amount = order_amount;
	}

	public String getstatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	@Override
	public String toString() {
		return "OrderDetails [order_id=" + order_id + ", cust_id=" + cust_id + ", addr_id=" + addr_id + ", order_amount="
				+ order_amount + ", status=" + status + ", order_date=" + order_date + "]";
	}
	
	

}
