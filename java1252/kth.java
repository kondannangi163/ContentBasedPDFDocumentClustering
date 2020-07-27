import java.util.*;
public class kth
{
   public static void main(String args[])
  { 
    int k;
    int[] a=new int[10];
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter array elements");
    for(int i=0;i<11;i++)
    {
        a[i]=sc.nextInt();
        System.out.println(a[i]);
    }
    
    System.out.println("Enter the kth term (smallest)");
    int k=sc.nextInt();
    min=a[0];
  
   for(int i=0;i<11;i++)
    {
       if(min>a[i])
        {
           min=a[i];
        } 
     }       
    
    
 }
}