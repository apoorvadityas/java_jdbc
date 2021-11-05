package com.example.demo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;







@Repository
public class CustomerDAO {

	@Autowired  
    JdbcTemplate jdbc;  
	
	public String authenticate(String user,String pwd) {
		String cmd = "select count(*) cnt from Customer where Cus_UserName=? "
				+ " AND Cus_Password=?";
		List str=jdbc.query(cmd,new Object[] {user,pwd}, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				return rs.getInt("cnt");
			}
			
		});
		return str.get(0).toString();
	}
	
	public Customer[] showCust() {
		String cmd="select * from customer";
		List<Customer> custList = null;
		custList = jdbc.query(cmd, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Customer cust = new Customer();
				cust.setCusId(rs.getInt("CusId"));
				cust.setCusName(rs.getString("CusName"));
				cust.setCusPhnno(rs.getString("CusPhnno"));
				cust.setCusName(rs.getString("CusName"));
				cust.setCusPassword(rs.getString("CusPassword"));
				cust.setCusEmail(rs.getString("CusEmail"));
				return cust;
			}
			
		});
		return custList.toArray(new Customer[custList.size()]);
}
	
	
}
