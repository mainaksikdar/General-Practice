package ConditionalStatements;

public class NestedTernary {
    public static void main(String[] args) {
        int A=30, B=10, C=20;
        int biggest = (A>B)? ((A>C)?A:C):((B>C)?B:C);
        System.out.println("Biggest is "+biggest);
    }
}
