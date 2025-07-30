package prac1;
import java.util.Scanner;
public class Prg2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of apples with Tom: ");
        int tom = sc.nextInt();
        System.out.print("Enter number of apples with Jerry: ");
        int jerry = sc.nextInt();
        System.out.println("Before swapping:");
        System.out.println("Tom has "+tom+" apples");
        System.out.println("Jerry has "+jerry+" apples");
        int temp = tom;
        tom = jerry;
        jerry = temp;
        System.out.println("After swapping:");
        System.out.println("Tom has " + tom + " apples");
        System.out.println("Jerry has " + jerry + " apples");
        sc.close();
    }
}



