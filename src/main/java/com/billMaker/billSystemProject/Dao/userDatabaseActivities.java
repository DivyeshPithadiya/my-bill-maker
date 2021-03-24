package com.billMaker.billSystemProject.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.billMaker.billSystemProject.TableClasses.Users;

public interface userDatabaseActivities extends JpaRepository<Users, Integer> 
{
	
	public Users findByEmailAndPassword(String email_id,String password);

	
	public Long countByEmailAndPassword(String email_id,String password);
	

}




