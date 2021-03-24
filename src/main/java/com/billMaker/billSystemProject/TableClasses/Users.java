package com.billMaker.billSystemProject.TableClasses;
import javax.persistence.*;

@Entity
public class Users {

	  @Id
	  @GeneratedValue
	private int user_id;

	private String company_name;

	private String company_address;

	private String mobile_number;

	private String gst_number;

	private String bank_name;

	private String ac_number;

	private String rtgs_number;

	private double loading_charges;

	private double godown_charges;

	private double unioin_charges;

	private double other_charges;

	@Column(name="email_id")
	private String email;

	private String password;
	
	private String company_state;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Users(int user_id, String company_name, String company_address, String mobile_number,
			String gst_number, String bank_name, String ac_number, String rtgs_number, double loading_charges,
			double godown_charges, double unioin_charges, double other_charges, String email_id, String password, String company_state) {
		super();
		this.user_id = user_id;
		this.company_name = company_name;
		this.company_address = company_address;
		this.mobile_number = mobile_number;
		this.gst_number = gst_number;
		this.bank_name = bank_name;
		this.ac_number = ac_number;
		this.rtgs_number = rtgs_number;
		this.loading_charges = loading_charges;
		this.godown_charges = godown_charges;
		this.unioin_charges = unioin_charges;
		this.other_charges = other_charges;
		this.email = email_id;
		this.password = password;
		this.company_state = company_state;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_address() {
		return company_address;
	}

	public void setCompany_address(String company_address) {
		this.company_address = company_address;
	}

	public String getCompany_state() {
		return company_state;
	}

	public void setCompany_state(String company_state) {
		this.company_state = company_state;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getGst_number() {
		return gst_number;
	}

	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getAc_number() {
		return ac_number;
	}

	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}

	public String getRtgs_number() {
		return rtgs_number;
	}

	public void setRtgs_number(String rtgs_number) {
		this.rtgs_number = rtgs_number;
	}

	public double getLoading_charges() {
		return loading_charges;
	}

	public void setLoading_charges(double loading_charges) {
		this.loading_charges = loading_charges;
	}

	public double getGodown_charges() {
		return godown_charges;
	}

	public void setGodown_charges(double godown_charges) {
		this.godown_charges = godown_charges;
	}

	public double getUnioin_charges() {
		return unioin_charges;
	}

	public void setUnioin_charges(double unioin_charges) {
		this.unioin_charges = unioin_charges;
	}

	public double getOther_charges() {
		return other_charges;
	}

	public void setOther_charges(double other_charges) {
		this.other_charges = other_charges;
	}

	public String getEmail_id() {
		return email;
	}

	public void setEmail_id(String email_id) {
		this.email = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", company_name=" + company_name + ", company_address=" + company_address
				+ ", mobile_number=" + mobile_number + ", gst_number=" + gst_number + ", bank_name=" + bank_name
				+ ", ac_number=" + ac_number + ", rtgs_number=" + rtgs_number + ", loading_charges=" + loading_charges
				+ ", godown_charges=" + godown_charges + ", unioin_charges=" + unioin_charges + ", other_charges="
				+ other_charges + ", email_id=" + email + ", password=" + password + ", company_state="
				+ company_state + "]";
	}



	
	

}
