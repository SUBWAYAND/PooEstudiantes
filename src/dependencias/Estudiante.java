
/*
La universidade desea manejar dependencias para lo siguiente:
Estudiantes, docentes y administrativos.

Para los estudiantes: Nombre, Edad, calificaciones y calcular promedio. 

 */
package dependencias;

public class Estudiante {

    //Atributos
    String nombre;
    int edad;
    double[] calificaciones;
    // Vector es mas de un array 

    //Constructor
    public Estudiante(String nombre, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;

    }

    //Metodo para imprimir informacion de lo estudiantes
    public void imprimirInformacion() {

        System.out.println("INFORMACION DEL ESTUDIANTE");
        System.out.println("Nombre: " + nombre);
        System.out.println("" + edad);
        System.out.println("Calificaciones: ");//Le asiganemos un ciclo for para recorrer las calificaciones
        /*
        Un ciclo for se compone de 3 pasos ( for(inicializacion; condicion; incremento o decremento)
        length me ayuda a recorrer una lista o vector
        
         */
        for (int i = 0; i < calificaciones.length; i++) {

            System.out.println("calificacion" + (i + 1) + ": " + calificaciones[i]);
            /*Le asignamos el iterador "i" para que nos
            incremente el numero de notas, por si algun estudiante tiene mas notas que otro
             */

        }

    }

    public double calcularPromedio() {

        double suma = 0;

        for (double i : calificaciones) {

            suma += i;

        }
        return suma / calificaciones.length;
    }

}
