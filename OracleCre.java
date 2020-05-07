import java.sql.*;  
class OracleCre
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
stmt.executeQuery("create table student(sid number(20),sname varchar2(30),saddress varchar2(20))");  
  System.out.println("table created......");
  
//step5 close the connection object  
con.close();  
}  
}  