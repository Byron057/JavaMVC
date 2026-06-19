/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;
import Controllers.vehiculo_controller;
import Models.vehiculo_model;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class modelo_view {



public class vehiculo_view {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        vehiculo_controller controlador = new vehiculo_controller();
        int opcion;

        do {
            System.out.println("\n=== GESTIÓN DE VEHÍCULOS ===");
            System.out.println("1. Agregar vehículo");
            System.out.println("2. Listar vehículos");
            System.out.println("3. Buscar vehículo");
            System.out.println("4. Actualizar vehículo");
            System.out.println("5. Eliminar vehículo");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Marca: ");
                    String marca = sc.nextLine();

                    System.out.print("Modelo: ");
                    String modelo = sc.nextLine();

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    vehiculo_model vehiculo =
                            new vehiculo_model(id, marca, modelo, placa);

                    controlador.agregarVehiculo(vehiculo);
                    break;

                case 2:
                    controlador.listarVehiculos();
                    break;

                case 3:
                    System.out.print("Ingrese ID del vehículo: ");
                    int idBuscar = sc.nextInt();

                    vehiculo_model encontrado =
                            controlador.buscarVehiculo(idBuscar);

                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("ID del vehículo a actualizar: ");
                    int idActualizar = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nueva marca: ");
                    String nuevaMarca = sc.nextLine();

                    System.out.print("Nuevo modelo: ");
                    String nuevoModelo = sc.nextLine();

                    System.out.print("Nueva placa: ");
                    String nuevaPlaca = sc.nextLine();

                    if (controlador.actualizarVehiculo(
                            idActualizar,
                            nuevaMarca,
                            nuevoModelo,
                            nuevaPlaca)) {

                        System.out.println("Vehículo actualizado.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 5:
                    System.out.print("ID del vehículo a eliminar: ");
                    int idEliminar = sc.nextInt();

                    if (controlador.eliminarVehiculo(idEliminar)) {
                        System.out.println("Vehículo eliminado.");
                    } else {
                        System.out.println("Vehículo no encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
}
