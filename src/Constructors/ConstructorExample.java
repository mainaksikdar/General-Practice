package Constructors;

class Sample {
    public int i = 10;
    public int getValue() {
        return i;
    }
}
public class ConstructorExample {

    public static void main(String[] args){
        Sample s = new Sample();
        System.out.println(s.getValue());
    }
}
