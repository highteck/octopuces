package model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import model.DataParent;

@Entity
@Table (name = "contact")

public class Contact extends DataParent
{
	public static final String NOM_ID = "con_id";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = NOM_ID)
	private Integer id = null;
	
	@Column (name = "con_zip")
	@NotNull
	private String zip = null;
	
	@Column (name = "con_city")
	@NotNull
	private String city = null;
	
	@Column (name = "con_phone")
	@NotNull
	private String phone = null;
	
	@Column (name = "con_email")
	@NotNull
	private String email = null;
	
	@OneToOne (fetch=FetchType.LAZY)
	@JoinColumn(name = "reg_id")
	@NotNull
	private Region reg = null;
	
	/*Constructor*/
	
	public Contact (String zip, String city, String phone, String email, Region reg)
	{
		
		this.zip= zip;
		this.city= city;
		this.phone= phone;
		this.email= email;
		this.reg =reg;
		
	}

	public Integer getId() {
		return id;
	}

	public String getZip() {
		return zip;
	}

	public String getCity() {
		return city;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

	public Region getReg_id() {
		return reg;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setReg_id(Region reg) {
		this.reg = reg;
	}
	
	
	
	
	
	
}//end
