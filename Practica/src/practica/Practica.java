
package practica;

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




  /* token: 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
    
 Modificadores UML
Símbolos utilizados para indicar modificadores de acceso para miembros de la clase:

+: Público
-: Privado
#: Protegido
/: Derivado (valor calculado o derivado)
~: Paquete (acceso predeterminado o a nivel de paquete)
¿Cómo dibujar un diagrama de
}
    _______________________________________________________
   |           Cuenta                                      |           
   |-------------------------------------------------------|
   |#saldo:float                                           |  
   |#numeroConsignaciones: int = 0                         |
   |#numeroRetiros: int = 0                                |
   |#tasaAnual:float                                       |
   |#comisionMensual: float = 0                            |
   |-------------------------------------------------------| 
   |<<constructor>>+Cuenta(float saldo, float tasaAnual)   | 
   |+consignar(float cantidad)                             |  
   |+retirar(float cantidad)                               | 
   |+calcularIntereses()                                   | 
   |+extractoMensual()                                     | 
   |_______________________________________________________| 
    
    
      _____________________________________________________
   |           CuentaAhorros                               |
   |-------------------------------------------------------|
   |#Activar: boolean                                      |
   |-------------------------------------------------------| 
   |<<constructor>>+CuentaAhorros(float saldo, float tasa) | 
   |+retirar(float cantidad)                               |  
   |+consignar(float cantidad)                             | 
   |+extractoMensual()                                     | 
   |+imprimir()                                            | 
   |_______________________________________________________| 
    
    
    
    ______________________________________________________
   |           CuentaCorriente                             |
   |-------------------------------------------------------|
   |#sobregiro: float                                      |
   |-------------------------------------------------------| 
   |<<constructor>>+CuentaCorriente(float saldo, float tasa)| 
   |+retirar(float cantidad)                               |  
   |+consignar(float cantidad)                             | 
   |+extractoMensual()                                     | 
   |+imprimir()                                            | 
   |_______________________________________________________| 
    
    
    
    
    
    
*/