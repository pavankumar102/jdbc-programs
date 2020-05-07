import java.sql.*;  
class OracleUp
{  
public static void main(String args[]) throws Exception
{  
//step1 load the driver class  
Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
  
//step3 create the statement object  
Statement stmt=con.createStatement();  
  
//step4 execute query  
//String sql = "UPDATE Registration " +
                   //"SET age = 30 WHERE id in (100, 101)";
    //  stmt.executeUpdate(sql);

stmt.executeQuery("update student set sname='chintu' where sid in (123,124)");  
  System.out.println("row modified......");
  
//step5 close the connection object  
con.close();  
}  
}  