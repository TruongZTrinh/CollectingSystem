package view;

import org.mindrot.jbcrypt.BCrypt;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SQLFileGenerator {

    static class User {

        String name;
        String email;
        String password;
        int role;

        public User(String name, String email, String password, int role) {
            this.name = name;
            this.email = email;
            this.password = password;
            this.role = role;
        }
    }

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Phuc Truong", "phuctruong123@gmail.com", "phuctruong123", 1),
                new User("Gia Kiet", "giakiet221@gmail.com", "giakiet221", 2),
                new User("Ngoc Tram", "ngoctram920@gmail.com", "ngoctram920", 2),
                new User("My Linh", "mylinh321@gmail.com", "mylinh321", 2),
                new User("Ngoc Dinh", "ngocdinh111@gmail.com", "ngocdinh111", 2)
        );
        String fileName = "insert_users.sql";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (User user : users) {
                String hashedPassword = BCrypt.hashpw(user.password, BCrypt.gensalt());

                String insertStatement = String.format(
                        "INSERT INTO user (user_name, user_email, user_password , role_id) VALUES ('%s', '%s', '%s', '%d');",
                        user.name, user.email, hashedPassword, user.role
                );

                writer.write(insertStatement);
                writer.newLine();
            }

            System.out.println("File SQL đã được tạo: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
