package javasample;

import java.util.Scanner;

public class nestedswitch {
    public static void main(String[] args) {
        Scanner kavi = new Scanner(System.in);
        System.out.print("enter the roll no:");
        int rollno=kavi.nextInt();
        System.out.print("enter the department:");
        String department = kavi.next();
        switch (rollno)
        {
            case 14:
                System.out.println("kavi rithanya");
                break;
            case 99:
                System.out.println("ashmitha");
                break;
            case 17:
                System.out.print("you are looking for :");
                System.out.println("dakshin kumar");

                switch(department)
            {
                case "ai&ds":

                    System.out.println("resgister no:23102011");
                    break;
                case "it":
                    System.out.println("resigester no:23102021");
                    break;
            }

        }
    }
}
