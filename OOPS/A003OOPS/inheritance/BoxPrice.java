package OOPS.A003OOPS.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice() {
        super();
        this.cost = -1;
    }

    public BoxPrice(double cost) {
        super();
        this.cost = cost;
    }

    public BoxPrice(double l,double w,double h,double weight,double cost) {
        super(l,w,h,weight);
        this.cost = cost;
    }

    public BoxPrice(BoxWeight old) {
        super(old);
    }

    public BoxPrice(BoxPrice old) {
        super(old);
        this.cost = old.cost;
    }

    /*
    Does not work as this is a static method in Box class
    @Override
    public void baseClassName(){
        System.out.println("BoxPrice");
    }
    */
}
