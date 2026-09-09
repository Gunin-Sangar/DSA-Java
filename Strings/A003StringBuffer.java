package Strings;

public class A003StringBuffer {
    public static void main(String[] args) {
        Learning();
    }

    static void Learning(){
        // class java.lang.StringBuffer
        // Thread safe   ( all methods are synchronized )
        // Efficient (Slower than StringBuilder)
        // Mutable!!!


        // StringBuffer sb = new StringBuffer("InitValue");
        // StringBuffer sb = new StringBuffer(30);  capacity - 30
        StringBuffer sb = new StringBuffer();
        sb.append("Great");       // Great
        sb.deleteCharAt(1); // Geat
        sb.delete(1,3);           // Gt
        sb.append("3 Porsche 911");       // Gt3 Porsche 911"   sb.length()-15

        // The end indices are included
        sb.replace(4,15,"Skyline");       // Gt3 Skyline"   sb.length()-11

        // class java.lang.String
        String s = sb.toString();
        System.out.println(s);

        // The end indices are included
        System.out.println("s.substring(4,11) : " + s.substring(4,11));
        System.out.println("sb.length()       : " + sb.length());


        sb.insert(4,"Porsche ");
        System.out.println(sb.toString());

        sb.reverse();
        System.out.println(sb.toString());
    }
}
