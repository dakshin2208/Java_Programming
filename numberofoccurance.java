package javasample;

import java.util.Scanner;

public class numberofoccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the series of number:");
        int n = in.nextInt();
        System.out.print("enter the number to find out from the series:");
        int findout = in.nextInt();
        int count = 0;
        while (n>0)
        {
            int rem = n%10;
            if(rem==findout){
                count++;
            }
            n =n/10;
        }
        System.out.println("the number of occourance in the series:"+count);

    }
}
