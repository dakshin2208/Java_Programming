package javasample;

import java.util.Arrays;

public class methodoverloading {
    public static void main(String[] args) {
        //demo(2,3,4);
        demo("dakshin","kumar");
    }
    static void demo(int...v)
    {
        System.out.println(Arrays.toString(v));
    }
    static void demo(String...v)
    {
        System.out.println(Arrays.toString(v));
    }
}
