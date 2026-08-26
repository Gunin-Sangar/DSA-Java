package OOPS.A0005OOPS;

public abstract class Parent {
    String name;
    int age;

    abstract void freedom();
    abstract void friends();

    public void say(){
        System.out.println("I'm a Parent");
    };

    public static void staticSay(){
        System.out.println("I'm a Parent static");
    };

}
