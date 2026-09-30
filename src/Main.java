import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        boolean programRunning = true;
        User user = null;

        while(programRunning){

            System.out.println("========================================");
            System.out.println("        USER MANAGEMENT CLI");
            System.out.println("========================================");
            System.out.println("1. Create user");
            System.out.println("2. Read user");
            System.out.println("3. Update user");
            System.out.println("4. Delete user");
            System.out.println("0. Exit");

            System.out.print("Choose an option: ");
            int chooseOption = sc.nextInt();
            sc.nextLine();

            switch (chooseOption){
                case 1:
                    System.out.println("------CREATING USER------");
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    user = new User(id, name, email);

                    System.out.println(user.getId());
                    System.out.println(user.getName());
                    System.out.println(user.getEmail());
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