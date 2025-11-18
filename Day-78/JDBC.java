

//import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.sql.*;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc"; // at the end jdbc is schema name
        String username = "root";
        String password = "7288";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver is loaded successfully!!");

            Connection con = DriverManager.getConnection(url,username,password);

            System.out.println("Connection is established!!");

            Statement statement = con.createStatement();

//            String fetchData = "SELECT * FROM employee";
//           ResultSet res =  statement.executeQuery(fetchData);
//           res.next();
//
//           System.out.println(res.getInt(1) + " ,name " + res.getString(2) + " ,designation " + res.getString(3) + " ,salary " + res.getInt(4));
//           res.next();
//           System.out.println(res.getInt(1) + " ,name " + res.getString(2) + " ,designation " + res.getString(3) + " ,salary " + res.getInt(4));
//           res.next();
//           System.out.println(res.getInt(1) + " ,name " + res.getString(2) + " ,designation " + res.getString(3) + " ,salary " + res.getInt(4));

            // another way to print that
            // res.next() -> boolean -> if there is row it will true , otherwise false
//            while(res.next()){
//                // id or column name -> if column name then we have to enclosed within double quotes
//                 System.out.println(res.getInt("id") + " ,name " + res.getString("name") + " ,designation " + res.getString("designation") + " ,salary " + res.getInt("salary"));
//             }



            // metaData -> it will give total columns in the table and data type of this table
//            ResultSetMetaData resultSetMetaData = res.getMetaData();
//            System.out.println(resultSetMetaData.getColumnCount());


            // It will give the column names
//            System.out.println(resultSetMetaData.getColumnName(1));
//            System.out.println(resultSetMetaData.getColumnName(2));
//            System.out.println(resultSetMetaData.getColumnName(3));
//            System.out.println(resultSetMetaData.getColumnName(4));

           // It will give column data type
//            System.out.println(resultSetMetaData.getColumnTypeName(1));
//            System.out.println(resultSetMetaData.getColumnTypeName(2));
//            System.out.println(resultSetMetaData.getColumnTypeName(3));
//            System.out.println(resultSetMetaData.getColumnTypeName(4));


            // one more way to print multiple lines of data types
//            for(int i = 1; i<=resultSetMetaData.getColumnCount();i++){
//                System.out.println(resultSetMetaData.getColumnTypeName(i));
//
//                // column names
//                System.out.println(resultSetMetaData.getColumnName(i));
//            }

//            // insert data query
//            String insertData = "INSERT INTO employee(id,name.designation,salary)VALUES(5,\"Doe\" ,\"ceo\" ,20000)";
//            int rows = statement.executeUpdate(insertData);
//            System.out.println(rows);



        } catch (ClassNotFoundException e) {
            System.out.println("Driver is not loaded!!");
        } catch (SQLException e) {
            System.out.println("Connection is not established!!");
        }


    }
}