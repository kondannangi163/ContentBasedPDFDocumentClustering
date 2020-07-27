import java.util.*;
public class String2 {
      public static void main(String args[]){
    	 Scanner sc=new Scanner(System.in);
    	 String s1="shilpa         ";
    	
    	 String s2="ananya ";
    	
    	
    	 	for (int i = 0; i < s1.length(); i++) {
    	 		for (int j = 0; j < s2.length(); j++){
    	 			if(s2.charAt(0) != s1.charAt(s1.length())){
    	 				 s1=s1+s2.charAt(i);
    	 			}
    	 			else{
    	 				for( j = 1; j < s2.length(); j++ ){
    	 					s1=s1+s2.charAt(j);
    	 				}
    	 			}
    	 		}
    	 	}
    	 	
    	 	System.out.println(s1);
    	 	sc.close();
      }
}
