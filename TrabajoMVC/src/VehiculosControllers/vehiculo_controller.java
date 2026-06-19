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
    public void listarVehiculos(){
        for(vehiculo_model vehiculo : listaVehiculos){
            System.out.println(vehiculo);
        }
    }
    public vehiculo_model buscarVehiculo(int id_vehiculo){
        for(vehiculo_model vehiculo : listaVehiculos){
            if(vehiculo.getIdVehiculo() == id_vehiculo){
                return vehiculo;
            }
        }
        return  null;
    }
    public boolean eliminarVehiculo(int id_vehiculo){
        vehiculo_model vehiculo= buscarVehiculo(id_vehiculo);
        if(vehiculo!=null){
            listaVehiculos.remove(id_vehiculo);
            return true;
        }else{
            return false;
        }
    }
}

