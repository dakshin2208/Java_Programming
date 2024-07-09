package javasample;

import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        System.out.print("enter the name:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("enter the roll no :");
        int rollno = input.nextInt();
        System.out.println("the name and rollno that you are entered :" );
        System.out.println("the name ="+ name);
        System.out.println("the roll no :"+ rollno);

    }
}




