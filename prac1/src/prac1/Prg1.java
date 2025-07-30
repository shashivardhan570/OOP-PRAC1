package prac1;
import java.util.Scanner;
public class Prg1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter actual bill: ");
        int ab = sc.nextInt();
        System.out.print("Enter maintenance charges: ");
        int mc = sc.nextInt();
        System.out.print("Enter GST charges: ");
        int gstc = sc.nextInt();
        double discount;
        int tb; 
        double finalBill; 
        tb = ab + mc + gstc;
        if(ab > 1000)
        {
            discount = (tb * 0.10); 
        } 
        else
        {
            discount = (tb * 0.05); 
        }
        finalBill = tb - discount;
        System.out.println("Actual Bill           : " + ab);
        System.out.println("Maintenance Charges   : " + mc);
        System.out.println("GST Charges           : " + gstc);
        System.out.println("Total Before Discount : " + tb);
        System.out.println("Discount Applied      : " + discount);
        System.out.println("Final Bill To Pay     : " + finalBill);
        sc.close();
    }
    
}

