package umg.principal.paquete2;

import java.util.Scanner;

public class area_triangulo {
    public void triangulo() {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos al usuario la longitud de la base
        System.out.print("Ingresa la longitud de la base del triángulo: ");
        double base = scanner.nextDouble();

        // Solicitamos al usuario la altura del triángulo
        System.out.print("Ingresa la altura del triángulo: ");
        double altura = scanner.nextDouble();

        // Calculamos el área
        double area = 0.5 * base * altura;

        // Mostramos el resultado
        System.out.println("El área del triángulo con base " + base + " y altura " + altura + " es: " + area);

        // Cerramos el scanner
        scanner.close();
    }

}
