package promediomenormayor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PromedioMenorMayor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("#.0");
        int n = 0;
        int uno = 0;
        int suma = 0;
        double prom = 0;
        int mayor = 0;
        int menor = 1000000000;

        System.out.println("¿Cuantos valores vas a ingresar?");
        n = entrada.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Ingresa el valor " + (i+1));
            uno = entrada.nextInt();
            suma += uno;
            prom = (double) suma/n;
            
            for (int j = 0; j < n; j++){
                if (mayor < uno){
                    mayor = uno;
                }
                if (menor > uno){
                    menor = uno;
                }
            }
        }
        System.out.println("Promedio: " + dec.format(prom));
        System.out.println("Valor mayor: " + mayor);
        System.out.println("Valor menor: " + menor);
    }

}
 