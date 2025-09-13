package srp;

// Clase que representa a un usuario en el sistema
// Esta clase solo guarda datos básicos del usuario.
// Principio SRP: su única responsabilidad es contener información del usuario.

public class user {
    private final String name;
    private final String email;

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}