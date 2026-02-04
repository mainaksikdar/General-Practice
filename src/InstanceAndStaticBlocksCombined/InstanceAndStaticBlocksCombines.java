package InstanceAndStaticBlocksCombined;

public class InstanceAndStaticBlocksCombines {

    static int i =0;
    static {
        System.out.println("inside static block "+i);
        i=5;
    }
    static int j=2;
    static {
        i = 10;
    }
    {
        System.out.println("inside instance block "+i);
        i=15;
    }
    int k=3;

    {
        i = 20;
    }
    public InstanceAndStaticBlocksCombines(){
        System.out.println("inside constructor "+k);
        i=25;
    }
    public static void main(String[] args) {
        System.out.println("inside main "+j);
        InstanceAndStaticBlocksCombines obj = new InstanceAndStaticBlocksCombines();
        System.out.println("inside main after obj creation "+obj.i);

    }
}
