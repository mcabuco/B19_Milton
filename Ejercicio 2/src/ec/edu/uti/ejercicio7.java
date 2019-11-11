
package ec.edu.uti;


public class ejercicio7 {

    private static int iva;
 public static void main(String[] args) {
     int triangulo= 180;
     double a= 60;
     double b= 60;
     double c= 60;
     double area;
     area= a+b+c;
     System.out.println( area);
     
     int valor1= 0;
     if ( valor1 > 0){
         System.out.println("Es positivo");
         
     }
     else 
     {
         System.out.println("Es negativo");
         
     }
     int subtotal= 100;
     int IVA12 = 12;
     int descuento=5;
     int total=112;
     if (subtotal > 100){
         descuento =subtotal*5/100;
     }
      iva = subtotal*12/100;
     
     total = subtotal+iva-descuento;
     System.out.println(total);
    
     
     
      
      
     
         
         
         
     }
             
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 }

