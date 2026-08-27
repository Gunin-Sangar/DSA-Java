package OOPS.interfaces.extendDemo;

public class Main implements A, B{

    // implementing foo() here ... therefore no error rn
    // but if foo() not implemented -> confusion will occur to implement foo() from A or B -> hence compile error
    @Override
    public void foo() {
        // using implementation from a particular interface
        A.super.foo();
    }

    @Override
    public void hoo() {
        System.out.println();
    }
}

/*
------------------------------------------------------------------
Default keyword logic -> backwards compatibility (before java 8)
------------------------------------------------------------------

interface Animal {
    void eat();
}


class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats");
    }
}
--------------------------------------------------------------------------------------------------
Suddenly every existing implementation of Animal breaks, because Dog must now implement sleep().
That's a huge problem for Java's backward compatibility. in below code
--------------------------------------------------------------------------------------------------

interface Animal {
    void eat();
    void sleep();  // new method
}

--------------------
which is solved by
--------------------

interface Animal {
    void eat();

    default void sleep() {
        System.out.println("Animal sleeps");
    }
}
-----------------------------------------------------------------------
we dont break stuff and code can still be scaled with lesser problems
-----------------------------------------------------------------------
 */
