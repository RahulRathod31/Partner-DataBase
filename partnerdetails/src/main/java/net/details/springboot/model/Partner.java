package net.details.springboot.model;



import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
@Table(name="partner")
@SpringBootApplication
public class Partner {


	

	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	@Column(name="corp_entity_id")
    private long corp_entity_id;
	
	
	@Column (name="companyNname")
	private String companyName;
	
	
	@Column (name="address")
	private String address;
	
	@Column (name="city")
	private String city;
	
	@Column (name="pincode")
	private int pincode;
	
	@Column (name="cin")
	private String cin;
	
	@Column (name="pan")
	private String pan;
	
	@Column (name="gstNo")
	private String gstNo;
	
	@Column (name="rmId")
	private String rmId;
	
	@Column (name="mobileNumber")
	private String mobileNumber;
	
	@Column (name="emailId")
	private String emailId;
	
	@Column (name="officeaLndlineNo")
	private String officeLandlineNo;
	
	@Column (name="identity")
	private String identity;
	
	@Column (name="status")
	private String status;
	
	@Column (name="makerid")
	private String makerId;
	
	@JsonFormat(pattern ="yyyy/MM/dd")
	@Column (name="maker_Date")
	private String makerDate;
	
	@Column (name="authoriserid")
	private String authoriserId;
	
	@JsonFormat(pattern ="yyyy/MM/dd")
	@Column (name="authoriserDate")
	private String authoriserDate;
	
	@Column (name="typeOfComponay")
	private String typeOfCompany;
	
	
	public Partner() {
		
	}


	public Partner(long id,long corp_entity_id, String companyName, String address, String city, int pincode, String cin,
			String pan, String gstNo, String rmId, String mobileNumber, String emailId, String officeLandlineNo,
			String identity, String status, String makerId, String makerDate, String authoriserId, String authoriserDate,
			String typeOfCompany) {
		super();
		this.id=id;
		this.corp_entity_id = corp_entity_id;
		this.companyName = companyName;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.cin = cin;
		this.pan = pan;
		this.gstNo = gstNo;
		this.rmId = rmId;
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
		this.officeLandlineNo = officeLandlineNo;
		this.identity = identity;
		this.status = status;
		this.makerId = makerId;
		this.makerDate = makerDate;
		this.authoriserId = authoriserId;
		this.authoriserDate = authoriserDate;
		this.typeOfCompany = typeOfCompany;
	}

	public long getCorp_entity_id() {
		return corp_entity_id;
	}

	public void setCorp_entity_id(long corp_entity_id) {
		this.corp_entity_id = corp_entity_id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getGstNo() {
		return gstNo;
	}

	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}

	public String getRmId() {
		return rmId;
	}

	public void setRmId(String rmId) {
		this.rmId = rmId;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getOfficeLandlineNo() {
		return officeLandlineNo;
	}

	public void setOfficeLandlineNo(String officeLandlineNo) {
		this.officeLandlineNo = officeLandlineNo;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMakerId() {
		return makerId;
	}

	public void setMakerId(String makerId) {
		this.makerId = makerId;
	}

	public String getMakerDate() {
		return makerDate;
	}

	public void setMakerDate(String makerDate) {
		this.makerDate = makerDate;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getAuthoriserId() {
		return authoriserId;
	}

	public void setAuthoriserId(String authoriserId) {
		this.authoriserId = authoriserId;
	}

	public String getAuthoriserDate() {
		return authoriserDate;
	}

	public void setAuthoriserDate(String authoriserDate) {
		this.authoriserDate = authoriserDate;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}
	
	
	
	

}
