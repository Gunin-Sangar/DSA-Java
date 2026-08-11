package OOPS.A003OOPS.inheritance;

// inheritance
public class Main {
    public static void main(String[] args) {
        Box nullBox = new Box();
        Box cube = new Box(5);
        Box Box = new Box(2,3,4);
        Box oldBox = new Box(cube);
        BoxWeight boxWeight = new BoxWeight(2,3,4,20);

//        nullBox.display();
//        cube.display();
//        Box.display();
//        oldBox.display();
//        boxWeight.display();


        // Changing reference and actual object
        /*
        Box box = new Box(); calls Box() constructor
        BoxWeight boxWeight = new BoxWeight(); calls Box() -> BoxWeight() constructor
        Box boxchild = new BoxWeight(); calls Box() -> BoxWeight() constructor

        so all variables gets initialized. the problem arises when something is missed
        which happens in this case:
        BoxWeight boxparent = new Box(2,3,4);
        This is NOT valid because new Box(2,3,4) creates a Box object,
        but the reference variable requires a BoxWeight object.
        A parent object cannot be assigned to a child reference.
        So the BoxWeight() constructor is not "missed".
        It is never called because the statement itself causes a compile-time error.
         */

        // The reference type decides what you can access; the actual object type decides what object was actually created.
        // parent reference with child obj
        Box boxchild = new BoxWeight(2,3,4,50);
        boxchild.display();

        // child reference with parent obj
        // This throws an error -> Why -> no variable named weight was created. as BoxWeight() was not called.
        // BoxWeight boxparent = new Box(2,3,4);
        // boxchild.display();

    }
}
