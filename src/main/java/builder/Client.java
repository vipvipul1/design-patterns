package builder;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
//        Student student = new Student();
//        Student.Builder builder = new Student.Builder();
        Student student = Student.getBuilder()
                .setName("Vipul")
                .setAge(25)
                .setPsp(93.0)
                .setGradYear(2022).build();
    }
}
