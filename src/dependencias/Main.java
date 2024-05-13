package dependencias;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //solicitar los datos de los estudiantes por consola
        System.out.println("Ingrese el nombre del estudiante 1: ");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();

        System.out.println("Ingrese el numero de calificaciones");
        int numCalificaciones = entrada.nextInt();
        double[] calificaciones = new double[numCalificaciones];

        for (int i = 0; i < numCalificaciones; i++) {

            System.out.println("Ingrese la calificacion: " + (i + 1) + ": ");
            calificaciones[i] = entrada.nextDouble();

        }

        Estudiante e1 = new Estudiante(nombre, edad, calificaciones);

        //informacion del estudiante impresa
        e1.imprimirInformacion();
                
        

    }

}
