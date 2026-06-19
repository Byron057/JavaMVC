/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;
import Controllers.clientes_controller;
import Models.clientes_model;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class clientes_view {
    Scanner sc = new Scanner(System.in);
    clientes_controller control = new clientes_controller();
    int autoincrementablekey = 1;

    public void menu() {

        while (true) {
            System.out.println("===== CRUD CLIENTES =====");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Actualizar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");

            int opcion = sc.nextInt();

        }
    
    
    
}
