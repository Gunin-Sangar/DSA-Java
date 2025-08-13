package Basics;

// Operation happens One at a time
// Precedence → Power of operator
// Associativity → same precedence | Different operator | tells which operation to do
// Direction is Generally left to Right

// NOW GO DOWN FOR PRECEDENCE TABLE

public class A0003PrecedenceOrder {
    public static void main(String[] args){
        int a = 5;
        int b = 2;

        // () → * → / → % → +
        int c = a/3 + b * a % (a-b);
        System.out.println("Value of c : " + c);

        //Operation happens One at a time ... therefore as a result
        // "xyz" + 4 + 2 → "xyz4" + 2 → "xyz42"
        System.out.println("xyz" + 4 + 2);

        // 4 + 2 + "xyz" → 6 + "xyz" → "6xyz"
        System.out.println(4 + 2 +"xyz");

        // extra example
        boolean p = false;
        boolean q = false;
        boolean r = true;
        // p==q → true ...then true == r → true
        System.out.println(p==q==r);
    }
}




/*
============ JAVA OPERATOR PRECEDENCE & ASSOCIATIVITY ============

Priority  Operator(s)                         Associativity
-------------------------------------------------------------
1         () [] .                             Left to Right
2         ++ -- (postfix)                     Left to Right
3         ++ -- + - ~ ! (unary)               Right to Left
4         * / %                               Left to Right
5         + -                                 Left to Right
6         << >> >>>                           Left to Right
7         < <= > >= instanceof                Left to Right
8         == !=                               Left to Right
9         &                                   Left to Right
10        ^                                   Left to Right
11        |                                   Left to Right
12        &&                                  Left to Right
13        ||                                  Left to Right
14        ?:                                  Right to Left
15        = += -= *= /= %= <<= >>= >>>=       Right to Left
-------------------------------------------------------------

NOTE for ASSOCIATIVITY:
- Now about associativity:
    For * / %, Left to Right means:
        x op y op z  ≡  (x op y) op z
        Basically you do one operation at a time from left to right

NOTE for symbols:
- Logical not = ! = inverts boolean value

- Not to be confused with binary + and - (which add/subtract two numbers).
  Here, unary + just means "positive", and unary - makes a number negative.
  int a = +5;   // same as 5
  int b = -a;   // makes b = -5

- int x = 5;     // binary: 00000101
  int y = ~x;    // binary: 11111010 → y = -6

NOTE for general:
- Higher number = Lower precedence
- Operators on same level follow associativity rule

Example:
int a = 2 + 3 * 4;   // * has higher precedence than +
int b = (2 + 3) * 4; // () overrides precedence
*/
