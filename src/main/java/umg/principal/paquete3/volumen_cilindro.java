package umg.principal.paquete3;

import java.util.Scanner;

public class volumen_cilindro {
    public void cilindro() {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario el valor del radio de la base
        System.out.print("Ingresa el valor del radio de la base del cilindro: ");
        double radio = scanner.nextDouble();

        // Solicitamos al usuario la altura del cilindro
        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calculamos el volumen
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Mostramos el resultado
        System.out.println("El volumen del cilindro con radio " + radio + " y altura " + altura + " es: " + volumen);

        // Cerramos el scanner
        scanner.close();
    }
}
