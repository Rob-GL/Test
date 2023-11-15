import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }
    }
}