/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajomvc;
import java.util.Scanner;
import Views.vehiculo_view;
import Views.clientes_view;
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
            System.out.println("2.Crud clientes");
            System.out.println("3.");
            System.out.println("4.Salir");
            int opc = sc.nextInt();
            sc.nextLine();
            switch(opc){
                case 1:
                    vehiculo_view vehiculo= new vehiculo_view();
                    vehiculo.main();
                    break;
                case 2:
                    clientes_view clientes = new clientes_view();
                    clientes.menu();
                    break;
                case 3:
                    modelo_view modelo =new modelo_view();
                    modelo.menu();
                    break;
                    
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
