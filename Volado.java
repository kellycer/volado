package Arreglos;

import java.security.SecureRandom;

public class Volado {

    public static void main(String[] args) {

        int[] volado = new int[3];
         final int AGUILA = 1;
         final int SOL = 2;
         final int LANZAMIENTOS = 100;

         volado[AGUILA] =0;
         volado[SOL] = 0;
        SecureRandom random = new SecureRandom();

         for (int i=0; i<LANZAMIENTOS; i++){
             Lanzamiento= random.nextInt(2)+1;
             if (LANZAMIENTOS==AGUILA){
                 volado[AGUILA]= volado[AGUILA]+1;
             }
             if (LANZAMIENTOS==SOL) {
                 volado[SOL] = volado[SOL] + 1;
             }
         }
    }
}
