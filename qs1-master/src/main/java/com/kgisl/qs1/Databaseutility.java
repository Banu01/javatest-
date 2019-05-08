package com.kgisl.qs1;

// import java.sql.ResultSet;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
 
// import org.apache.commons.dbcp2.BasicDataSource;
// import javax.sql.DataSource;

// // import com.mysql.jdbc.Connection;
// // import com.mysql.jdbc.PreparedStatement;

// import org.apache.commons.dbcp2.BasicDataSource;

// /**
//  * Databaseutility
//  */
// public class Databaseutility {

   
        
// private static BasicDataSource  dataSource;

// private static BasicDataSource getDataSource()
// {
//     if(dataSource == null)
//     {
//         BasicDataSource data=new BasicDataSource();
//         data.setUrl("jdbc:mysql://localhost:3306//table");
//         data.setUsername("root");
//         data.setPassword("");
//         dataSource=data;
//         return dataSource;

//     }
//         return dataSource;
// }

//     public static void main(String[] args)throws SQLException {
//         try{
//             BasicDataSource bb=Databaseutility.getDataSource();
//             Connection connection=bb.getConnection();
//             PreparedStatement ps=connection.prepareStatement("select * from anu");

//             System.out.println("data"+connection.getClass());
//             try{
//                 ResultSet rs=ps.executeQuery();
//                 while(rs.next())
//                 {
//                     System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getInt(3));
//                 }
            
//             }
        
    
//             catch(Exception e)
//             {
// connection.rollback();
//                 System.out.println(e);
            
//             }
//         }
//             }
//         }
        
        








    



// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
 
// import org.apache.commons.dbcp2.BasicDataSource;
 
 
// public class DataBaseUtility
// {
//     private static BasicDataSource dataSource;
 
//     private static BasicDataSource getDataSource()
//     {
 
//         if (dataSource == null)
//         {
//             BasicDataSource ds = new BasicDataSource();
//             ds.setUrl("jdbc:mysql://localhost/test");
//             ds.setUsername("root");
//             ds.setPassword("password");
 
 
//             ds.setMinIdle(5);
//             ds.setMaxIdle(10);
//             ds.setMaxOpenPreparedStatements(100);
 
//             dataSource = ds;
//         }
//         return dataSource;
//     }
 
//     public static void main(String[] args) throws SQLException
//     {
 
//         try {
//             BasicDataSource dataSource = getDataSource();
//                 Connection connection = dataSource.getConnection();
//                 PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM account");)
//         {
// System.out.println("The Connection Object is of Class: "+connection.getClass());
//             try (ResultSet resultSet = pstmt.executeQuery());
//             {
//                 while (resultSet.next())
//                 {
//                     System.out.println(resultSet.getString(1) + "," + resultSet.getString(2) + "," + resultSet.getString(3));
//                 }
//             }
//         }
//             catch (Exception e)
//             {
//                 connection.rollback();
//                 e.printStackTrace();
//             }
//         }
//     }
 
// }