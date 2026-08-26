package OOPS.access;

// Press alt + insert
// navigate to override methods
// see all methods provided by the Object class [all classes are subclass of Object class]
public class ObjectDemo {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
