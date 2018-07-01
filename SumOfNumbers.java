package sum.of.numbers;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the value of n: ");
        
        int sum = 0, n = in.nextInt();;
        
        for(int i = 1; i <= n; ++i){
            sum += i;
        }
        
        System.out.println("Sum = " + sum);
    }
    
}
