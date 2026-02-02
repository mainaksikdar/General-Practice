package SwitchCase;

public class SwicthCaseWithString {
    public static void main (String[] args) {
        String s = "Tet";
        switch (s) {
            case "Tes" :
                System.out.println("Tes");
                break;
            case "Tst" :
                System.out.println("Tst");
                break;
            case "Tet" :
                System.out.println("Tet");
                break;
            default:
                System.out.println("Test");
                break;
        }
    }
}
