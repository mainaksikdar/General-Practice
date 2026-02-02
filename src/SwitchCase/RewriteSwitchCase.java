package SwitchCase;

public class RewriteSwitchCase {
    public static void main(String[] args) {
        int N=20;
        switch(N) {
            case 20 -> {
                System.out.println(20);
            System.out.println(20);
            }
            case 10 -> System.out.println(10);
            case 30 -> System.out.println(30);
            default -> System.out.println("Other");

        }

        System.out.println(switch(N){
            case 20 -> "Twenty";
            case 10 -> "Ten";
            case 30 -> "Thirty";
            default -> "Other";
        });

        System.out.println(switch(N){
            case 20 -> {int a =10; int b=20; yield "Twenty "+ (a+b);}
            case 10 -> "Ten";
            case 30 -> "Thirty";
            default -> "Other";
        });
    }
}
