/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajomvc;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class TrabajoMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO code application logic here
        while(true){
            System.out.println("     Trabajo Grupo 8    ");
            System.out.println("========================");
            System.out.println("1.Crud Vehiculos");
            System.out.println("2.");
            System.out.println("3.");
            System.out.println("4.Salir");
            int opc = sc.nextInt();
            switch(opc){
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    //importar crud
                case 3:
                    //importar crud
                case 4:
                    System.out.println("Saliendo del Sistema.....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una Opcion Correcta");
            }
        }
        
    }
    
}
