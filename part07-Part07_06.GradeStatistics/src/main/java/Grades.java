import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> grades = new ArrayList<>();
    private ArrayList<Integer> passingGrades = new ArrayList<>();
    private ArrayList<Integer> results = new ArrayList<>();

    public Grades() {

    }

    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            this.grades.add(grade);

            if (grade >= 50) {
                this.passingGrades.add(grade);
            }

            if (grade < 50) {
                this.results.add(0);
            } else if (grade >= 50 && grade < 60) {
                this.results.add(1);
            } else if (grade >= 60 && grade < 70) {
                this.results.add(2);
            } else if (grade >= 70 && grade < 80) {
                this.results.add(3);
            } else if (grade >= 80 && grade < 90) {
                this.results.add(4);
            } else if (grade >= 90) {
                this.results.add(5);
            }
        }
    }

    public int sum() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum;
    }

    public int passingSum() {
        int sum = 0;
        for (int grade : passingGrades) {
            sum += grade;
        }
        return sum;
    }

    public double average() {
        return 1.0 * sum() / this.grades.size();
    }

    public double passingAverage() {
        return 1.0 * passingSum() / this.passingGrades.size();
    }

    public double getPassPercentage() {
        double pass = this.passingGrades.size();
        double participants = this.grades.size();
        return 100 * pass / participants;

    }

    public void printGrades() {
        if (this.grades.size() > 0) {
            System.out.println("Point average (all): " + average());
        } else {
            System.out.println("-");
            ;
        }
    }

    public void printPassingGrades() {
        if (this.passingGrades.size() > 0) {
            System.out.println("Point average (passing): " + passingAverage());
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public void printPassPercentage() {
        System.out.println("Pass percentage: " + getPassPercentage());
    }

    public int countGrades(int query) {
        int count = 0;
        for (int grade : results) {
            if (grade == query) {
                count++;
            }
        }
        return count;
    }

    public void printStars(int value) {
        for (int i = 0; i < value; i++) {
            System.out.print("*");
        }
    }

    public void printGradeDistribution() {
        System.out.println("Grade Distribution: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            printStars(countGrades(i));
            System.out.println("");
        }
    }

}