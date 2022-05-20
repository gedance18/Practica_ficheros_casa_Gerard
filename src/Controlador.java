import java.io.*;
import java.util.Scanner;

public class Controlador {
    Scanner scanner = new Scanner(System.in);
    public void crear_archivo()throws IOException {
        System.out.println("Elije la ruta para del fichero");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        file.createNewFile();

        }
    public void crear_directorio(){
        System.out.println("Elije la ruta del directorio");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        file.mkdir();
    }
    public void ejecutar_sobre_un_archivo() throws IOException {
        System.out.println("Elije la ruta del fichero");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        Scanner myReader = new Scanner(file);
        File sortida_file = new File("sortida_sobre_un_archivo/sortida.txt");
        sortida_file.createNewFile();
        FileWriter myWriter = new FileWriter(sortida_file);

        int lineas = myReader.nextInt();
        for(int i=0;i<lineas; i++){
            myWriter.write("Entrada "+ (i+1) + "\n");
            int primernum = Integer.parseInt(myReader.next());
            int segundonum = Integer.parseInt(myReader.next());
            if(primernum > segundonum){
                primernum= primernum+segundonum;
                segundonum= primernum-segundonum;
                primernum= primernum - segundonum;
            }
            for(int k = 0; k<=10; k++){
                int resultado = primernum * k;
                String sortida = (primernum + " x " + k + " = " + resultado);
                System.out.println(sortida);
                myWriter.write(sortida + "\n");

                if(k==10){
                    k=-1;
                    primernum++;
                }
                if (primernum > segundonum) break;
            }
            myWriter.write("\n");

        }

        myReader.close();
        myWriter.close();
    }
    public void ejecutar_sobre_todos_los_archivos() throws IOException {
        System.out.println("Elije la ruta del directorio");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        File[] files = file.listFiles();
        int j = 0;

        FileWriter myWriter = null;
        Scanner lectura = null;
        for (File f : files) {
            j++;
            FileReader fr = new FileReader(f.getPath());
            lectura = new Scanner(fr);
            File sortida_file = new File("sortides/sortida" + j + ".txt");
            sortida_file.createNewFile();
            myWriter = new FileWriter(sortida_file);

            int lineas = lectura.nextInt();
            for (int i = 0; i < lineas; i++) {
                myWriter.write("Entrada " + (i + 1) + "\n");
                int primernum = Integer.parseInt(lectura.next());
                int segundonum = Integer.parseInt(lectura.next());

                if (primernum > segundonum) {
                    primernum = primernum + segundonum;
                    segundonum = primernum - segundonum;
                    primernum = primernum - segundonum;
                }
                for (int k = 0; k <= 10; k++) {
                    int resultado = primernum * k;
                    String sortida = (primernum + " x " + k + " = " + resultado);
                    System.out.println(sortida);
                    myWriter.write(sortida + "\n");

                    if (k == 10) {
                        k = -1;
                        primernum++;
                    }
                    if (primernum > segundonum) break;
                }
                myWriter.write("\n");
            }
            lectura.close();
            myWriter.close();
        }

    }
    public void modificacion_archivo_entrada() throws FileNotFoundException {
        System.out.println("Elije la ruta del fichero");
        String ruta = scanner.nextLine();
        File file = new File(ruta);
        Scanner lectura = new Scanner(file);
        while (lectura.hasNextLine()) {
            String data = lectura.nextLine();
            System.out.println(data);
        }
        lectura.close();
    }
    public void eliminacion_archivo(){

    }
    public void eliminacion_directorio(){

    }
}
