import java.util.Scanner;

class Bubblesort {

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
        bubbleSort(arr);
        System.out.println("Array AFTER Sorting");
        printArray(arr);
    }
    static void bubbleSort(int[] array)
    {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < (n - i - 1); j++)
            {
                if (array[j] > array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }

            }
        }

    }
    static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
}
