package javasample;

import java.util.Scanner;

public class IFstatement {
    public static void main(String[] args) {
        Scanner ash = new Scanner(System.in);
//        System.out.print("enter your salary :");
//        int salary = 21000;
//        if(salary>20000)
//        {
//            salary=salary+2000;
//        }
//        else {
//            salary=salary+1000;
//        }
//        System.out.print("salary updated:"+salary);
//    }

        String rcb = ash.next();
        String win = "win";
        String lose = "lose";
        if (rcb.equals(win)) {
            System.out.println("ee sala cup namthey");
        } else if (rcb.equals(lose)) {
            System.out.println("cup illa");
        }

    }
}
