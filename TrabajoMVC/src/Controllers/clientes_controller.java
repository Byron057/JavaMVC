/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;
import Models.clientes_model;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class clientes_controller {
    public ArrayList<clientes_model> listaClientes = new ArrayList<>();
    public void agregarCliente(clientes_model cliente){
      listaClientes.add(cliente);
        System.out.println("Cliente agregado con exito...");
    }
    
}
