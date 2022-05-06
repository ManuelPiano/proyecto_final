
package miprimeraaplicacionjava;
/*
 2-. Nos piden hacer un programa que calcule el valor de la moneda para los siguientes países: 
Europa, Reino Unido, Australia y Canadá. El programa tiene declarada una variable con el valor $100.00
de tipo double y tenemos que realizar la conversión de dólares a las monedas solicitadas.
A continuación se muestra los valores de conversión:
1 USD 0.70 Europa 0.61 Reino Unido 0.95 Australia 0.97 Canada
 */

public class Ejercicio2 {
    public static void main(String[] args) {
    
      double monedaEuropa, monedaReinoUnido, monedaAustralia, monedaCanada,dolares;
        monedaEuropa = 0.70;
        monedaReinoUnido = 0.61;
        monedaAustralia = 0.95;
        monedaCanada = 0.97;
        dolares = 100.00;
        
        monedaEuropa = monedaEuropa * dolares;
        monedaReinoUnido = monedaReinoUnido * dolares;
        monedaAustralia = monedaAustralia * dolares;
        monedaCanada = monedaCanada * dolares;
        
        System.out.println("Conversion de $100 a Moneda de Europa: " + monedaEuropa);
        System.out.println("Conversion de $100 a Moneda de Reino Unido: " + monedaReinoUnido);
        System.out.println("Conversion de $100 a Moneda de Australia: " + monedaAustralia);
        System.out.println("Conversion de $100 a Moneda de Canada: " + monedaCanada);
            
    }
    
}
