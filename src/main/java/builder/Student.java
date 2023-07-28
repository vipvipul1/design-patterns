package builder;

public class Student {
    private String name;
    private int age;
    private double psp;
    private int gradYear;

    private Student() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public static class StudentBuilder {
        private String name;
        private int age;
        private double psp;
        private int gradYear;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Student build() {
            // validations start
            boolean isStudentValid = validateStudent();
            if (!isStudentValid) {
                System.out.println("Graduation Year can't be greater than 2022!");
                return null;
            }
            // validations end

            Student student = new Student();
            student.name = this.name;
            student.age = this.age;
            student.psp = this.psp;
            student.gradYear = this.gradYear;
            return student;
        }

        boolean validateStudent() {
            return this.gradYear <= 2022;
        }
    }

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }
}
