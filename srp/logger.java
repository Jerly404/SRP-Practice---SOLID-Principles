package srp;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

// Clase responsable de registrar (loggear) las acciones del sistema
// SRP: su única responsabilidad es escribir logs en un archivo.

public class logger {
    // Ruta del archivo de logs
    private final String logPath;

    public logger(String logPath) {
        this.logPath = logPath;
    }

    
    // Método para registrar un mensaje en el archivo de log
    public void log(String message) {
        try (FileWriter fw = new FileWriter(logPath, true)) {
            // Se agrega la fecha/hora actual y el mensaje
            fw.write(LocalDateTime.now() + " - " + message + "\n");
        } catch (IOException e) {
            // En caso de error, mostramos el stacktrace
            e.printStackTrace();
        }
    }
}
