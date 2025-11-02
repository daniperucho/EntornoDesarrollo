import es.iesmz.prueba.Coche;

import java.util.Scanner;
import es.iesmz.prueba.Coche;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear el cotxe inicial
        Coche coche = new Coche("Fiat", "Panda", "Groc");

        boolean salir = false;
        while (!salir) {
            System.out.println("\nMENÚ");
            System.out.println("1. Imprimir dades del cotxe");
            System.out.println("2. Pintar el cotxe");
            System.out.println("3. Establir Marca");
            System.out.println("4. Establir Model");
            System.out.println("5. Establir Color");
            System.out.println("6. Accelerar");
            System.out.println("7. Frenar");
            System.out.println("8. Parar");
            System.out.println("9. Eixir");
            System.out.print("Escriu una opció: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    coche.imprime();
                    break;

                case 2:
                    coche.pinta();
                    break;

                case 3:
                    System.out.print("Nova marca: ");
                    String marca = sc.nextLine();
                    coche.setMarca(marca);
                    break;

                case 4:
                    System.out.print("Nou model: ");
                    String modelo = sc.nextLine();
                    coche.setModelo(modelo);
                    break;

                case 5:
                    System.out.print("Nou color: ");
                    String color = sc.nextLine();
                    coche.setColor(color);
                    break;

                case 6:
                    System.out.print("Velocitat a accelerar: ");
                    int v = sc.nextInt();
                    coche.acelera(v);
                    break;

                case 7:
                    System.out.print("Velocitat a frenar: ");
                    int f = sc.nextInt();
                    coche.frena(f);
                    break;

                case 8:
                    coche.para();
                    break;

                case 9:
                    salir = true;
                    break;

                default:
                    System.out.println("Opció no vàlida.");
            }
        }
        sc.close();
    }
}