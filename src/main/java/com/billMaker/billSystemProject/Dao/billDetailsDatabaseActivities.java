package com.billMaker.billSystemProject.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.billMaker.billSystemProject.TableClasses.Bill_details;

public interface billDetailsDatabaseActivities extends JpaRepository<Bill_details, Integer> {

	@Modifying
	@Transactional
	@Query(value="{call bill_details(:vehicle,:receiver,:receiver_ad,:receiver_gst,:pkg,:unit,:booking,:advance,:gst,:total,:receiver_st,:userid)}",nativeQuery=true)
	public void storeBillDetails(
			@Param("vehicle") String vehicle, @Param("receiver") String receiver,
			@Param("receiver_ad") String receiver_ad, @Param("receiver_gst") String receiver_gst, @Param("pkg") int pkg,
			@Param("unit") int unit, @Param("booking") double booking, @Param("advance") double advance,
			@Param("gst") double gst, @Param("total") double total, @Param("receiver_st") String receiver_st,
			@Param("userid") int userid);
	
	@Query(value="select * from bill_details where user_id=:user and bill_number in (select MAX(bill_number) from bill_details where user_id=:user)" , nativeQuery = true)
	public Bill_details getBill(@Param("user") int user);
	
	public List<Bill_details> findAllByUser(int user_id);

}
