// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Radio radio = new Radio();

            while (true) {
                System.out.println("\nMenú de Radio:");
                System.out.println("1. Encender la radio");
                System.out.println("2. Cambiar de AM a FM o viceversa");
                System.out.println("3. Sintonizar emisora");
                System.out.println("4. Guardar emisora en un botón");
                System.out.println("5. Seleccionar emisora de un botón");
                System.out.println("6. Apagar la radio");
                System.out.print("Ingrese su elección (1-6): ");
                String opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        radio.encender();
                        break;
                    case "2":
                        radio.cambiarModo();
                        break;
                    case "3":
                        System.out.print("Ingrese la dirección (arriba/abajo): ");
                        String direccion = scanner.nextLine();
                        radio.sintonizarEstacion(direccion);
                        break;
                    case "4":
                        System.out.print("Ingrese el número de botón (1-12): ");
                        int botonGuardar = Integer.parseInt(scanner.nextLine());
                        radio.guardarPreseleccion(botonGuardar);
                        break;
                    case "5":
                        System.out.print("Ingrese el número de botón (1-12): ");
                        int botonSeleccionar = Integer.parseInt(scanner.nextLine());
                        radio.seleccionarPreseleccion(botonSeleccionar);
                        break;
                    case "6":
                        radio.apagar();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 6.");
                        break;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

