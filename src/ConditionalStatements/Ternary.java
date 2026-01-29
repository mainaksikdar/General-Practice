package ConditionalStatements;

public class Ternary {
    public static void main(String[] args) {
        int N=99,count=0;

        for(int i=2;i<=N/2;i++) {
            count+= N%i==0 ? 1 :0;
        }
        System.out.println(count==0?"Prime":"Not a prime");
    }
}
