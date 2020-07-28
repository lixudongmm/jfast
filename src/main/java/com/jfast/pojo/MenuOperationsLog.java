package com.jfast.pojo;

import java.io.Serializable;
import java.util.Date;

public class MenuOperationsLog implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menu_operations_log.id
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menu_operations_log.uid
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private String uid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menu_operations_log.phone
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private String phone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menu_operations_log.ip
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private String ip;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menu_operations_log.message
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private String message;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column menu_operations_log.time
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private Date time;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table menu_operations_log
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menu_operations_log.id
	 * @return  the value of menu_operations_log.id
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menu_operations_log.id
	 * @param id  the value for menu_operations_log.id
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menu_operations_log.uid
	 * @return  the value of menu_operations_log.uid
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menu_operations_log.uid
	 * @param uid  the value for menu_operations_log.uid
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public void setUid(String uid) {
		this.uid = uid == null ? null : uid.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menu_operations_log.phone
	 * @return  the value of menu_operations_log.phone
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menu_operations_log.phone
	 * @param phone  the value for menu_operations_log.phone
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menu_operations_log.ip
	 * @return  the value of menu_operations_log.ip
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menu_operations_log.ip
	 * @param ip  the value for menu_operations_log.ip
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menu_operations_log.message
	 * @return  the value of menu_operations_log.message
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menu_operations_log.message
	 * @param message  the value for menu_operations_log.message
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public void setMessage(String message) {
		this.message = message == null ? null : message.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column menu_operations_log.time
	 * @return  the value of menu_operations_log.time
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column menu_operations_log.time
	 * @param time  the value for menu_operations_log.time
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table menu_operations_log
	 * @mbg.generated  Wed Nov 06 14:40:13 CST 2019
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", uid=").append(uid);
		sb.append(", phone=").append(phone);
		sb.append(", ip=").append(ip);
		sb.append(", message=").append(message);
		sb.append(", time=").append(time);
		sb.append("]");
		return sb.toString();
	}
}