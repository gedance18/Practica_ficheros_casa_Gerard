import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        Controlador controlador = new Controlador();

        while (true) {
        int respuesta = menu.menu();

        if (respuesta == 1) {
            controlador.crear_archivo();

        } else if (respuesta == 2) {
            controlador.crear_directorio();

        } else if (respuesta == 3) {
            controlador.ejecutar_sobre_un_archivo();

        } else if (respuesta == 4) {
            controlador.ejecutar_sobre_todos_los_archivos();

        } else if (respuesta == 5) {
            controlador.modificacion_archivo_entrada();

        } else if (respuesta == 6) {
            controlador.eliminacion_archivo();

        } else if (respuesta == 7) {
            controlador.eliminacion_directorio();
        } else if (respuesta == 8) {
            break;
        }

        }
    }
}
