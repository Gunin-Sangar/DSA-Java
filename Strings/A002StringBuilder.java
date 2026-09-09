package Strings;

public class A002StringBuilder {
    public static void main(String[] args) {
        whySb();
        SB();
        isPalindrome("acbca");
    }

    public static void whySb() {
        // it only looks like O(n) but is O(n^2)
        // as each time a new string obj is created like
        // a, ab, abc, abcd, ... abc-xyz which is like 1+2+3+...N = N(N+1)/2
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch + " ";
        }
        System.out.println(series);
        System.out.println();
    }

    public static void SB() {
        // class java.lang.StringBuilder
        // Not Thread safe   ( no methods are synchronized )
        // Efficient (Faster than StringBuffer)
        // Mutable!!!


        // StringBuilder sb = new StringBuilder("InitValue");
        // StringBuilder sb = new StringBuilder(30);  capacity - 30
        StringBuilder series = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series.append(ch).append(" ");
        }
        System.out.println(series);
        System.out.println();
    }

    public static void isPalindrome(String s) {
        String s1 = s.toLowerCase();
        boolean isPalindrome = true;
        for (int i = 0; i < s1.length()/2; i++) {
            if(s1.charAt(i) != s1.charAt(s1.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}