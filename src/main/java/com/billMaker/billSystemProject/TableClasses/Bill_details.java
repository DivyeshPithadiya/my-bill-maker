package com.billMaker.billSystemProject.TableClasses;

import javax.persistence.*;

@Entity
@Table(name="bill_details")

/*
@NamedStoredProcedureQueries //Stored Procedure For table Bill_details
(
		{
			@NamedStoredProcedureQuery
			(
					name="store_bill_details",
					procedureName ="bill_details",
					parameters=
					{
						@StoredProcedureParameter(mode=ParameterMode.IN,name="vehicle",type=String.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="receiver",type=String.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="receiver_ad",type=String.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="receiver_gst",type=String.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="pkg",type=Integer.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="unit",type=Integer.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="booking",type=Double.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="advance",type=Double.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="gst",type=Double.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="total",type=Double.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="receiver_st",type=String.class),
						@StoredProcedureParameter(mode=ParameterMode.IN,name="userid",type=Integer.class)
											
					}
			) 	
		}
)

*/
public class Bill_details {

	@Id
	@GeneratedValue
	private int bill_number;

	private String vehicle_number;

	private String receiver_name;

	private String receiver_address;

	private String receiver_gst_number;

	private int number_of_pkg;

	private double price_per_unit;

	private double booking_amount;

	private double advance_amount;

	private double gst;

	private double total;

	@Column(name="billData")
	private String billData;

	private String receiver_state;

	@Column(name="user_id")
	private int user;

	public Bill_details(int bill_number, String vehicle_number, String receiver_name, String receiver_address,
			String receiver_gst_number, int number_of_pkg, double price_per_unit, double booking_amount,
			double advance_amount, int user_id, double gst, double total, String billData, String receiver_state) {
		super();
		this.bill_number = bill_number;
		this.vehicle_number = vehicle_number;
		this.receiver_name = receiver_name;
		this.receiver_address = receiver_address;
		this.receiver_gst_number = receiver_gst_number;
		this.number_of_pkg = number_of_pkg;
		this.price_per_unit = price_per_unit;
		this.booking_amount = booking_amount;
		this.advance_amount = advance_amount;
		this.user = user_id;
		this.gst = gst;
		this.total = total;
		this.billData = billData;
		this.receiver_state = receiver_state;
	}

	@Override
	public String toString() {
		return "Bill_details [bill_number=" + bill_number + ", vehicle_number=" + vehicle_number + ", receiver_name="
				+ receiver_name + ", receiver_address=" + receiver_address + ", receiver_gst_number="
				+ receiver_gst_number + ", number_of_pkg=" + number_of_pkg + ", price_per_unit=" + price_per_unit
				+ ", booking_amount=" + booking_amount + ", advance_amount=" + advance_amount + ", user_id=" + user
				+ ", gst=" + gst + ", total=" + total + ", billData=" + billData + ", receiver_state=" + receiver_state
				+ "]";
	}

	public Bill_details() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBill_number() {
		return bill_number;
	}

	public void setBill_number(int bill_number) {
		this.bill_number = bill_number;
	}

	public String getVehicle_number() {
		return vehicle_number;
	}

	public void setVehicle_number(String vehicle_number) {
		this.vehicle_number = vehicle_number;
	}

	public String getReceiver_name() {
		return receiver_name;
	}

	public void setReceiver_name(String receiver_name) {
		this.receiver_name = receiver_name;
	}

	public String getReceiver_address() {
		return receiver_address;
	}

	public void setReceiver_address(String receiver_address) {
		this.receiver_address = receiver_address;
	}

	public String getReceiver_gst_number() {
		return receiver_gst_number;
	}

	public void setReceiver_gst_number(String receiver_gst_number) {
		this.receiver_gst_number = receiver_gst_number;
	}

	public int getNumber_of_pkg() {
		return number_of_pkg;
	}

	public void setNumber_of_pkg(int number_of_pkg) {
		this.number_of_pkg = number_of_pkg;
	}

	public double getPrice_per_unit() {
		return price_per_unit;
	}

	public void setPrice_per_unit(double price_per_unit) {
		this.price_per_unit = price_per_unit;
	}

	public double getBooking_amount() {
		return booking_amount;
	}

	public void setBooking_amount(double booking_amount) {
		this.booking_amount = booking_amount;
	}

	public double getAdvance_amount() {
		return advance_amount;
	}

	public void setAdvance_amount(double advance_amount) {
		this.advance_amount = advance_amount;
	}

	public int getUser_id() {
		return user;
	}

	public void setUser_id(int user_id) {
		this.user = user_id;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getBillData() {
		return billData;
	}

	public void setBillData(String billData) {
		this.billData = billData;
	}

	public String getReceiver_state() {
		return receiver_state;
	}

	public void setReceiver_state(String receiver_state) {
		this.receiver_state = receiver_state;
	}

}
