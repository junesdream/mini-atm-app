# Mini Java ATM App

This is a simple Java application that simulates an Automated Teller Machine (ATM). The application consists of the following classes:

## Classes

### Main
The main class that acts as the entry point of the application. It creates an instance of the `ATM` class and invokes the respective methods.

### ATM
This class represents the ATM and contains the logic for various ATM operations. It implements the `AtmOperationInterface` and utilizes the `AtmOperationImpl` class for executing the operations.

### AtmOperationImpl
This class implements the actual ATM operations such as checking account balance, cash withdrawal, and deposit. It contains the business logic for these operations.

### AtmOperationInterface
This is an interface that defines the methods for various ATM operations. Both the `ATM` and `AtmOperationImpl` classes implement this interface.

## Features

The Mini Java ATM App provides the following features:

1. **Check Balance**: Allows the user to retrieve the current account balance.
2. **Cash Withdrawal**: Allows the user to withdraw cash from their account. Checks are performed to ensure that the withdrawal amount is not negative and does not exceed the account balance.
3. **Deposit**: Allows the user to deposit money into their account.

## Usage

1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Compile the source files.
4. Run the `Main` class to start the application.
5. Follow the instructions in the console to perform various ATM operations.

## Notes

- Contributions are welcome. Please open an issue to discuss your ideas or notify us about bugs.
- This application is for demonstration and learning purposes only and should not be used in a production environment.
- No persistent data is stored, and the application will reset upon each run.