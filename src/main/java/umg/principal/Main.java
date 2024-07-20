package umg.principal;

import umg.principal.paquete1.area_circulo;
import umg.principal.paquete2.area_triangulo;
import umg.principal.paquete3.volumen_cilindro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int opcion;

        System.out.println("1. area triangulo");
        System.out.println("2 area circulo ");
        System.out.println("3 volumen de cilindro");

        opcion = sc.nextInt();

      switch (opcion){
          case 1:
              area_triangulo t = new area_triangulo();
              t.triangulo();
              break;

          case 2:
              area_circulo c = new area_circulo();
              c.circulo();
              break;

          case 3:
              volumen_cilindro ci = new volumen_cilindro();
              ci.cilindro();
              break;
      }

    }
}