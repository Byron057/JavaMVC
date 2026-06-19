/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosView;
import java.util.Scanner;
import VehiculosControllers.vehiculo_controller;
import VehiculosModels.vehiculo_model;

/**
 *
 * @author PC
 */
public class vehiculo_view {
    Scanner sc = new Scanner(System.in);
    int autoincrementablekey = 1;
    vehiculo_controller control = new vehiculo_controller();
    public void main(){
        while(true){
            System.out.println("Menu de Opciones");
            System.out.println("1.Agregar");
            System.out.println("2.Mostrar");
            System.out.println("3.Actualizar");
            System.out.println("4.Eliminar");
            System.out.println("5.Salir");
            System.out.println("======================");
            System.out.println("Ingrese una Opcion del Menu");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    int id_vehiculo=autoincrementablekey ++;
                    sc.nextLine();
                    System.out.println("Ingrese la Placa del Vehiculo [ABC-123]");
                    String placa = sc.nextLine();
                    System.out.println("Ingrese el Modelo del Vehiculo");
                    String modelo = sc.nextLine();
                    System.out.println("Ingrese el año del Vehiculo");
                    int año = sc.nextInt();
                    vehiculo_model vehiculo = new vehiculo_model(id_vehiculo, placa, modelo, año);
                    control.agregarVehiculo(vehiculo);
                    break;
            }
        }
    }
    
}
