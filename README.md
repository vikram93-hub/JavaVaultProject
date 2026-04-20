# 🔒 JavaVault - Secure Data Persistence System

A standalone Java application designed to bridge the gap between *Object-Oriented Programming* and *Cybersecurity fundamentals*. JavaVault allows users to store sensitive logs that are automatically encrypted before being saved to the local file system.

## 🌟 Key Features
- *Symmetric Encryption:* Implements a custom character-shift cipher (Caesar Cipher) to protect data at rest.
- *Local Persistence:* Utilized BufferedWriter and BufferedReader for robust file handling, ensuring data survives program restarts.
- *Timestamped Logs:* Every entry is automatically stamped with the precise date and time of creation using java.time.
- *Modular Architecture:* Built with a clean separation of concerns:
  - LogEntry.java: The Data Model.
  - VaultManager.java: The Encryption & I/O Engine.
  - Main.java: The User Interface/Controller.

## 🛠️ Technical Stack
- *Language:* Java 8+
- *Core Concepts:* File I/O, Character Stream Manipulation, Encapsulation, Exception Handling.
- *Environment:* VS Code / Terminal.

## 🚀 How to Run
1. Clone this repository to your local machine.
2. Navigate to the project folder in your terminal.
3. Compile the source files:
   ```bash
   javac Main.java
   java Main
   
  📂 Project Structure
* Main.java: Handles user input and the application lifecycle.
* VaultManager.java: Contains the core logic for the encryption/decryption algorithm and file writing.
* LogEntry.java: Defines the structure of a secret log object.
* my_vault.txt: (Generated) The local encrypted storage file.
* 
  📈 Future Roadmap
* [ ] Transitioning from Caesar Cipher to AES-256 encryption.
* [ ] Adding a Master Password login layer for enhanced security.
* [ ] Developing a GUI version using JavaFX or Swing.
Developed as part of my Software Engineering journey at VIT-AP.
   
