package javasample;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
//        System.out.print("enter the number:");
//        int a = input.nextInt();
//        if(a%2==0){
//            System.out.println("its even ");
//        }
//        else{
//            System.out.println("its odd");
//        }
//        System.out.println("enter the number:");
//        int a = input.nextInt();


//    int count =1;
//    while(count <5){
//        System.out.println(count);
//        count ++;}

//        for (int count=0;count<5;count++)
//        {
//            System.out.println(count);
//        }
        System.out.print("enter the temperature in celcus");
        float tempc = input.nextInt();
        float temp=(tempc * 9/5)+32;
        System.out.println("the celcus in fahernhite :"+temp);



 }

}

