package skill1;
public class Wideningtypeconversion 
{
    public static void main(String[] args)
    {
        int numInt = 100;
        long numLong = numInt;       
        float numFloat = numLong;    
        System.out.println("Original int value: " + numInt);
        System.out.println("Converted to long: " + numLong);
        System.out.println("Converted to float: " + numFloat);
    }
}
