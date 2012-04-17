package com.csc.ipos;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class JdbcContactDAO extends JdbcDaoSupport{
	public void insert(){
		String sql = "INSERT INTO RECIPES " +
				"(INGREDIENT) VALUES (?)";
			getJdbcTemplate().update(sql,new Object[]{"bao"});
	}
}
