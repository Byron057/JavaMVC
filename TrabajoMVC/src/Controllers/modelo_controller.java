/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Models.vehiculo_model;
import java.util.HashMap;
/**
 *
 * @author HP
 */
public class modelo_controller {


public class vehiculo_controller {

    private HashMap<Integer, vehiculo_model> listaVehiculos = new HashMap<>();

    // Agregar
    public void agregarVehiculo(vehiculo_model vehiculo) {
        listaVehiculos.put(vehiculo.getIdVehiculo(), vehiculo);
        System.out.println("Vehículo agregado con éxito.");
    }

    