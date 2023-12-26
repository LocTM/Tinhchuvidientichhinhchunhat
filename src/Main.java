
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao canh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao canh b: ");
        int b = scanner.nextInt();
        int s = a * b;
        int p = (a + b)* 2;
        System.out.println("Dien tich hinh chu nhat la: " +s);
        System.out.println("Chu vi hinh chu nhat la: " +p);

    }
}

