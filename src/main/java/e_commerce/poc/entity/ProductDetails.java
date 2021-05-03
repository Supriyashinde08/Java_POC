package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product_items")
public class ProductDetails {
	
	@Id
	@Column(name="prod_id")
	int prod_id;
	
	@Column(name="catg_id")
	int catg_id;
	
	@Column(name="prod_name")
	String prod_name;
	
	@Column(name="available_qty")
	int available_qty;
	
	@Column(name="prod_image")
	String prod_image;
	
	public ProductDetails() {
		
	}

	public ProductDetails(int prod_id, int catg_id, String prod_name, int prod_count, String prod_image) {
		super();
		this.prod_id = prod_id;
		this.catg_id = catg_id;
		this.prod_name = prod_name;
		this.available_qty = prod_count;
		this.prod_image = prod_image;
	}

	public int getProd_id() {
		return prod_id;
	}

	public void setProd_id(int prod_id) {
		this.prod_id = prod_id;
	}

	public int getCatg_id() {
		return catg_id;
	}

	public void setCatg_id(int catg_id) {
		this.catg_id = catg_id;
	}

	public String getProd_name() {
		return prod_name;
	}

	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}

	public int getProd_count() {
		return available_qty;
	}

	public void setProd_count(int prod_count) {
		this.available_qty = prod_count;
	}

	public String getProd_image() {
		return prod_image;
	}

	public void setProd_image(String prod_image) {
		this.prod_image = prod_image;
	}

	@Override
	public String toString() {
		return "ProductDetails [prod_id=" + prod_id + ", catg_id=" + catg_id + ", prod_name=" + prod_name
				+ ", prod_count=" + available_qty + ", prod_image=" + prod_image + "]";
	}
	
	

}
