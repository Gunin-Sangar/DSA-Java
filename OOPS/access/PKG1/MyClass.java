package OOPS.access.PKG1;

// Class
public class MyClass {
    // accessible anywhere
    // class + pkg + subclass(same pkg) + subclass(diff pkg) + world
    public String name;

    // class + pkg + subclass(same pkg) + subclass(diff pkg)
    protected int age;

    // class + pkg + subclass(same pkg) [no modifier]
    int experience;

    // only accessible in this class
    private boolean isAlwaysLearning;

    public MyClass(String name, int age, int experience, boolean isAlwaysLearning) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.isAlwaysLearning = isAlwaysLearning;
    }
}


/*
| Modifier    | Same class | Same package | Subclass, different package  | Non-subclass, different package |
| ----------- | ---------- | ------------ | ---------------------------- | ------------------------------  |
| `public`    |          + |            + |                            + |                               + |
| `protected` |          + |            + |                            ++|                                 |
| no modifier |          + |            + |                              |                                 |
| `private`   |          + |              |                              |                                 |

public
→ accessible everywhere

private
→ accessible only inside the declaring class

no modifier (package-private)
→ accessible within the same package

protected
→ same package: accessible
→ different package: accessible from subclass, through a subclass reference
→ rule: In a different package, a subclass can access a protected member through
  an expression whose type is the subclass (or a subclass of it).
*/
