/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author estudiante308
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //crear objeto de la clase cuenta
        Cuenta cuenta1 = new Cuenta (10000, 0);
        cuenta1.imprimir();

        System.out.println();
        cuenta1.consignar(2501);
        cuenta1.imprimir();
        
        System.out.println();
        cuenta1.retirar(15000);
        cuenta1.imprimir();
    }
    
}
