package prac1;
import java.util.Scanner;
public class Prg5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        {
            System.out.println(ch+" is an Alphabet");
        }
        else
        {
            System.out.println(ch+" is not an Alphabet");
            sc.close();
        }
    }
}
