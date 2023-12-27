import java.util.Scanner;

public class Vietchuongtrinhkiemtrasongaytrongthang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao so thang");
        int month = scanner.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Thang " + month + " co 31 ngay.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("Thang " + month + " co 30 ngay.");
        } else if (month == 2) {
            System.out.println("Hay nhap vao nam");
            int year = scanner.nextInt();
            if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Thang 2 cua nam " + year + " co 29 ngay");
            } else
                System.out.println("Thang 2 cua nam " + year + " co 28 ngay");
        }else
            System.out.println("Ban nhap sai thang, hay nhap lai thang trong khoang tu 01-12");

    }
}
