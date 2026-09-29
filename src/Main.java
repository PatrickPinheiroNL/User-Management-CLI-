import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean programRunning = true;

        while(programRunning){

            System.out.println("========================================");
            System.out.println("        USER MANAGEMENT CLI");
            System.out.println("========================================");
            System.out.println("1. Create user");
            System.out.println("2. Read user");
            System.out.println("3. Update user");
            System.out.println("4. Delete user");
            System.out.println("0. Exit");

            System.out.println("Choose an option:");
            int chooseOption = sc.nextInt();

            switch (chooseOption){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    programRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 0 and 4.");
                    break;


            }
        }
    }
}