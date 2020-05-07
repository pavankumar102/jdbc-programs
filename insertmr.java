import java.sql.*; 
import java.util.*;
public class insertmr
{  
public static void main(String args[]) throws Exception
{  
//String sqlq="create table students(id int,name varchar(20),branch varchar(20),college varchar(20))"; 
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
Statement st=con.createStatement();   
Scanner sc=new Scanner(System.in);
while(true)
{
System.out.println("Enter student id");
int id=sc.nextInt();
System.out.println("Enter student name");
String name=sc.next();
System.out.println("Enter student branch");
String branch=sc.next();
System.out.println("Enter student college");
String college=sc.next();
String sqlq=String.format("insert into stud values(%d,'%s','%s','%s')",id,name,branch,college);
st.executeUpdate(sqlq);
con.commit();
System.out.println("record inserted successfully");
System.out.println("Do you want to insert more records Y/N");
String choice=sc.next();
if(choice.equalsIgnoreCase("N"))
{
break;
}

}  
}  
}