package OOPS;

class A001OOPS {
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

        // close() works with try statement and also when u want like [s.close()]
        for (int i = 0; i < 10; i++) {
            try (Student s = new Student()) {
                System.out.println("Using student " + i);
            }
        }

    }

    static class Student implements AutoCloseable {
        String name;
        int rno;
        //
        Student(){
            name = "idkman";
            rno = 1234567;
        }
//        Same as above
//        Student(){
//            this.name = "idkman";
//            this.rno = 1234567;
//        }

        // Calling another constructor using 'this' keyword
        // this helps in default initialization as well
        Student(int roll){
            this("newStudent", roll);
        }

        Student(String naam, int roll){
            this.name = naam;
            this.rno = roll;
        }

//        Same as above
//        Student(String naam, int roll){
//            name = naam;
//            rno = roll;
//        }



//        We need this keyword here
//        otherwise java thinks that we are reassigning the local variable
//        something like int a = 20; then it sees a=a; whihc makes no sense
//
//        Student(String name, int rno){
//            this.name = name;
//            this.rno = rno;
//        }

        // the garbage collector calls finalize which is like a destructor for objects that are not used
        // deprecated after java 9 | so we use close with Student implements AutoCloseable
//        @Override
//        protected void finalize() throws Throwable {
//            System.out.println("Student obj is destroyed");
//        }

        @Override
        public void close() {
            System.out.println("Student resources released");
        }

        // this a method and not a constructor therefore it won't affect anything before use
        void Student() {
            name = "Hello";
        }

    }
}
