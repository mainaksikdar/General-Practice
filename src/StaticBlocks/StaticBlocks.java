package StaticBlocks;

public class StaticBlocks {
    static int i=1;
    static {
        System.out.println("inside static block "+i);
    }
    static int j=4;
    static {
        j=2;
        i =2;
    }

    public static void main(String[] args){
        System.out.println("inside main "+i+" , "+j);
    }
}
