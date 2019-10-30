import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number to check");
        int lastDigit,sum=0,a;
        int inputNumber=sc.nextInt();
        a=inputNumber;
        while(a>0)
        {
            lastDigit=a%10;
            sum=(sum*10)+lastDigit;
            a=a/10;

        }
        if(sum==inputNumber)
            System.out.println("Number is palindrome ");
        else
            System.out.println("Number is not palindrome");

    }

}
