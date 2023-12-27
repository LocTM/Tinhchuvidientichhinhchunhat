import java.util.Scanner;

public class vietptgiaibac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so a: ");
        int a = scanner.nextInt();
        System.out.println("Moi ban nhap vao so b");
        int b = scanner.nextInt();
        System.out.println("Moi ban nhap vao so c");
        int c = scanner.nextInt();


        double delta = Math.pow(b,2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        if ( delta < 0)
            System.out.println("Phuong trinh vo nghiem");
        else if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem kep. x1 = x2 =" + (-b/(2*a)));
        }
        else{
            System.out.println("PT co 2 nghiem phan biet x1: " + x1 + "va x2: " +x2  );
        }

    }
}
