package com.company;

public class TypeCasting {

    public static void main(String[] args) {
        // Implicit Type Casting
        System.out.println("Implicit type Casting ");
        int x = 7;
        long y = x;
        float z = y;
	    System.out.println("Before Conversion, int value " +x);
        System.out.println("After Conversion, long value " +y);
        System.out.println("After Conversion, float value " +z);

        System.out.println("\n");
        // Explicit Type Casting
        System.out.println("Explicit Type Casting");
        double d = 166.66;
        long l = (long)d;
        int i = (int)l;
        System.out.println("Before Conversion: "+d);
        System.out.println("After Conversion into long type: "+l);
        System.out.println("After Conversion into int type: "+i);
    }
}

