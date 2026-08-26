package OOPS.A0005OOPS;

public class Main {

    public static void main(String[] args) {
        Son s = new Son();
        s.freedom();
        s.friends();
        System.out.println();

        Daughter d = new Daughter();
        d.freedom();
        d.friends();
        System.out.println();

        Parent p = new Parent(){
            @Override
            void freedom() {}

            @Override
            void friends() {}
        };
        p.say();
        Parent.staticSay();
        System.out.println();
    }
}
