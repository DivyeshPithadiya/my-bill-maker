package com.billMaker.billSystemProject.Service;

import java.util.List;

import com.billMaker.billSystemProject.TableClasses.Bill_details;
import com.billMaker.billSystemProject.TableClasses.Users;


public interface Services 
{
	
	//================ User Methods ====================//
	
	public Users signUp(Users s);
	
	public Users getUser(String email,String password);
	
	public Long getAuthResponse(String email,String password);
	
	public Users updateUser(Users u);
	
	//================ User Methods ====================//

	
	
	//================ Bill Methods ====================//
	
	public Integer storeBillDetails(String vehicle,String receiver,String receiver_ad,String receiver_gst,int pkg,int unit,double booking,double advance,double gst,double total,String receiver_st,int userid );
	
	public Integer deleteBill(int bill_id);
	
	public List<Bill_details> AllBills(int user_id);
	
	public Bill_details updateBill(Bill_details b);
	
	//================ Bill Methods ====================//
	
	
	

}
