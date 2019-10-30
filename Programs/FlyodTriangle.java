import java.util.Scanner;
class FloydTriangleExample
{
    public static void main(String args[])
    {
       int rows, num = 1, count, j;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows for triangle:");
       rows = sc.nextInt();
       System.out.println("Floyd's triangle");
       for ( count = 1 ; count <= rows ; count++ )
       {
           for ( j = 1 ; j <= count; j++ )
           {
                System.out.print(num+" ");
                num++;
           }
           System.out.println();
       }
   }
}
