package javasample;

public class problem {
    public static void main(String[] args) {
        int num = 123;
        int result = count(num);
        System.out.println(result);

    }
    static int count (int num){
        int count =0;
        while(num>0){
            num= num/10;
            count = count + 1;
        }
        return count;

    }
}
