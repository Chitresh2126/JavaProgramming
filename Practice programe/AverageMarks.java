import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of subjects ");
        float sub = scanner.nextFloat();
        float total = 0;
        int count = 0;
        while (sub > 0){
            float marks = scanner.nextFloat();
            if( marks == 0){
                break;
            }
            else {
                total = total + marks;
                count++;
                sub--;
            }
        }
        System.out.println("Average of all given marks is " + (total / count));
    }
}
