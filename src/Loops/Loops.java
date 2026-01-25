package Loops;

public class Loops {
    public static void main (String[] args) {
        int N = 20;
        int count = 1;
        for(int i=1;i <= N;i++) {
            if(i%7!=0 && i%4!=0) {
                System.out.print(i+" ");
                count++;
            }


            if(count==4) {
                System.out.print("\n");
                count = 1;
            }
        }
    }
}
