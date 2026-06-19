/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VehiculosModels;

/**
 *
 * @author PC
 */
public class vehiculo_model {
    public int id_vehiculo;
    public String placa;
    public String modelo;
    public int año;
    
    public vehiculo_model(int id_vehiculo, String placa, String modelo, int año){
        this.id_vehiculo = id_vehiculo;
        this.placa = placa;
        this.modelo = modelo;
        this.año = año;
    }
    public int getIdVehiculo(){
        return id_vehiculo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAño(){
        return año;
    }
}
