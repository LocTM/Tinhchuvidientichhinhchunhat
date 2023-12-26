import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao diem trung binh: ");
        double avg = scanner.nextDouble();
        if ( avg >= 5) {
            System.out.println("Dat");
        }
        else{
            System.out.println("Khong dat");
        }
    }
}
