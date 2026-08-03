package OOPS.A002OOPS.StaticMeaning1;

// btw outside classes cant be static || because it is not dependent on any other class
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once when the 1st obj is created || when the class is loaded for the first time
    static {
        b = a *5;
        System.out.println("In static block");
    }

    public static void main(String[] args) {
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
