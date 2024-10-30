import java.util.Scanner;

public class ScannerMain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         System.out.println("Enter ID value: ");
         int ID = sc.nextInt();
         System.out.println(ID);
        */
        menu();
    }
    static void menu(){
        while (true){
        System.out.println("1 - user menu");
        System.out.println("2 - products menu");
        System.out.println("3 - HR");
        System.out.println("4 - exit");

        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printUsers();
                break;
            case 4:
                return;
            }
        }
    }
    static void printUsers(){
        System.out.println("Alex");
        System.out.println("John");
        System.out.println("Doe");

    }
}
