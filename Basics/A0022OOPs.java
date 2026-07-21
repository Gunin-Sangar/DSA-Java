package Basics;

class A0022OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("ManKDI", 2345);
        Student s3 = new Student("Man", 982345);
        Student s4 = new Student("Man", 982345);
        System.out.println("This is s1: ");
        System.out.println(s1.name);
        System.out.println(s1.rno);
        System.out.println();

        System.out.println("This is s2: ");
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println();

        System.out.println("This is s3: ");
        System.out.println(s3.name);
        System.out.println(s3.rno);
        System.out.println();

        System.out.println("This is s4: ");
        System.out.println(s4.name);
        System.out.println(s4.rno);
        System.out.println();

        System.out.println("This is s2: ");
        System.out.println(s2.name);
        System.out.println(s2.rno);
        System.out.println();

        System.out.println("This is s3 == s4 ");
        System.out.println(s3 == s4); // different obj in memory
        System.out.println();

        s3 = s4;
        s3.name = "random";
        System.out.println("s3 = s4 | s3.name = random | what is s4.name:");
        System.out.println(s4.name);
        System.out.println();

        System.out.println("This is s3 == s4  after s3 = s4");
        System.out.println(s3 == s4); // different obj in memory
        System.out.println();

    }

    static class Student {
        String name;
        int rno;
        Student(){
            name = "idkman";
            rno = 1234567;
        }

        Student(String naam, int roll){
            this.name = naam;
            this.rno = roll;
        }

        // this a method and not a constructor therefore it wont affect anything before use
        void Student() {
            name = "Hello";
        }

    }
}
