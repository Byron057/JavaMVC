/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Usuario
 */
public class clientes_model {
    public int id_cliente;
    public String nombre;
    public String apellido;
    public int telefono;
    
    public clientes_model(int id_cliente,String nombre,String apellido,int telefono){
      this.id_cliente =id_cliente;
      this.nombre = nombre;
      this.apellido = apellido;
      this.telefono = telefono;
      
    }
    public int getIdCliente(){
    return id_cliente;
    
    }
    public String getNombre(){
    return nombre;

    }
    public String getApellido(){
    return apellido;
    }
    public int getTelefono(){
    return telefono;
    }
    public void setIdCliente(int id_cliente){
     this.id_cliente = id_cliente;
    }
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public void setApellido(String apellido){
    this.apellido = apellido;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}
