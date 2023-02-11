import javax.swing.*;

public class Ejercicio4 {
    /*Escriba un algoritmo que calcule la velocidad media de desplazamiento del usuario.

    A continuación, se muestra un ejemplo de posibles visualizaciones y entradas durante una ejecución del algoritmo (los valores introducidos por el usuario están escritos en negrita y cursiva):

    Introduzca la distancia recorrida (km).

            370

    Introduzca el tiempo del recorrido (min).

            240

    Se ha desplazado a una velocidad de 92,5 km/h.

     */
    public static void main(String[] args) {
        double distancia, tiempo, velocidad;
        distancia = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la distancia recorrida (km)."));
        tiempo = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el tiempo del recorrido (min)."));
        tiempo = tiempo / 60;
        velocidad = distancia / tiempo;
        JOptionPane.showMessageDialog(null, "Se ha desplazado a una velocidad de " + velocidad + " km/h.");
    }
    // Este algoritmo calcula la velocidad media de desplazamiento que el usuario ha introducido y la muestra en pantalla.
}
