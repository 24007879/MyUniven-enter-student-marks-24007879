import java.util.Scanner;

public class jane {

    public static void main(String[] args) {
        Scanner student_marks = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = student_marks.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Final Results Shoud Be Between 0 and 100.");
        } else if (marks >= 80) {
            System.out.println("Level 7 - Outstanding Achievement");
        } else if (marks >= 70) {
            System.out.println("Level 6 - Meritorious achievement");
        } else if (marks >= 60) {
            System.out.println("Level 5 - Substantial achievement");
        } else if (marks >= 50) {
            System.out.println("Level 4 - Adequate achievement");
        } else if (marks >= 40) {
            System.out.println("Level 3 - Moderate achievement");
        } else if (marks >= 30) {
            System.out.println("Level 2 - Elementary achievement");
        } else {
            System.out.println("Level 1 - Not Achievement");
        }
    }
}
