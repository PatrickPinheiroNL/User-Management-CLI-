import java.util.*;

public class Main {
    public static void main(String[] args){

        UserManager manager = new UserManager();
        manager.createUser(1, "Patrick", "patrick@gmail.com", "feliz123");
        manager.createUser(2, "Ingrid", "ingrid@gmail.com", "zikadopantano");
        manager.createUser(3, "Vitoria", "vitoria@hotmail.com", "escandaloxd");

        User foundUser = manager.getElementById(2);
        System.out.println(foundUser.getName());

        Scanner scanner = new Scanner(System.in);
        boolean programRunning = true;

        while(programRunning){

            System.out.println("========================================");
            System.out.println("        USER MANAGEMENT CLI");
            System.out.println("========================================");
            System.out.println("1. List users");
            System.out.println("2. Find user");
            System.out.println("3. Create user");
            System.out.println("4. Update user");
            System.out.println("5. Delete user");
            System.out.println("0. Exit");

            System.out.println("Choose an option:");
            int chooseOption = scanner.nextInt();

            switch (chooseOption){
                case 1:
                    System.out.println("Displaying all users...");
                    break;
                case 2:
                    System.out.println("Enter user ID or email to search.");
                    break;
                case 3:
                    System.out.println("Enter name, email and password to create a user.");
                    break;
                case 4:
                    System.out.println("Enter the user ID to update.");
                    break;
                case 5:
                    System.out.println("Enter the user ID to delete.");
                    break;
                case 0:
                    programRunning = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 0 and 5.");
                    break;


            }
        }
    }
}