package umg.principal.paquete1;

import java.util.Scanner;

public class area_circulo {
    public void circulo() {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario el valor del radio
        System.out.print("Ingresa el valor del radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calculamos el área
        double area = Math.PI * Math.pow(radio, 2);

        // Mostramos el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        // Cerramos el scanner
        scanner.close();
    }




}
