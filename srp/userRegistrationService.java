package srp;

// Clase "orquestadora"
// Coordina el proceso de registrar un usuario nuevo en el sistema
// SRP: su única responsabilidad es gestionar el flujo de registro.

public class userRegistrationService {
    private final userRepository repository;    // Maneja la persistencia
    private final emailService emailService;    // Maneja los correos
    private final logger logger;                // Maneja los logs

    public userRegistrationService(userRepository repository, emailService emailService, logger logger) {
        this.repository = repository;
        this.emailService = emailService;
        this.logger = logger;
    }

    public void register(user user) {
        repository.save(user);                                // Guardamos el usuario
        emailService.sendWelcomeEmail(user);                  // Enviamos correo de bienvenida
        logger.log("Registered user: " + user.getEmail());    // Registramos la acción en los logs
    }
}
