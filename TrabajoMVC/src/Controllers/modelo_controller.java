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

    // Listar
    public void listarVehiculos() {

        if (listaVehiculos.isEmpty()) {
            System.out.println("No existen vehículos registrados.");
        } else {

            for (vehiculo_model vehiculo : listaVehiculos.values()) {
                System.out.println(vehiculo);
            }
        }
    }

    // Buscar
    public vehiculo_model buscarVehiculo(int idVehiculo) {
        return listaVehiculos.get(idVehiculo);
    }

    // Eliminar
    public boolean eliminarVehiculo(int idVehiculo) {

        if (listaVehiculos.containsKey(idVehiculo)) {
            listaVehiculos.remove(idVehiculo);
            return true;
        }

        return false;
    }

    // Actualizar
    public boolean actualizarVehiculo(int idVehiculo,
                                      String marca,
                                      String modelo,
                                      String placa) {

        vehiculo_model vehiculo = listaVehiculos.get(idVehiculo);

        if (vehiculo != null) {

            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            vehiculo.setPlaca(placa);

            return true;
        }

        return false;
    }
}