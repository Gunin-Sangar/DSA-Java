package OOPS.interfaces.extendDemo;

public interface A {
    // gives an implementation -> scope of problem
    default void foo(){
        System.out.println("Default implementation");
    }

    // no issue
    void hoo();
}
