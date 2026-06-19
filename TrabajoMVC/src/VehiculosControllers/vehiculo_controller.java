/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosControllers;
import VehiculosModels.vehiculo_model;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class vehiculo_controller {
    public ArrayList<vehiculo_model> listaVehiculos = new ArrayList<>();
    public void agregarVehiculo(vehiculo_model vehiculo){
        listaVehiculos.add(vehiculo);
        System.out.println("Vehiculo Agregado con Exito");
    }
}
