Mysql query:

-- CREATE TABLE jdbc.bankaccount(
-- accountNum VARCHAR(100) PRIMARY KEY,
-- name VARCHAR(250),
-- pin VARCHAR(250),
-- balance INT
-- );

SELECT * FROM jdbc.bankaccount;

-- INSERT INTO jdbc.bankaccount(accountNum,name,pin,balance)VALUES
-- ('101',"nick","123",20000),
-- ('102',"rock","234",10000),
-- ('103',"john",'456',20000);


jdbc:

package org.example;

import java.sql.SQLException;
import java.sql.*;
import java.util.Scanner;

public class BankTransaction {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","7288");
// last jdbc is schema name
            String getAccountDetailsQuery = "SELECT * FROM bankaccount where accountNum=? and pin=?";
            PreparedStatement preparedStatement = con.prepareStatement(getAccountDetailsQuery);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the accountNum: ");
            String senderAccountNum = sc.next();
            System.out.println("Enter the pin: ");
            String pin = sc.next();
            preparedStatement.setString(1,senderAccountNum);
            preparedStatement.setString(2,pin);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            System.out.println("Hi "+resultSet.getString(2)+"! Welcome to SBI Bank");
                    System.out.println("Your current balance is: " + resultSet.getInt(4));
// Transfer Money
            System.out.println("******************Transfer Money******************");
            System.out.println("Enter the receiver account Number");
            String receiverAccountNum = sc.next();
            System.out.println("Enter the amount to transfer: ");
            int transferAmount = sc.nextInt();

            System.out.println("line 43");
            con.setAutoCommit(false);
            con.setSavepoint();
            String updateSenderBalanceQuery = "UPDATE bankaccount SET balance = balance - ? where accountNum = ?";
            PreparedStatement preparedStatement1 = con.prepareStatement(updateSenderBalanceQuery);
            preparedStatement1.setInt(1,transferAmount);
            preparedStatement1.setString(2,senderAccountNum);
            int rows = preparedStatement1.executeUpdate();
            System.out.println(rows+" rows updated");
            String fetchRecieverDetails = "SELECT * from bankaccount where accountNum=?";
            PreparedStatement preparedStatement3 = con.prepareStatement(fetchRecieverDetails);
            preparedStatement3.setString(1,receiverAccountNum);
            ResultSet res = preparedStatement3.executeQuery();
            res.next();
            System.out.println("Hi "+ res.getString(2)+". "+resultSet.getString(2)+" is sending money to you. Do you want to receive(y/n)");
            String choice = sc.next();
            choice = choice.toLowerCase();
            if(choice.equals("y") || choice.equals("yes")) {
                String updateReceiverBalanceQuery = "UPDATE bankaccount SET balance = balance + ? where accountNum = ?";
                PreparedStatement preparedStatement2 = con.prepareStatement(updateReceiverBalanceQuery);
                preparedStatement2.setInt(1, transferAmount);
                preparedStatement2.setString(2, receiverAccountNum);
                rows = preparedStatement2.executeUpdate();
                System.out.println(rows + " rows updated");
            } else {
                con.rollback();
                System.out.println("Transaction is cancelled as per your request.");
                        System.out.println("Your current balance is: " + res.getInt(4));
            }
            con.commit();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not loaded..");

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}


o/p:

Enter the accountNum: 
101
Enter the pin: 
123
Hi nick! Welcome to SBI Bank
Your current balance is: 20000
******************Transfer Money******************
Enter the receiver account Number
103
Enter the amount to transfer: 
3000
line 43
1 rows updated
Hi john. nick is sending money to you. Do you want to receive(y/n)
y
1 rows updated

