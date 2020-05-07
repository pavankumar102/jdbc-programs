import java.sql.*;  
class OracleInser
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
stmt.executeQuery("insert into student values(124,'aazar','hyd')");  
  System.out.println("row inserted......");
  
//step5 close the connection object  
con.close();  
}  
}  