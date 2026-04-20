import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VaultManager vault = new VaultManager();

        System.out.println("--- WELCOME TO SECURE VAULT ---");

        while (true) {
            System.out.println("\n1. Add Secret Log");
            System.out.println("2. View All Logs (Decrypt)");
            System.out.println("3. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter your secret: ");
                String note = sc.nextLine();
                vault.saveLog(new LogEntry(note));
                System.out.println("Saved and Encrypted!");
            } else if (choice == 2) {
                vault.viewLogs();
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}


