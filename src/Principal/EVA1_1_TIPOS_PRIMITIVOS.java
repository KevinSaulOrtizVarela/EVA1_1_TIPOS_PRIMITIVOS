

/*PROYECTO INICIAL PARA CONOCER E IDENTIFICAR
LOS TIPOS DE DATOS PRIMITIVOS EN JAVA*/

package Principal;

import java.util.Scanner;

/**
 *
 * @author 16550549
 */
public class EVA1_1_TIPOS_PRIMITIVOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sNom;
        int iEdad;
        double dSal;
        
        Scanner sScanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        sNom = sScanner.nextLine();
        System.out.println("Introduce tu Edad");
        iEdad = sScanner.nextInt();
        System.out.println("Introduce tu Salario");
        dSal = sScanner.nextDouble();
        
        hacerAlgo(sNom, iEdad, dSal);
    }
    
    /**
     * Ejemplo para comentarios usando javadoc
     * @param sNombre
     * @param nombre ejemplo usando String
     * @param iEdad ejemplo usando enteros
     * @param dSalario ejemplo usando double
     */
    
    public static void hacerAlgo(String sNombre, int iEdad, double dSalario){
     
        System.out.println(sNombre + " " + iEdad + " " + dSalario + " ");
    }
}
