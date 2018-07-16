package countingtiles;

public class CountingTiles
{
    static void printCompositions(int arr[], int n, int i)
    {
        if (n == 0)
        {
            printArray();
        }
        else if(n > 0)
        {
            for (int k = 1; k <= 3; k++)
            {
                arr[i]= k;
                printCompositions(arr, n-k, i+1);
            }
        }
    }
     static long c = 0;
    static void printArray()
    {
        c++;
    }
     
    public static void main (String[] args) 
    {
        int n = 20;
        int size = 100;
        int[] arr = new int[size];
        printCompositions(arr, n, 0);
        System.out.println(c);
        
    }
}