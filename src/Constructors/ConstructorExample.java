package Constructors;

class Sample {
    public int i = 10;
    Sample() {
        i=11;
    }

    Sample(int x) {
        i = x;
    }

    Sample(int i, int j) {
        this.i = i;
    }

    public int getValue() {
        return i;
    }
}
public class ConstructorExample {

    public static void main(String[] args){
        Sample s = new Sample();
        System.out.println(s.getValue());
        s = new Sample(30);
        System.out.println(s.getValue());
        s = new Sample(40,0);
        System.out.println(s.getValue());
    }
}
