/*
 * Project: BankAccount.java
 * Description: This is a bank account user class.
 * Name: Juyoung Lee
 * Date: Oct 1, 2015
 */
import java.util.Scanner;

public class BankAccountUser {
  
  public static void main( String[] args) {
    
    Scanner s = new Scanner ( System.in );
    double money;
    String name;
    int password;
    
    // Initial amount should be $1000
    System.out.println( "Enter the name of the account owner: " );
    name = s.nextLine();
    System.out.println( "Enter the amount of money to deposit: " );
    money = s.nextDouble();
    
    // Create account
    BankAccount b1 = new BankAccount( money, name );
    
    // Deposit some money
    b1.deposit( 505.22 );    
    System.out.println( "Check balance? What's the password? " );
    password = s.nextInt();
    b1.getBalance( password );
    
    //With draw some money
    System.out.println( "Please change your password: ");
    password = s.nextInt();
    b1.setPassword( password );
    b1.withdraw( 100 );    
    
    // Check balance with new password
    System.out.println( "Check balance? What's the password? " );
    password = s.nextInt();
    b1.getBalance( password );
    
  } // end main method
  
} // end class