package OOPS.A003OOPS;

// inheritance
public class BoxWieght extends Box{
    double weight;

    BoxWieght(double l,double w,double h, double weight){
        //   super.l = l;
        //   super.w = w;
        //   super.h = h;

        // simpler version of above
        super(l,w,h);
        this.weight = weight;
    }
}
