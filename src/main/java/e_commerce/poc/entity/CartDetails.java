package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class CartDetails {

	@Id
	@Column(name="c__id")
	int c__id;
	
	@Column(name="cust_id")
	int cust_id;
	
	@Column(name="prod__id")
	int prod__id;
	
	@Column(name="c_qty")
	int c_qty;
	
	public CartDetails() {
		
	}

	public CartDetails(int c__id, int cust_id, int prod__id, int c_qty) {
		super();
		this.c__id = c__id;
		this.cust_id = cust_id;
		this.prod__id = prod__id;
		this.c_qty = c_qty;
	}

	public int getc__id() {
		return c__id;
	}

	public void setc__id(int c__id) {
		this.c__id = c__id;
	}

	public int getCust_id() {
		return cust_id;
	}

	public void setCust_id(int cust_id) {
		this.cust_id = cust_id;
	}

	public int getprod__id() {
		return prod__id;
	}

	public void setprod__id(int prod__id) {
		this.prod__id = prod__id;
	}

	public int getc_qty() {
		return c_qty;
	}

	public void setc_qty(int c_qty) {
		this.c_qty = c_qty;
	}

	@Override
	public String toString() {
		return "CartDetails [c__id=" + c__id + ", cust_id=" + cust_id + ", prod__id=" + prod__id
				+ ", c_qty=" + c_qty + "]";
	}
	
	
}
