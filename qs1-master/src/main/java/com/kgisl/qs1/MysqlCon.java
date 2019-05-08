package com.kgisl.qs1;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


class MysqlCon{  
public static void main(String args[]){  
try{  
//Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/banu","root","");  
//here banu is database name, root is username and password  
Statement stmt=con.createStatement();  
ResultSet rs=stmt.executeQuery("select * from anu");  
//ResultSet rs=stmt.exexcuteUpdate("insert into anu values(5,'uma',21)");
while(rs.next())  
System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
con.close();  
}catch(Exception e)
{ 
    System.out.println(e);}  
}  
}  