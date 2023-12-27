import java.util.Scanner;

public class Toantu3ngoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so can kiem tra");
        int number = scanner.nextInt();
        String result = (number%2==0) ? "So chan" : "So le";
        System.out.println(result);
    }
}
