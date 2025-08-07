//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[]args) {

        Student student1 = new Student("Kint Novert Escoto", 20, "BSIT", 91.0, 96.7, 96.5);
        Student student2 = new Student("Euniece Kyle Puerto", 20, "Infomation Technology", 83.0, 82.5, 92.0);
        Student student3 = new Student("Darren Ano Joaquim Santander", 20, "Physics", 75.0, 63.5, 70.0);

        Student[] students = {student1, student2, student3};
        int passingCount = 0;

        System.out.println("STUDENT GRADE CALCULATOR");
        System.out.println("  ");


        for (int i = 0; i < students.length; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("  ");
            students[i].displayInfo();

            double average = students[i].calculateAverage();
            String letterGrade = students[i].getLetterGrade();
            boolean passing = students[i].isPassing();

            System.out.printf("Average: %.2f\n", average);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("Status: " + (passing ? "PASSING" : "FAILING"));

            if (passing) {
                passingCount++;
            }
        }
