package OOPS.A003OOPS.inheritance;

// inheritance
public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        super();
        this.weight = -1;
    }

     BoxWeight(double weight){
        super();
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight){
        //   super.l = l;
        //   super.w = w;
        //   super.h = h;

        // simpler version of above
        super(l,w,h);
        this.weight = weight;
    }

    public BoxWeight(Box old){
        super(old);
        this.weight = -1;
    }

    @Override
    public void display(){
        System.out.printf("Length: %.2f\nWidth: %.2f\nHeight: %.2f\nWeight: %.2f\n\n",this.l,this.w,this.h,this.weight);
    }

    /*
    Does not work as this is a static method in Box class
    @Override
    public void baseClassName(){
        System.out.println("BoxWeight");
    }
    */
}
