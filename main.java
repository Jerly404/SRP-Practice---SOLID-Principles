import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class main {

    // Clase User dentro del mismo archivo
    static class User {
        public String name;
        public String email;
        public User(String name, String email) {
            this.name = name;
            this.email = email;
        }
    }

    // Servicio monolítico
    static class UserService {
        public void registerUser(String name, String email) {
            User user = new User(name, email);
            saveToFile(user);
            sendEmail(user);
            log("Registered user: " + user.email);
        }

        private void saveToFile(User user) {
            try (FileWriter fw = new FileWriter("users.txt", true)) {
                fw.write(user.name + "," + user.email + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void sendEmail(User user) {
            System.out.println("Sending welcome email to " + user.email);
        }

        private void log(String message) {
            try (FileWriter fw = new FileWriter("app.log", true)) {
                fw.write(LocalDateTime.now() + " - " + message + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        UserService service = new UserService();
        service.registerUser("Ana", "ana@example.com");
    }
}
