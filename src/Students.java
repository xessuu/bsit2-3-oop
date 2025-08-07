public class Student {
    String name;
    int age;
    String course;
    double grade1;
    double grade2;
    double grade3;


    public Student(String name, int age, String course, double grade1, double grade2, double grade3) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Grades: " + grade1 + ", " + grade2 + ", " + grade3);
    }


    public double calculateAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }


    public String getLetterGrade() {
        double average = calculateAverage();
        if (average >= 90) {
           System.out.println("A");
        } else if (average >= 80) {
            System.out.println("B");
        } else if (average >= 70) {
            System.out.println("C");
        } else if (average >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }


    public boolean isPassing() {
        return calculateAverage() >= 70;
    }


    public String getName() {
        return name;
    }
}
