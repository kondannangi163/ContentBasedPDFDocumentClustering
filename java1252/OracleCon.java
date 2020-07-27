import java.sql.*;  
class OracleCon{  
public static void main(String args[]){  
try{  

Class.forName("oracle.jdbc.driver.OracleDriver");  
  
//step2 create  the connection object  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
  
Statement stmt=con.createStatement();  
  
  
ResultSet rs=stmt.executeQuery("select * from student");  
while(rs.next())  
System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
con.close();  
  
}catch(Exception e){ System.out.println(e);}  
  
}  
}  