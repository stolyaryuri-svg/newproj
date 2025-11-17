//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.sun.org.apache.xpath.internal.objects.XString;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/userdb";
        String username = "postgres";
        String pass = "mypass";

        try    {
            Connection connect = DriverManager.getConnection(url,username, pass);
            Statement statement = connect.createStatement();
            //statement.executeUpdate("INSERT INTO customers (id,firstname,age) VALUES (2, 'John', 21)");
            //ResultSet result = result.executeQuery("SELECT firstname FROM customers");
            ResultSet result = statement.executeQuery("SELECT firstname from customers");
            while (result.next()){
                String fst = result.getString(1);
                System.out.printf("%s",fst);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        System.out.printf("SQL complete");
        //System.out.printf("SQL new line");
        //тестирование вывода
        //в новой ветке есть новый код
    }
}