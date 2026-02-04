package InstanceBlocks;

public class InstanceBlocks {

    int i =0;
    {
        System.out.println("inside instance block "+i);
        i=3;
    }
    int j=2;
    {
        i=4;
    }
    public InstanceBlocks(){
        System.out.println("inside constructor "+j);
        i=5;
    }
    public static void main(String[] args){
        InstanceBlocks obj = new InstanceBlocks();
        System.out.println("inside main "+obj.i);
    }
}
