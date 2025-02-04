package com.example.form;

import java.util.Date;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * 従業員情報更新時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class UpdateEmployeeForm {
	/** id */
	private String id;
	/** 従業員名 */
	@NotBlank(message = "{validation.employeeName.notBlank}")
	@Length(max=20, message="{validation.employeeName.maxLength}")
	private String name;
	/** 性別 */
	private String gender;
	/** 入社日 */
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private Date hireDate;
	/** メールアドレス */
	@Length(max=50, message="{validation.mailaddress.maxLength}")
	@NotBlank(message = "{validation.mailAddress.notBlank}")
	@Email(message = "{validation.mailAddress.format}")
	private String mailAddress;
	/** 郵便番号 */
	@Pattern(regexp = "[0-9]{3}-[0-9]{4}",message = "{validation.zipCode.format}")
	private String zipCode;
	/** 住所 */
	@Length(max=100, message="{validation.address.maxLength}")
	private String address;
	/** 電話番号 */
	@Pattern(regexp = "^[0-9]{1}[0-9\\-]{11}[0-9]{1}$",message = "{validation.telephone.format}")
	private String telephone;
	/** 給料 */
	@Min(0)
    @Max(1000000)
    @Pattern(regexp = "^[0-9]+$", message = "{validation.salary.format}")
	private String salary;
	/** 特性 */
	@Length(max=500, message="{validation.characteristics.maxLength}")
	private String characteristics;
	/** 扶養人数 */
	@Min(0)
    @Max(10)
	@Pattern(regexp = "^[0-9]+$", message = "{validation.dependentsCount.format}")
	private String dependentsCount;

	/**
	 * IDを数値として返します.
	 * 
	 * @return 数値のID
	 */
	public Integer getIntId() {
		return Integer.parseInt(id);
	}

	public Integer getIntSalaryCount() {
		return Integer.parseInt(salary);
	}
	/**
	 * 扶養人数を数値として返します.
	 * 
	 * @return 数値の扶養人数
	 */
	public Integer getIntDependentsCount() {
		return Integer.parseInt(dependentsCount);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDependentsCount() {
		return dependentsCount;
	}

	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSaraly() {
		return dependentsCount;
	}

	public void setSaraly(String salary) {
		this.salary = salary;
	}

	public String getSalary() {
		return salary;
	}


	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	@Override
	public String toString() {
		return "UpdateEmployeeForm [id=" + id + ", name=" + name + ", gender=" + gender + ", hireDate=" + hireDate
				+ ", mailAddress=" + mailAddress + ", zipCode=" + zipCode + ", address=" + address + ", telephone="
				+ telephone + ", salary=" + salary + ", characteristics=" + characteristics + ", dependentsCount="
				+ dependentsCount + "]";
	}


}
