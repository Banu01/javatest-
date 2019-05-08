


package com.kgisl.qs1;

// import java.sql.Connection;
// import java.sql.ResultSet;
// import java.sql.SQLException;

// import com.mysql.jdbc.Statement;
// import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

// /**
//  * DataSourceExample
//  */
// public class DataSourceExample {

//     Connection con=null;
//     MysqlDataSource my=new MysqlDataSource();


//     //constructor
//     DataSourceExample()
//     {
//         my.setServerName("localhost");
//         my.setPortNumber(3306);
//         my.setDatabaseName("banu");
//         my.setUser("root");
//         my.setPassword(" ");
//     }
//     public static void main(String[] args) {
//      display();
//      insert();
//        // void update();
//         delete();
        
//     }
//     public void display()throws SQLException
//     {
//         DataSourceExample dd=new DataSourceExample();
// Connection con=dd.CreateConnection();
// Statement stmt=con.createStatement();
// String query="select * from anu";
// ResultSet rs=stmt.executeQuery(query);
// while(rs.next())
// {
//     System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
// }
// rs.close();
// con.close();
// stmt.close();


//     }
//     public void insert() throws SQLException
//     {
// String query="insert into anu values(1,'uma',23)";
// System.out.println("insert working"+query);
// DataSourceExample dsexample=new DataSourceExample();
// Connection con=dsexample.createConnection();
// Statement stmt=con.createStatement();
// int count=stmt.executeUpdate(query);
// System.out.println(count);
// stmt.close();
// con.close();

//     }
//     public void delete() throws SQLException 
//     {
//         String query="delete from anu where id=1";
//         System.out.println("delete query"+query);
//         DataSourceExample dsexample=new DataSourceExample();
//         Connection con=dsexample.createConnection();
//         Statement stmt=con.createStatement();
//         int delete=stmt.executeUpdate(query);
//         System.out.println("delete counting:"+delete);
//         stmt.close();
      
//     }

//     private Connection createConnection()
//     {
// Connection con=null;
// try{
//     con=my.getConnection();

// }catch(Exception e)
// {
//    System.out.println(e.toString()); 
// }
// return con;
//     }
// }

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

/**
* DataSourceExample
*/
public class DataSourceExample {
   Connection connection = null;
   // BasicDataSource bdSource = new BasicDataSource();
   MysqlDataSource bdSource = new MysqlDataSource();

   DataSourceExample() {
       // Set dataSource Properties

       // bdSource.setDriverClassName("com.mysql.jdbc.Driver");
       // bdSource.setUrl("jdbc:mysql://localhost:3306/banuuma");
       // bdSource.setUsername("root");
       // bdSource.setPassword("");

       bdSource.setServerName("localhost");
       bdSource.setPortNumber(3306);
       bdSource.setDatabaseName("banuuma");
       bdSource.setUser("root");
       bdSource.setPassword("");

   }

   public static void main(String[] args) throws SQLException {
       display();
       delete();
       display();
       insert();
       display();
       update();
       display();
   }

   public static void display() throws SQLException {
       DataSourceExample dsExample = new DataSourceExample();
       Connection con = dsExample.createConnection();
       Statement stmt = con.createStatement();
       String query = "SELECT * FROM student";
       ResultSet rs = stmt.executeQuery(query);
       while (rs.next()) {
           System.out.println("Name- " + rs.getString("Name") + ", RollNo- " + rs.getInt("RollNo") + ", Dept- "
                   + rs.getString("Dept") + ", College- " + rs.getString("College"));
       }
       rs.close();
       stmt.close();
       con.close();

   }

   public static void insert() throws SQLException {
       String query = "insert into student values ('Gone Fishing', 3001, 'IT', 'KITE')";
       System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
       DataSourceExample dsExample = new DataSourceExample();
       Connection con = dsExample.createConnection();
       Statement stmt = con.createStatement();
       int countInserted = stmt.executeUpdate(query);
       System.out.println(countInserted + " records inserted.\n");

       stmt.close();
       con.close();
   }

   public static void delete() throws SQLException {
       String query = "delete from student where RollNo =3001";
       System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
       DataSourceExample dsExample = new DataSourceExample();
       Connection con = dsExample.createConnection();
       Statement stmt = con.createStatement();
       int countDeleted = stmt.executeUpdate(query);
       System.out.println(countDeleted + " records deleted.\n");

       stmt.close();

   }

   public static void update() throws SQLException {
       String query = "update student set Name='banuuma' where RollNo =1001";
       System.out.println("\nThe SQL statement is: " + query + "\n"); // Echo for debugging
       DataSourceExample dsExample = new DataSourceExample();
       Connection con = dsExample.createConnection();
       Statement stmt = con.createStatement();
       int countDeleted = stmt.executeUpdate(query);
       System.out.println(countDeleted + " records updated.\n");

       stmt.close();

   }

   private Connection createConnection() {
       Connection con = null;
       try {

           con = bdSource.getConnection();
       } catch (Exception e) {
           System.out.println("Error Occured " + e.toString());
       }
       return con;
   }
}