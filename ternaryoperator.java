package javasample;

import java.util.Scanner;

public class ternaryoperator {
    public static void main(String[] args) {
//        boolean rain = true;
//        String result = rain?"take an umbrella":"enjoi the sun light";
//        System.out.println(result);
//    }
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String result = a>b?"a is greater ":"b is  greater";
        System.out.println(result);
    }
}