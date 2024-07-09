package javasample;

import javax.xml.namespace.QName;

public class functions {
    public static void main(String[] args) {
        String personalaized = greet("dakshin kumar");
        System.out.println(personalaized);
    }
    static String greet(String name)
    {
        String message ="hello "+ name;
        return message;
    }






}
