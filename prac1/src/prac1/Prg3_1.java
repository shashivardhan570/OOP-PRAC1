package prac1;
import java.util.Scanner;
public class Prg3_1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        int i = 1;
        while(i <= n)
        {
            double sqrt = Math.sqrt(i);
            System.out.println("Square root of "+i+" is "+sqrt);
            i++;
            sc.close();
        }
    }
}

