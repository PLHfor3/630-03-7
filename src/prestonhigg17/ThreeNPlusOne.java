package prestonhigg17;



import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class ThreeNPlusOne {
    private static int threeNPlusOne (int n) {
        int count = 1;
        while (n != 1)
        {
            count++;
            if (n == 1) {
                break;
            } else if (n % 2 == 1) {
                n = 3 * n + 1;
            } else {
                n = n / 2;
            }

        }
        return count;
    }
    private static int calc (int i, int j) {
        int maxCycles = 0;
        for (int value = i; value <= j; value++) {
            int cycles = threeNPlusOne(value);
            if (cycles > maxCycles) {
                maxCycles = cycles;
            }
        }
        return maxCycles;

    }
    public static void run () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the minimum value of the data series to be checked:");
        int i = scan.nextInt();
        System.out.println("Please enter the maximum value of the data series to be checked:");
        int j = scan.nextInt();
        int maxCycles = calc(i,j);
        //String test = threeNPlusOneString(i); testing for correct formulas and calculation
        System.out.println("Max Cycles for data series " + i + " - " + j + " is " + maxCycles);
        //System.out.println(test); testing for correct formulas and calculation
    }


//    private static String threeNPlusOneString (int n) {
//        int count = 1;
//        String number = "";
//        while (n != 1)
//        {
//            count++;
//            if (n == 1) {
//                break;
//            } else if (n % 2 == 1) {
//                n = 3 * n + 1;
//                number += " " + n;
//            } else {
//                n = n / 2;
//                number += " " + n;
//            }
//
//        }
//        return number;
//    }


}

