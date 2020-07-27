import java.util.*;
import java.io.*;
public class happy
{
   public static void main(String args[])
  {
    int n=0;
     double sum=0;
    Scanner sc=new Scanner(System.in);
     System.out.println("entr n");
    n=sc.nextInt();
    String number = String.valueOf(n);
for (int i = 0; i < number.length(); i++) {
    int j = number.charAt(i)/10;
    sum=sum+Math.pow(j, 2);
    System.out.println(sum);
   }
}
}