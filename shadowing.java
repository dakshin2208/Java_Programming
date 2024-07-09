package javasample;

public class shadowing {
    static int x= 90;
    public static void main(String[] args) {
        System.out.println(x);
        int x =49;
        System.out.println(x);
        uf();


    }
    static void uf()
    {
        System.out.println(x);
    }

}
