package zztest;

public class Exam {
    void run() {
        System.out.println("Exam run");
        walk();
    }
    void walk() {
        System.out.println("Exam walk");
    }
}

class Test extends Exam {
    void run() {
        System.out.println("Test run");
        super.run();
    }
    void walk() {
        System.out.println("Test walk");
        super.walk();
    }
}

class Demo {
    public static void main(String[] args) {
        Exam p = new Test();
        p.run();
    }
}















