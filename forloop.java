package javasample;

public class forloop {
    public static void main(String[] args) {
        int divisiblebythree = 0;

        for (int i=1;i<=100;i+=1)
        {
            if(i%3==0 && i%5==0){
                System.out.println("divisible by both 3 and 5:"+i);
            divisiblebythree ++;
        }



            }

        System.out.println("total 5 number :" + divisiblebythree);
    }
}
