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
    public void listarClientes(){
        for(clientes_model cliente : listaClientes){
          System.out.println(cliente);
        }
    }
    public clientes_model buscarCliente(int id_cliente){
        for(clientes_model clientes: listaClientes){
          if(clientes.getIdCliente()== id_cliente){
              return clientes;
          }
        }
        return null;
    }
    public boolean eliminarCliente(int id_cliente){
       clientes_model clientes = buscarCliente(id_cliente);
       if(clientes != null){
        listaClientes.remove(clientes);
        return true;
       
       }else{
       return false;
       }
    }
    
}
