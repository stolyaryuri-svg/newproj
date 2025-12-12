//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.sun.org.apache.xpath.internal.objects.XString;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/userdb";
        String username = "postgres";
        String pass = "password";

        try    {
            Connection connect = DriverManager.getConnection(url,username, pass);
            Statement statement = connect.createStatement();
            statement.executeUpdate("INSERT INTO customers (customer_id,first_name,age) VALUES (2, 'Jack', 23)");
            //ResultSet result = result.executeQuery("SELECT firstname FROM customers");

            //while (result.next()){
            //    String fst = result.getString(1);
            //    System.out.printf("%s",fst);
            //}
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        //код для новой ветки
        //calltest call1 = new calltest();
        //call1.pay();

        System.out.printf("SQL connection");
        //System.out.printf("SQL new line");
        //тестирование вывода
        //в новой ветке есть новый код
    }
}