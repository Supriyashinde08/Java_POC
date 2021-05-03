package e_commerce.poc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category")
public class CatgEnty {
	
	@Id
	@Column(name="catg_id")
	int catg_id;
	
	@Column(name="catg_name")
	String catg_name;
	
	@Column(name="catg_desc")
	String catg_desc;
	
	public CatgEnty() {
		
	}

	public CatgEnty(int catg_id, String catg_name, String catg_desc) {
		super();
		this.catg_id = catg_id;
		this.catg_name = catg_name;
		this.catg_desc = catg_desc;
	}

	public int getCatg_id() {
		return catg_id;
	}

	public void setCatg_id(int catg_id) {
		this.catg_id = catg_id;
	}

	public String getcatg_name() {
		return catg_name;
	}

	public void setcatg_name(String catg_name) {
		this.catg_name = catg_name;
	}

	public String getcatg_desc() {
		return catg_desc;
	}

	public void setcatg_desc(String catg_desc) {
		this.catg_desc = catg_desc;
	}

	@Override
	public String toString() {
		return "CatgEnty [catg_id=" + catg_id + ", catg_name=" + catg_name + ", catg_desc="
				+ catg_desc + "]";
	}
	
	

}
