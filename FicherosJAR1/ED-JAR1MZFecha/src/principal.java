import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MZFecha fecha = new MZFecha();
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Establecer fecha");
            System.out.println("2. Imprimir fecha");
            System.out.println("3. Diferencia entre las dos fechas");
            System.out.println("4. Salir");
            System.out.print("Elige opción: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce día: ");
                    int dia = sc.nextInt();
                    System.out.print("Introduce mes: ");
                    int mes = sc.nextInt();
                    System.out.print("Introduce año: ");
                    int anyo = sc.nextInt();
                    fecha.setFecha(dia,mes,anyo);
                    break;

                case 2:
                    if (fecha != new MZFecha()) {
                        System.out.println("La fecha establecida es "+ fecha.getDia() + "/" + fecha.getMes() + "/" + fecha.getAnyo());
                    } else {
                        System.out.println("No hay fecha establecida.");
                    }
                    break;

                case 3:
                    System.out.print("Introduce dia: ");
                    int d2 = sc.nextInt();
                    System.out.print("Introduce mes: ");
                    int m2 = sc.nextInt();
                    System.out.print("Introduce año: ");
                    int a2 = sc.nextInt();
                    MZFecha otra = new MZFecha(d2, m2, a2);
                    int diferencia = fecha.diferenciaDias(otra);
                    System.out.println("La diferencia es de " + diferencia + " días.");
                    break;

                case 4:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
