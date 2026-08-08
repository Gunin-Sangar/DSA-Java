package OOPS.A003OOPS;

// inheritance
public class Main {
    public static void main(String[] args) {
        Box nullBox = new Box();
        Box cube = new Box(5);
        Box Box = new Box(2,3,4);
        Box oldBox = new Box(cube);
        BoxWieght boxWeight = new BoxWieght(2,3,4,20);

//        nullBox.display();
//        cube.display();
//        Box.display();
//        oldBox.display();
        boxWeight.display();

    }
}
