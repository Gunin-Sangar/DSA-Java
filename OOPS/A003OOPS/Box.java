package OOPS.A003OOPS;

// inheritance
public class Box {
    double l;
    double w;
    double h;

    public Box() {
        this.l = 0;
        this.w = 0;
        this.h = 0;
    }

    // cube
    public Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

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
