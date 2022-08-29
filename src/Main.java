import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //arithmeticException();
        //arrayIndexOutOfBounds();
        fileNotFound();
    }

    public static void arithmeticException() {
        int a = 0, b = 10, c = 0;
        try {
            c = b / a;
        } catch (ArithmeticException error) {
            error.printStackTrace();
            System.out.println("ArithmeticException: Error - el denominador es cero");
        }
        System.out.println("Valor de c es: " + c);
    }

    public static void arrayIndexOutOfBounds() {
        int[] arrayValues = new int[6];
        for (int x = 0; x < arrayValues.length; x++) {
            arrayValues[x] = x;
            System.out.println( arrayValues[x] );
        }
        try {
            System.out.println( arrayValues[9] );
        } catch ( ArrayIndexOutOfBoundsException error ) {
            System.out.println("No se encuentra el indice" + error.getMessage());
            error.printStackTrace();
        }
    }

    public static void fileNotFound() {
        try {
            File miFichero = new File("fichero.txt");
            Scanner myReader = new Scanner(miFichero);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrio un error en la lectura");
            e.printStackTrace();
        }
    }
}