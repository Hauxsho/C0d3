import java.util.Scanner;

class SelectionSort {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[50];
        int i;
        System.out.println("Enter No. of Elements in Array");
        int n=sc.nextInt();
        System.out.println("Enter Elements");
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        selection(arr);
        System.out.println("After Sorting");
        printArray(arr);
    }

    public static void selection(int[] array)
    {
        for (int i = 0; i < array.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[j] < array[index])
                {
                    index = j;
                }
            }
            int smallerNumber = array[index];
            array[index] = array[i];
            array[i] = smallerNumber;
        }
    }
    static void printArray(int[] array){

        for(int i=0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }

}
