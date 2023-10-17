package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connection.ConnectionDAL;
import com.utils.Users;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Users>user=new ArrayList<Users>();
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");

		String email=request.getParameter("email");

		String city=request.getParameter("city");

		//user.add(new Users(name,pass,email,city));
//		user.add(new Users("XYZ","xyz","xyz@gmail.com","xyz"));
//		user.add(new Users("GHI","ghi","ghi@gmail.com","ghi"));
		// Register JDBC driver
		PreparedStatement stmt = null;
		String insertdata="insert into users values(?,?,?,?)";
		ConnectionDAL dal=new ConnectionDAL();
		Connection conn=dal.getConnection();
		
		try {
			stmt=conn.prepareStatement(insertdata);
			stmt.setString(1,name);
			stmt.setString(2,pass);
			stmt.setString(3,email);
			stmt.setString(4,city);
			int a=stmt.executeUpdate();
			if(a>0) {
				response.getWriter().println("User registered successfully");
				for(Users u:user)
				{
					System.out.println(u.getUsername()+" "+u.getEmail()+" "+u.getCity());
				}
			}
			else {
				System.out.println("Something Went Wrong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//System.out.println(user);
//		System.out.println("The name is "+user.);

		

//		for(Users u:user)
//		{
//			System.out.println(u.getUsername()+" "+u.getEmail()+" "+u.getCity());
//		}
//		
//		response.getWriter().println("User registered successfully");
		
	}

	

}
