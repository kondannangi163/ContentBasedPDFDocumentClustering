import java.io.*;
import java.util.*;
class happyno
{
public static void main(String args[])throws Exception
{
int i,j;
happyno obj=new happyno();
Scanner sc=new Scanner(System.in);
System.out.print("enter a number : ");
i=sc.nextInt();
while((j=obj.happy(i))/10!=0)       //   You have to check the sum of all digits until a single digit is achieved i.e. sum=1,2,3,..9
{
i=j;				// If sum of digits= 19 it then again goes to 1+9 =10 and again 1+0= '1' a single digit to check if 1 or not
}
if ( j==1)
System.out.println("It is a happy number ");
else
System.out.println("Not a happy number");
}

int happy(int n)
{
if(n/10==0)
return n*n;
else
return (int)Math.pow(n%10,2)+ happy(n/10);
}
}