import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Enter another integer: ");
        int num2 = Integer.parseInt(sc.nextLine());
        if (num1 == num2) {
            System.out.println("These numbers are equal.");
        } else if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else {
            System.out.println(num1 + " is less than " + num2);
        }
    }
}