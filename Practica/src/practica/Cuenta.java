
package practica;

public class Cuenta {
    
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual;

   public Cuenta(float saldo, float tasaAnual){
   
   this.saldo = saldo;
   this.tasaAnual = tasaAnual;
   
   }
   
   public void imprimir() {
       
       System.out.println("Saldo: " + saldo);
       System.out.println("Numero de consignaciones : " + numeroConsignaciones);
       System.out.println("Numero de retiros: " + numeroRetiros);
       System.out.println("Tasa Anual: " + tasaAnual);
       System.out.println("Comision Mensual: " + comisionMensual);

   }
}
