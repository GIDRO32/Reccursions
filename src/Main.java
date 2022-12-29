import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int sum;
        int equalNum = 9;
        System.out.println("Choose the size of the array");
        n = scan.nextInt();
        int arr[] = new int[n];
        int equality = findCountInArray(arr, equalNum,n);
        System.out.println("Now type any values.");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        printArray(arr, n-1);
        System.out.println("Now let's summarize these values");
        sum = printArraySum(arr, n-1);
        System.out.println("The summary is: " + sum);
        findCountInArray(arr, 9, n-1);
    }
    public static int printArray(int[] array, int n)
    {
        System.out.println(array[n]);
        n = n - 1;
        if(n < 0)
        {
            return n;
        }
        System.out.println(array[n]);
        printArray(array, n-1);
        return n+1;
    }
    public static int printArraySum(int[] array, int n)
    {
        if(n <= 0)
        {
            return array[0];
        }
        else
        {
            return array[n] + printArraySum(array, n-1);
        }
    }
    public static int findCountInArray(int[] array, int what, int n)
    {
        int equality = 0;
        if(array[n] == what)
        {
            equality++;
        }
        return equality;
    }
}