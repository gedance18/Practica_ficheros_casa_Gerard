import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public int menu(){
            System.out.println("1. Crear archivo");
            System.out.println("2. Crear directorio");
            System.out.println("3. Ejecutar archivo");
            System.out.println("4. Ejecutar todos los archivos");
            System.out.println("5. Modificar archivo de entrada");
            System.out.println("6. Eliminar archivo");
            System.out.println("7. Eliminar directorio");
            System.out.println("8. Salir");

            int respuesta = scanner.nextInt();
            return respuesta;
    }
}
