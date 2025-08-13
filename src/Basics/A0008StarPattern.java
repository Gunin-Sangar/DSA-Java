package Basics;

// NOTE
// write j in terms of rows while iterating " " // or the spaces will get messed
// because you want to change the space differently for each row
// you do not want to change space in each column

public class A0008StarPattern {
    public static void main(String[] args) {
        System.out.println();
        // rectangle and squares
        int r1 = 5;
        int c1 = 10;
        System.out.println("rectangle and squares :");
        // iterating rows
        for (int i = 1; i <= r1; i++) {
            // iterating columns
            for (int j = 1; j <= c1; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // hollow rectangle and hollow squares
        int r2 = 5;
        int c2 = 10;
        System.out.println("hollow rectangle and hollow squares :");
        // iterating rows
        for (int i = 1; i <= r2; i++) {
            // iterating columns
            for (int j = 1; j <= c2; j++) {
                // deciding where to print * and " "
                if (i == 1 || i == r2 || j == 1 || j == c2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // square with diagonal [for other diagonal → i == j]
        int r3 = 5;
        System.out.println("square with diagonal :");
        // iterating rows
        for (int i = 1; i <= r3; i++) {
            // iterating columns
            for (int j = 1; j <= r3; j++) {
                // deciding where to print * and " "
                if (i == 1 || j == 1 || i == r3 || j == r3 || i == r3 - j + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // rhombus
        int r4 = 5;
        int c4 = 10;
        System.out.println("rhombus :");
        // iterating rows
        for (int i = 1; i <= r4; i++) {
            // print leading spaces
            for (int j = 1; j <= r4 - i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= c4; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // mirrored rhombus
        int r5 = 5;
        int c5 = 10;
        System.out.println("mirrored rhombus :");
        // iterating rows
        for (int i = 1; i <= r5; i++) {
            // print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= c5; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // hollow rhombus
        int r6 = 5;
        int c6 = 10;
        System.out.println("hollow rhombus :");
        // iterating rows
        for (int i = 1; i <= r6; i++) {
            // printing leading spaces
            for (int j = 1; j <= r6 - i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= c6; j++) {
                // deciding where to print * and " "
                if (j == 1 || j == c6 || i == 1 || i == r6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // hollow mirrored rhombus
        int r7 = 5;
        int c7 = 5;
        System.out.println("hollow mirrored rhombus :");
        // iterating rows
        for (int i = 1; i <= r7; i++) {
            // iterating columns
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= c7; j++) {
                // deciding where to print * and " "
                if (j == 1 || j == c7 || i == 1 || i == r6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // right-angled triangle
        int r8 = 5;
        System.out.println("right-angled triangle : named Floyd's triangle");
        // iterating rows
        for (int i = 1; i <= r8; i++) {
            // iterating columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j + i - 1);
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // hollow right-angled triangle
        int r9 = 5;
        System.out.println("hollow right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r9; i++) {
            // iterating columns
            for (int j = 1; j <= i; j++) {
                // deciding where to print * and " "
                if (j == i || j == 1 || i == r9) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // mirrored right-angled triangle
        int r10 = 5;
        System.out.println("mirrored right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r10; i++) {
            // printing leading spaces
            for (int j = 1; j <= r10 - i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // hollow mirrored right-angled triangle
        int r11 = 5;
        System.out.println("hollow mirrored right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r11; i++) {
            for (int j = 1; j <= r10 - i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= r11; j++) {
                // deciding where to print * and " "
                if (j == i || j == 1 || i == r11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // inverted right-angled triangle
        int r12 = 5;
        System.out.println("inverted right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r12; i++) {
            // iterating columns
            for (int j = 1; j <= r12 - i + 1; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // inverted hollowed right-angled triangle
        int r13 = 5;
        System.out.println("inverted hollowed right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r13; i++) {
            // iterating columns
            for (int j = 1; j <= r13 - i + 1; j++) {
                // deciding where to print * and " "
                if (j == 1 || i == 1 || j == r12 + 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // inverted mirrored right-angled triangle
        int r14 = 5;
        System.out.println("inverted mirrored right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r14; i++) {
            // printing leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= r14 - i + 1; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        //inverted mirrored hollowed right-angled triangle
        int r15 = 5;
        System.out.println("inverted mirrored hollowed right-angled triangle :");
        // iterating rows
        for (int i = 1; i <= r15; i++) {
            // iterating columns
            for (int j = 1; j <= r15; j++) {
                // deciding where to print * and " "
                if (j == r15 || i == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // Equilateral triangle
        int r16 = 5;
        System.out.println("Equilateral triangle :");
        // iterating rows
        for (int i = 1; i <= r16; i++) {
            // printing leading spaces
            for (int j = 1; j <= r16 - i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // Hollow equilateral triangle
        int r17 = 5;
        System.out.println("Hollow equilateral triangle :");
        // iterating rows
        for (int i = 1; i <= r17; i++) {
            // Print leading spaces
            for (int j = i; j < r17; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i) - 1; j++) {
                // deciding where to print * and " "
                if (i == r17 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // inverted equilateral triangle
        int r18 = 5;
        System.out.println("inverted equilateral triangle :");
        // iterating rows
        for (int i = 1; i <= r18; i++) {
            // printing leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= (r18 * 2) - (2 * i - 1); j++) {
                System.out.print("*");
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // hollow inverted equilateral triangle
        int r19 = 5;
        System.out.println("hollow inverted equilateral triangle :");
        // iterating rows
        for (int i = 1; i <= r19; i++) {
            // printing leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= (r19 * 2) - (2 * i - 1); j++) {
                if (i == 1 || j == 1 || j == (r18 * 2) - (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();


        // half diamond
        int r20 = 5;
        int c20 = 1;
        System.out.println("half diamond :");
        // iterating rows
        for (int i = 1; i <= r20 * 2 - 1 ; i++) {
            // iterating columns
            for (int j = 1; j <= c20; j++) {
                System.out.print("*");
            }
            // deciding weather increment or decrement column in next row
            if(i < r20){
                c20++;
            }else{
                c20--;
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();



        // mirrored half diamond
        int r21 = 5;
        int c21 = 1;
        int s21 = r21 - 1;
        System.out.println("mirrored half diamond :");
        // iterating rows
        for (int i = 1; i <= 2 * r20 - 1 ; i++) {
            // printing leading spaces
            for(int j = 1; j <= s21; j++) {
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= c21; j++) {
                System.out.print("*");
            }
            // deciding weather increment or decrement column / spaces in next row
            if(i < r20){
                s21--;
                c21++;
            }else{
                s21++;
                c21--;
            }
            // shift to next line
            System.out.println();
        }
        System.out.println();



        // diamond
        int r22 = 5;
        int c22 = 1;
        int s22 = r22;
        System.out.println("diamond :");
        // iterating rows
        for(int i = 1; i <= 2 * r22 - 1; i++){
            // printing leading spaces
            for(int j = 1; j <= s22; j++){
                System.out.print(" ");
            }
            // iterating columns
            for (int j = 1; j <= c22; j++) {
                System.out.print("*");
            }
            // deciding weather increment or decrement column / spaces in next row
            if(i < r22){
                s22--;
                c22+=2;
            }
            else{
                s22++;
                c22 -=2;
            }
            System.out.println();
        }
        System.out.println();



        // hollow diamond star
        // Loop to print the upper half of the pattern (the top part of the diamond)
        int r23 = 5;
        System.out.println("hollow diamond star :");
        // iterating rows
        for (int i = 1; i <= r23; i++) {
            // Print leading stars
            for (int j = i; j <= r23; j++) {
                System.out.print("*");
            }
            // Print spaces between the stars
            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print(" ");
            }
            // Print trailing stars
            for (int j = i; j <= r23; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row of the upper half
            System.out.println();
        }
        // Loop to print the lower half of the pattern (the bottom part of the diamond)
        for (int i = 1; i <= r23; i++) {
            // Print leading stars (increases as 'i' increase)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print spaces between the stars (decreases as 'i' increase)
            for (int j = (2 * i - 2); j < (2 * r23 - 2); j++) {
                System.out.print(" ");
            }
            // Print trailing stars (same as leading stars)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row of the lower half
            System.out.println();
        }
        System.out.println();



        // hollow diamond || kinda made formulas and did || square centered - hollow diamond
        // Loop to print the upper half of the pattern (the top part of the diamond)
        int ra =10;
        System.out.println("hollow diamond star :");
        for (int i = 1; i <= ra; i++) {
            for (int j = 1; j <= 2 * ra; j++){
                // lower left || lower right || upper left || upper right
                if(j <= i || j>= 2 * ra - i + 1 || j <= ra - i + 1 || j >= ra + i){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();



        // right arrow star
        int r24 = 5;
        int c24 = r24;
        int s24 = 1;
        System.out.println("right arrow star :");
        // iterating rows
        for(int i = 1; i <= 2 * r24 - 1; i++){
            // printing leading spaces
            for(int j = 1; j <= s24; j++){
                System.out.print(" ");
            }
            // iterating rows
            for(int j = 1; j <= c24; j++){
                System.out.print("*");
            }
            // deciding weather increment or decrement column / space in next row
            if(i < r24){
                c24--;
                s24++;
            }else{
                c24++;
                s24--;
            }
            System.out.println();
        }



        // left arrow star
        int r25 = 5;
        int c25 = r25;
        int s25 = r25;
        System.out.println("left arrow star :");
        // iterating rows
        for(int i = 1; i <= 2 * r25 - 1; i++){
            // printing leading spaces
            for(int j = 1; j <= s25; j++){
                System.out.print(" ");
            }
            // iterating rows
            for(int j = 1; j <= c25; j++){
                System.out.print("*");
            }
            // deciding weather increment or decrement column / space in next row
            if(i < r25){
                c25--;
                s25--;
            }else{
                c25++;
                s25++;
            }
            System.out.println();
        }
        System.out.println();



        // Plus sign
        int r26 = 5;
        System.out.println("plus sign :");
        // iterating rows
        for(int i = 1; i <= 2 * r26 - 1; i++){

            if(i == r26){
                for(int j = 1; j <= 2 * r26 - 1; j++){
                    System.out.print("+");
                }
            }else {
                for(int j = 1; j <= r26 -1; j++){
                    System.out.print(" ");
                }
                System.out.print("+");
            }
            System.out.println();
        }
        System.out.println();


        // X pattern
        int r27 = 11;
        int c27 = 11;
        System.out.println("X pattern :");
        // iterating rows
        for(int i = 1; i <= r27; i++){
            // iterating columns
            for(int j = 1; j <= c27; j++){
                if(i == j || j == r27 - i + 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();



        // 8 Pattern
        int r28 = 5;
        int c28 = 5;
        System.out.println("8 pattern :");
        // iterating rows
        for(int i = 1 ; i <= r28 * 2 - 1; i++) {
            // iterating columns
            for(int j = 1; j <= c28; j++) {
                // Condition for corner and center intersection space
                if((i == 1 && (j == 1 || j == r28)) ||
                        (i == r28 && (j == 1 || j == r28)) ||
                        (i == r28 * 2 - 1 && (j == 1 || j == r28))) {
                    System.out.print(" ");
                } else if(i == 1 || i == r28 || i == r28 * 2 - 1 || j == 1 || j == r28) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();



        // Heart Pattern
        int r29 = 10;
        System.out.println("heart pattern :");
        for(int i = 1; i <= r29/2 - 1; i++){

            // for spaces in half*half equilateral triangle
            for(int j = 1; j <= r29/2 - i - 1; j++){
                System.out.print(" ");
            }
            // half*half equilateral triangle
            for(int j = r29/2  - 2; j <= r29/2 + 2 * i; j++){
                System.out.print("*");
            }
            // copy and pasted the above 2 things lol
            for(int j = 1; j <= r29/2 - i - 1; j++){
                System.out.print(" ");
            }
            for(int j = r29/2  - 2; j <= r29/2 + 2 * i; j++){
                System.out.print("*");
            }
                System.out.println();
        }
        // inverted equilateral triangle
        for(int i = 1; i <= r29; i++){
            //for spaces in triangle
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            // inverted equilateral triangle
            for(int j = i; j <= 2 * r29 - i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();



        // Butterfly
        int r30 = 5;
        System.out.println("Butterfly pattern :");
        // Upper-half of butterfly
        for (int i = 1; i <= r30; i++) {
            for (int j = 1; j <= 2*r30; j++) {
                if(j <= i || j > (2 * r30) - i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Lower-half of butterfly
        for(int i = 1; i <= r30; i++){
            for(int j = 1; j <= 2 * r30; j++){
                if(j <= r30 - i +1 || j >= r30 + i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}