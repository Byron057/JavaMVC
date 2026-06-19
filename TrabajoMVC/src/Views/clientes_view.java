/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;
import Controllers.clientes_controller;
import Models.clientes_model;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class clientes_view {
    Scanner sc = new Scanner(System.in);
    clientes_controller control = new clientes_controller();
    int autoincrementablekey = 1;

    public void menu() {

        while (true) {
            System.out.println("===== CRUD CLIENTES =====");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    int id_cliente = autoincrementablekey++;
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = sc.nextLine();

                    System.out.print("Telefono: ");
                    int telefono = sc.nextInt();

                    clientes_model cliente = new clientes_model(
                            id_cliente, nombre, apellido, telefono);
                    control.agregarCliente(cliente);
                    break;

                case 2:
                    control.listarClientes();
                    break;

                case 3://actualizar
                    System.out.print("ID Cliente: ");
                    id_cliente = sc.nextInt();
                    sc.nextLine();
                     System.out.print("Nuevo nombre: ");
                    nombre = sc.nextLine();

                    System.out.print("Nuevo apellido: ");
                    apellido = sc.nextLine();

                    System.out.print("Nuevo telefono: ");
                    telefono = sc.nextInt();

                    if (control.actualizarCliente(id_cliente, nombre, apellido, telefono)) {
                        System.out.println("Cliente actualizado");
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
                    case 4://eliminar
                    System.out.print("ID Cliente: ");
                    id_cliente = sc.nextInt();

                    if (control.eliminarCliente(id_cliente)) {
                        System.out.println("Cliente eliminado");
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                    break;
                    case 5:
                    return;

                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }
}



        
    
    
    

