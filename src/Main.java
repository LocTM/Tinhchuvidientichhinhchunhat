
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User users[] = new User[3];
        System.out.println("in ra ten cua User");
        System.out.println("in ra ten cua User thu 3");
        try {
            System.out.println(users[2].getName());
        }
        catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("in ra id cua User");
    }
}

