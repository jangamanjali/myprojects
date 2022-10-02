package com.dao;

import java.sql.SQLException;
import java.util.List;

import com.entity.Insurance;

public interface InsuranceDao {
	
	public List<Insurance>viewInsuranceDetails() throws ClassNotFoundException, SQLException;
	public void insertInsuranceDetails(Insurance i) throws ClassNotFoundException, SQLException;
	public void updateInsurance(Insurance i) throws ClassNotFoundException, SQLException;
    public void deleteInsurance(Insurance i) throws ClassNotFoundException, SQLException;

}
