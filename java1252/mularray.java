public class mularray
{
   public static void main(String args[])
  {
    int min=0;
    int[][] a= new int[3][3];
   
    
   a[0][0]= Integer.parseInt(args[0]);
   a[0][1]= Integer.parseInt(args[1]);
   a[0][2]= Integer.parseInt(args[2]);
   
   a[1][0]= Integer.parseInt(args[3]);
   a[1][1]= Integer.parseInt(args[4]);
   a[1][2]= Integer.parseInt(args[5]);
   

   a[2][0]= Integer.parseInt(args[6]);
   a[2][1]= Integer.parseInt(args[7]);
   a[2][2]= Integer.parseInt(args[8]);
   
   min=a[0][0];
  System.out.println("Matrix values are");
   
 for(int i=0;i<=2;i++)
  {
   for(int j=0;j<=2;j++)
   {
      System.out.println(a[i][j]);
    }  
   }
  
  for(int i=1;i<=2;i++)
  {
   for(int j=0;j<=2;j++)
   {
      if(min>a[i][j])
        min=a[i][j];
    }  
   }
  System.out.println("Smallest value:");
 System.out.println(min);

  }
}