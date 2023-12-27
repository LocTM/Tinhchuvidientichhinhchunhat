import java.util.Scanner;

public class Giaibaitapifelse {
    public static void main(String[] args) {
        //Nhap vao thang trong nam, cho biet thang thuoc quy may
        // 123 quy 1
        // 564 quy 2
        // 789 quy 3
        // 101112 quy 4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap vao thang: ");
        int month = scanner.nextInt();
        if( month == 1 || month == 2|| month ==3){
            System.out.println("Thang " + month + " thuoc quy 1" );
        }else if ( month == 4 || month == 5|| month ==6){
            System.out.println("Thang " + month + " thuoc quy 2" );
        }else if ( month == 7 || month == 8|| month ==9){
            System.out.println("Thang " + month + " thuoc quy 3" );
        }else if ( month == 10 || month == 11|| month ==12){
            System.out.println("Thang " + month + " thuoc quy 4" );
        }else
            System.out.println("Khong co thang " + month);
    }
}
