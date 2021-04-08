package com.billMaker.billSystemProject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billMaker.billSystemProject.Dao.billDetailsDatabaseActivities;
import com.billMaker.billSystemProject.Dao.userDatabaseActivities;
import com.billMaker.billSystemProject.TableClasses.Bill_details;
import com.billMaker.billSystemProject.TableClasses.Users;

@Service
public class ServiceImplementation implements Services {

	@Autowired
	private userDatabaseActivities userDbOperation;

	@Autowired
	private billDetailsDatabaseActivities billDbOperation;



	// ================ User Methods ====================//

	@Override
	public Users signUp(Users s) {
		userDbOperation.save(s);
		userDbOperation.flush();
		return s;
	}

	@Override
	public Users getUser(String email_id, String password) {
		return userDbOperation.findByEmailAndPassword(email_id, password);
	}

	@Override
	public Long getAuthResponse(String email, String password) {
		return Long.valueOf(userDbOperation.countByEmailAndPassword(email, password));
	}

	@Override
	public Users updateUser(Users u) {

		userDbOperation.save(u);
		return u;
	}

	// ================ User Methods ====================//

	// ================ Bill Methods ====================//

	@Override
	public Integer storeBillDetails
	(
			String vehicle, String receiver, String receiver_ad, String receiver_gst,
			int pkg, int unit, double booking, double advance, double gst, double total, String receiver_st,
			int userid
	) 
	{
		try 
		{
			billDbOperation.storeBillDetails(vehicle, receiver, receiver_ad, receiver_gst, pkg, unit, booking, advance, gst, total, receiver_st, userid);	
			return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
		
	}
	
	public Integer deleteBill(int bill_id)
	{
		try 
		{	
			Bill_details b=billDbOperation.getOne(bill_id);
			billDbOperation.delete(b);
			return 1;
		}
		catch(Exception e)
		{
			return 0;
		}
	}

	@Override
	public List<Bill_details> AllBills(int user_id) 
	{
		return billDbOperation.findAllByUser(user_id);
	}

	@Override
	public Bill_details updateBill(Bill_details b) 
	{
		billDbOperation.save(b);
		return b;
	}

	
	
	
	// ================ Bill Methods ====================//

}
