import java.util.Scanner;

public class CgpaOfAllMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total no of Subject is ");
        int sub = scanner.nextInt();
        int Tsub = sub * 100;
        float sum = 0;
        float cgpa ;
        while (sub > 0){
            int marks = scanner.nextInt();
            sum = sum + marks;
            sub--;
        }
        float percentage = ((sum  / Tsub)*100);
        cgpa = (float) (percentage / 9.5);
        System.out.println("CGPA of the candidate is " + cgpa);
    }
}
