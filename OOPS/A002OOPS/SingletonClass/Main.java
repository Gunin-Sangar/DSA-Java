package OOPS.A002OOPS.SingletonClass;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        // all ref var are same and will return true
        System.out.println(obj1 == obj2);
        System.out.println(obj2 == obj3);
        System.out.println(obj1 == obj3);
    }
}
