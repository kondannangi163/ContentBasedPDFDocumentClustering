public class Stringcat{

   public static void main(String args[])
{
     String s="Mark",s1="kate";
	for (int i = 0; i < s1.length(); i++) {
    	            for (int j = 0; j < s.length(); j++) {
           if(s.charAt(s.length()) !=  s1.charAt(0)  )
         {
            s=s+s1.charAt(i);
           System.out.println(s);
         }
        else
          {
            System.out.println(s.concat(s1));
         }
}
}
   }
}