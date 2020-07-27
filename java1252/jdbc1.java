import java.sql.*;
public class jdbc1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Connection con=null;

    try{     
    	
    	 Class.forName("oracle.jdbc.driver.OracleDriver");
       con=DriverManager.getConnection(  
    		 "jdbc:oracle:thin:@localhost:1521:xe","system","system");  
     System.out.println("Sucessful");
	
    }catch(Exception e){
		System.out.println(e.getMessage());
		System.out.println("Error connecting");
	}
}
}
