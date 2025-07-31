package org.example;

import static java.lang.System.out;

public class Main {
    // instance variable declaration
    int instanceBinary = 0b101101;
    int instanceOctal = 072;
    double instanceDouble = 1234.95;

    // static declaration
    static int staticHex = 0x1A2B;
    static byte staticByte = (byte) 1;
    static String staticString = "Progress, not perfection.";

    public static void main(String[] args) {
    // local declaration
        int localDecimal = 100;
        int localHex = 0xFF;
        int localBinary = 0b1101;
        int localOctal = 014;
        long localLong = 1_000_0000L;
        String localString = "Every step I take gets me closer to my goal.";

    // Local variables
        out.println("Local Variables: ");
        out.println("  localDecimal: " + localDecimal);
        out.println("  localHex: " + localHex);
        out.println("  localBinary: " + localBinary);
        out.println("  localOctal: " + localOctal);
        out.println("  localLong: " + localLong);
        out.println("  localString " + localString);

    // Instance variables
        out.println("Intsance Variables: ");
        out.println("  instanceBinary: " + new Main().instanceBinary);
        out.println("  instanceOctal: " + new Main().instanceOctal);
        out.println("  instanceDouble: " + new Main().instanceDouble);
    
    // Static variables
        out.println("Static Variables: ");
        out.println("  staticHex: " + staticHex);
        out.println("  staticByte: " + staticByte);
        out.println("  staticString: " + staticString);
    }
}