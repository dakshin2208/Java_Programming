package javasample;

import java.util.Scanner;

public class operatoionexercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.print("enter the operations to perform :");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("enter number 1:");
                int num1 = in.nextInt();
                System.out.print("enter number 2:");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;

                }
            }else if (op == 'X' || op == 'x') {
                    break;
                }

            else {
                System.out.println("invalid operation !!");
                }



            System.out.println("the answer");
            System.out.println(ans);
        }
    }
}
