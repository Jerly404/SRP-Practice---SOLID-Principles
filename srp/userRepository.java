package srp;

import java.io.FileWriter;
import java.io.IOException;

// Clase responsable de la persistencia de datos de los usuarios
// Aquí guardamos los usuarios en un archivo de texto.
// SRP: su única responsabilidad es manejar el almacenamiento.

public class userRepository {
    // Ruta del archivo donde se guardan los usuarios
    private final String filePath;

    public userRepository(String filePath) {
        this.filePath = filePath;
    }

    // Método que guarda un usuario en el archivo
    public void save(user user) {
        try (FileWriter fw = new FileWriter(filePath, true)) {
            // Guardamos el nombre y el correo separados por coma
            fw.write(user.getName() + "," + user.getEmail() + "\n");
        } catch (IOException e) {
            // Si ocurre un error al escribir en el archivo
            throw new RuntimeException("Error saving user", e);
        }
    }
}
