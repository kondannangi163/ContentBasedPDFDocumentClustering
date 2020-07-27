public class Stringpla{
public static void main(String args[]){
    String srev=" ";
    String s="Shilpa";
    for(int i=s.length();i<=0;i--)
     {
       srev=srev+s.charAt(i);
     }
     if(srev.equals(s))
     {
        System.out.println("Pallindrome");
     }
     else{
         System.out.println("Not pallindrome");
       }
   }
}
         