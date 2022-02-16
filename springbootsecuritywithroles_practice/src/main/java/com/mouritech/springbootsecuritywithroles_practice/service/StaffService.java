package com.mouritech.springbootsecuritywithroles_practice.service;


import java.util.List;

import com.mouritech.sprinbootsecuritywithroles_practice.exception.StaffNotFoundException;
import com.mouritech.springbootsecuritywithroles_practice.entity.Staff;



public interface StaffService {
	Staff insertStaff(Staff newStaff);

	Staff showStaffById(Long stafid) throws StaffNotFoundException;

	List<Staff> showAllStaffs();



	Staff updateStaffById(Long stafid, Staff Staff) throws StaffNotFoundException;

	void deleteStaffById(Long stafid) throws StaffNotFoundException;

	Staff updateSalaryById(Long staffid, Staff Staff) throws StaffNotFoundException;

	
}