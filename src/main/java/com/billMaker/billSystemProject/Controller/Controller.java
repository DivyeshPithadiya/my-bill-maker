package com.billMaker.billSystemProject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.billMaker.billSystemProject.Service.ServiceImplementation;
import com.billMaker.billSystemProject.TableClasses.Bill_details;
import com.billMaker.billSystemProject.TableClasses.Users;


@CrossOrigin(origins ="https://my-bill-system.herokuapp.com", maxAge = 3600)
@RestController
public class Controller {
	@Autowired
	public ServiceImplementation s;

	// ========================================================

	// API To Store The Details Of User At the Time Of Signup


	
	@PutMapping("/user-details")
	public Users userDetails(@RequestBody Users user) {
		return this.s.signUp(user);
	}

	// ========================================================

	// Get Details Of User After Login

	@GetMapping("/user-details/{email}/{password}")
	public Users allDetails(@PathVariable String email, @PathVariable String password) {
		return this.s.getUser(email, password);
	}

	// ========================================================

	// Get Response That this User is present in Database or not

	
	@CrossOrigin(origins ="https://my-bill-system.herokuapp.com", maxAge = 3600)
	@PostMapping("/user-auth/{email}/{password}")
	public Long Response(@PathVariable String email, @PathVariable String password) {
		return Long.valueOf(this.s.getAuthResponse(email, password));
	}

	// ========================================================

	// Update User's Details

	@PutMapping("/user-update")
	public Users updateUser(@RequestBody Users u) {
		return this.s.updateUser(u);
	}

	// ========================================================

	// Store Bill Details

	@PostMapping("/bill-details/{vehicle}/{receiver}/{receiver_ad}/{receiver_gst}/{pkg}/{unit}/{booking}/{advance}/{gst}/{total}/{receiver_st}/{userid}")
	public Integer storeBill(@PathVariable String vehicle, @PathVariable String receiver,
			@PathVariable String receiver_ad, @PathVariable String receiver_gst, @PathVariable int pkg,
			@PathVariable int unit, @PathVariable double booking, @PathVariable double advance,
			@PathVariable double gst, @PathVariable double total, @PathVariable String receiver_st,
			@PathVariable int userid) {
		 return this.s.storeBillDetails(vehicle, receiver, receiver_ad, receiver_gst, pkg, unit, booking, advance, gst,
				total, receiver_st, userid);
	}
	
	// =========================================================
	
	// Delete Bill
	
	@DeleteMapping("/delete-bill/{bill_id}")
	public int deleteBill(@PathVariable int bill_id)
	{
		return this.s.deleteBill(bill_id);
	}
	
	// =========================================================
	
	//Getting All Bills
	
	@GetMapping("/get-all-bills/{user_id}")
	public List<Bill_details> getAllBills(@PathVariable int user_id)
	{
		return this.s.AllBills(user_id);
	}
	
	// ==========================================================
	
	// Update Bill Details 
	
	@PutMapping("/update-bill")
	public Bill_details updateBill(@RequestBody Bill_details b)
	{
		return this.s.updateBill(b);
	}
	
	

}
