import java.io.*;
import java.util.*;
public class exam1{
    
Scanner sc=new Scanner(System.in);
System.out.println("Enter n");
int n=sc.nextInt();
    int a[]=int [n];
for(int i=1;i<n/2;i++)
  {
    for(int j=1;j<=n/2;j++)
      {
       a[j]=a[j]+a[j+1];
      }
  }
  for(int i=n/2;i<=n;i++)
  {
    for(int k=n/2;k<=n;k++)
      {
       a[k]=a[k]+a[k+1];
      }
  }
  if(a[j]==a[k])
  {
   System.out.println("Balanced");
  }
  else
   System.out.println("UnBalanced"); 
}