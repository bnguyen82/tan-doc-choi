package com.csc.ipos;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcCustomerDAO extends JdbcDaoSupport{
	public void insert(Customer customer) {
		 
		String sql = "INSERT INTO CUSTOMER " +
			"(CUST_ID, NAME, AGE) VALUES (?, ?, ?)";
		getJdbcTemplate().update(sql,new Object[]{customer.getCustId(),customer.getName(), customer.getAge()});
	}
	public List searchByName(String name) {
		String sql = "SELECT * FROM CUSTOMER";
		MyResultSetExtractor rse = new MyResultSetExtractor();
//		getJdbcTemplate().query(sql,new Object[]{name}, rse);
		getJdbcTemplate().query(sql, rse);
		return rse.getTotalList();
	}

}
class MyResultSetExtractor implements ResultSetExtractor {
	List totalList = new  ArrayList();
	public List getTotalList() {
		return totalList;
	}
	public Object extractData(ResultSet rs) throws SQLException,
			DataAccessException {
		// TODO Auto-generated method stub
		while (rs.next()){
			List list = new ArrayList();
	
			list.add(rs.getInt(1));
			list.add(rs.getString(2));
			list.add(rs.getInt(3));
			totalList.add(list);
		}	
		return totalList;
	}
}
