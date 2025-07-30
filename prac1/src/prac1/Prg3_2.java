package prac1;
import java.util.Scanner;
public class Prg3_2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n: ");
        int n = sc.nextInt();
        for (int i = 1;i <= n;i++)
        {
            double root = 0;
            double j = 1;
            while (j * j <= i)
            {
                root = j;
                j = j + 0.0001;
            }
            root = Math.round(root * 100.0) / 100.0;
            System.out.println("Square root of "+i+" is "+root);
            sc.close();
        }
    }
}
