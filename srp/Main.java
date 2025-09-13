package srp;

// Clase principal que ejecuta el programa
// Aquí simulamos cómo una empresa usaría este sistema de registro de usuarios.

public class Main {
    public static void main(String[] args) {

        // Inicializamos cada componente con sus rutas de archivo
        userRepository repo = new userRepository("users.txt");
        emailService email = new emailService();
        logger logger = new logger("app.log");

        // Creamos el servicio que coordina todo
        userRegistrationService service = new userRegistrationService(repo, email, logger);

        // Creamos un usuario nuevo
        user u = new user("Ana", "ana@example.com");
        
        // Registramos al usuario → guarda en archivo, manda correo, escribe log
        service.register(u);
    }
}
