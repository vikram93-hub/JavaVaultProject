import java.io.*;

public class VaultManager {
    private static final String FILE_NAME = "my_vault.txt";
    private static final int KEY = 9346; // Our secret shift key

    // 1. Encryption Logic
    public String encrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            result.append((char) (character + KEY));
        }
        return result.toString();
    }

    // 2. Decryption Logic
    public String decrypt(String text) {
        StringBuilder result = new StringBuilder();
        for (char character : text.toCharArray()) {
            result.append((char) (character - KEY));
        }
        return result.toString();
    }

    // 3. Save to File
    public void saveLog(LogEntry entry) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            String secretLine = encrypt(entry.toString());
            writer.write(secretLine);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    // 4. THE FINAL BOSS: Read and Decrypt logic
    public void viewLogs() {
        System.out.println("Reading from file...");
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Call decrypt on each line and print it
                System.out.println(decrypt(line));
            }
        } catch (IOException e) {
            System.out.println("No logs found or error reading file.");
        }
    }
}
