package com.hand.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hand.dao.CustomerDao;
import com.hand.entity.Customer;
public class CustomerDaoImpl implements CustomerDao {

	public void save(Connection conn, Customer cust) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void update(Connection conn, Long id, Customer cust) throws SQLException {
		// TODO Auto-generated method stub

	}

	public void delete(Connection conn, Customer cust) throws SQLException {
		// TODO Auto-generated method stub

	}

	public ResultSet get(Connection conn, Customer cust) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from customer where first_name = ? ");
		ps.setString(1, cust.getFirst_name());		
		return ps.executeQuery();
	}
	public ResultSet get(Connection conn) throws SQLException {
		PreparedStatement ps = conn.prepareStatement("select * from customer ");			
		return ps.executeQuery();
	}
}

