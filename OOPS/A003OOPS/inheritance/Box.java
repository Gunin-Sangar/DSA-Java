package OOPS.A003OOPS.inheritance;

// inheritance
public class Box {
    double l;
    double w;
    double h;

    public Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    // cube
    public Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    // all parameters
    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // using same class obj
    public Box(Box old) {
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }

    public void display(){
        System.out.printf("Length: %.2f\nWidth: %.2f\nHeight: %.2f\n\n",this.l,this.w,this.h);
    }

}
