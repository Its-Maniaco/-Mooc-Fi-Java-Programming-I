import java.util.Scanner;

public class UI {

    private Scanner scan;
    private Grades grades;

    public UI(Scanner scan) {
        this.scan = scan;
        this.grades = new Grades();
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int grade = Integer.valueOf(scan.nextLine());

            if (grade == -1) {
                this.grades.printGrades();
                this.grades.printPassingGrades();
                this.grades.printPassPercentage();
                this.grades.printGradeDistribution();
                break;
            }

            this.grades.add(grade);
        }

    }

}