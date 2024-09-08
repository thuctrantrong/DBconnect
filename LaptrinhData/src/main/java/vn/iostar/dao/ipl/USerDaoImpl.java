package vn.iostar.dao.ipl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import vn.iostar.configs.DBconnect;
import vn.iostar.dao.iuserdao;
import vn.iostar.model.Usermodel;

public class USerDaoImpl extends DBconnect implements iuserdao {

	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<Usermodel> findAll(){
		String sql = "select * from Table_1";
		List<Usermodel> list = new ArrayList<>();
		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
		while (rs.next()) {
			String userId = rs.getString("id");
            String username = rs.getString("username");
            String password = rs.getString("password");
            String imagines = rs.getString("imagines");
            String fullname = rs.getString("fullname");
            Usermodel user = new Usermodel(userId,username,password,imagines,fullname);
	        list.add(user);
		}
		
		}catch(Exception e) {
			
		}
		
		return list; 
	}

	@Override
	public Usermodel findById(int id) {
		String findsql = "select * from Table_1 where id = ?";			
		Usermodel user = null ; 
		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(findsql);
			ps.setInt(1, id);
			rs = ps.executeQuery();

			while (rs.next()) {
				 String userId = rs.getString("id");
                 String username = rs.getString("username");
                 String password = rs.getString("password");
                 String imagines = rs.getString("imagines");
                 String fullname = rs.getString("fullname");
				user = new Usermodel(userId,username,password,imagines,fullname);
			}
		} catch (Exception e) {
			
		}
		return  user ;  
	}

	@Override
	public void insert(Usermodel user) {

		String insertsql = "INSERT INTO Table_1 (id, username, password, imagines, fullname) VALUES (?, ?, ?, ?, ?);";
		try {
			conn = super.getConnection();
			ps = conn.prepareStatement(insertsql);
			ps.setString(1, user.getId());   
			ps.setString(2, user.getUsername());         
            ps.setString(3, user.getPassword());    
            ps.setString(4, user.getImagines());        
            ps.setString(5, user.getFullname());
			
            ps.executeUpdate();

            System.out.println("User inserted successfully!");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	 public static void main(String[] args) {
		 USerDaoImpl usdi = new USerDaoImpl();
		 Usermodel user = new Usermodel("3", "Thuc", "123", "", "Tran Trong Thuc"); 
		 usdi.insert(user);
		 Usermodel userfind = usdi.findById(3);
		 if (userfind != null)
		 {
			 System.out.println("User found: " + userfind.toString());
		 }
		 else 
		 {
			 System.out.println("User not found");
		 }
		 
		 List<Usermodel> list = usdi.findAll();
		 for (Usermodel userlist : list) {
	            System.out.println(userlist);
	        }
		 
	    }

}