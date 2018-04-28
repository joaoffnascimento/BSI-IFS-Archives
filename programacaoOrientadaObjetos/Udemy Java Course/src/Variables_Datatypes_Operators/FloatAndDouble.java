package Variables_Datatypes_Operators;

import java.util.Scanner;

public class FloatAndDouble {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        /*
        //width of int = 32 (4 bytes).
        int myIntValue = 5 / 3;

        //width of float = 32 (4 bytes).
        float myFloatValue = 5f/3f;

        //width of double = 64 (8 bytes).
        double myDoubleValue = 5d/3d;

        System.out.println("Int = " + myIntValue + "\nfloat = " + myFloatValue + "\ndouble = "+myDoubleValue);
        */
        //Challenge

        byte flag = 0;

        double numberOfPounds =  0;
        double kilograms = 0;
        do {
            System.out.println("Enter the number of pounds: ");
            numberOfPounds = read.nextDouble();
            kilograms = numberOfPounds  * 0.45359237d;
            System.out.println("Result = "+kilograms+" KG");
            System.out.println("Next try?  1 = yes | 0 = no");
            flag = read.nextByte();
        } while (flag != 0);

        //use the underscore to set more clear the visualization of a bigger number.


    }
}
