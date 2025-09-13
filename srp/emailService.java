package srp;

// Clase encargada de enviar correos electrónicos
// En este ejemplo solo simulamos el envío con un "println".
// SRP: su única responsabilidad es la comunicación vía email.

public class emailService {
    public void sendWelcomeEmail(user user) {
        // Aquí se podría integrar un servicio real de correo (SMTP, API, etc.)
        System.out.println("Sending welcome email to " + user.getEmail());
    }
}
