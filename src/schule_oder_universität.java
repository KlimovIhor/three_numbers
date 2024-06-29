
import java.util.Scanner;

public class schule_oder_universität {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 18){
        if (age >= 6) {
            System.out.println("schule");
        }
        }else {
            System.out.println("universität");
        }
            scanner.close();
    }
}

