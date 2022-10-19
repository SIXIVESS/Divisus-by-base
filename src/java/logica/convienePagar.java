
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 * Clase que analiza si es realmente conveniente hacer un pago aprovechando el
 * precio de el dolar mediante datos pasados, y aproximaciones de FXStreet,
 * donde participan tanto periodistas como analistas y algoritmos para dar una
 * prediccion lo mas exacta posible sobre el futuro estado y tendencia del dolar
 * basándose tanto en datos cuantitativos como no cuantitativos
 *
 * @author kim
 */
public class convienePagar {
    //El atributo prom6Meses es el valor promedio que el dolar ha tenido 6 meses antes desde la fecha actual
    public float prom6Meses = 20.13f;
    //La tendencia es el parametro que nos indica si el dolar tiene tendencia a subir o bajar de precio
    //Su valor es 1 si la tendencia es positiva y -1 en caso contrario
    public int tendencia = 1;
    //El valor actual hace referencia a lo que vale el Dolar en MXN  a dia de hoy
    public float valorActual = 19.87f;

    /**
     * Metodo que analiza si vale la pena pagar algo ahora dependiendo del valor
     * actual de la divisa USD
     *
     * @param transferencia Objeto transferencia a analizar para tomar su fecha
     * y si falta 3 dias o mas para el pago el metodo puede hacer las
     * validaciones que involucren a la tendencia
     * @return Cadena de texto que contiene 2 palabras, la primena nos indica si
     * el valor actual de la divisa esta por encima o por debajo del promedio de
     * los ultimos 6 meses y la segunda palabra nos indica si la tendencia de la
     * divisa esta por subir o bajar
     */
    public String valeLaPenaPagar(Transferencia transferencia, int diaActual) {
        String estado;
        int dia =0;
        dia = diaActual;
        //Valora el estado actual de la moneda en comparacion con el promedio
        if (this.valorActual >= this.prom6Meses) {
            //Valor actual por encima del promedio
            estado = "El valor del dolar está por encima del promedio";
        } else {
            //Valor actual por debajo del promedio
            estado = "El valor del dolar está por debajo del promedio";
        }

        //Verifica si fecha de pago es menor a 3 dias
        if (transferencia.getFecha()-diaActual < 3) {
            //Fecha menor a 3 dias, no se toma en cuenta la tendencia
            return estado;
        }

        //Valora la tendencia de la divisa 
        if (this.tendencia == -1) {
            //Se espera que el valor de la divisa baje
            return estado + " y tiende a bajar";
        } else {
            //Se espera que el valor de la divisa suba
            return estado + " y tiende a subir";
        }
        
//        if (this.valorActual >= this.prom6Meses && this.tendencia == 1) {
//            //Encima del promedio y no se espera que baje
//            return "Encima sube";
//        } //Agregar a este metodo una validacion de que el pago es en 3 dias o mas
//        else if (this.valorActual >= this.prom6Meses && this.tendencia == -1) {
//            //Valor encima del promedio pero se espera que baje
//            if (transferencia.getFecha() >= 3) {
//                return "Encima baja";
//            }else{
//                return "Encima";
//            }
//        } else if (this.valorActual < this.prom6Meses && this.tendencia == 1) {
//            //Valor por debajo del promedio pero se espera que suba
//            return "Debajo sube";
//        } //Añadir validacion de que el pago es en 3 dias o más
//        else if (this.valorActual < this.prom6Meses && this.tendencia == -1) {
//            //Valor por debajo del promedio pero se espera que baje
//            if (transferencia.getFecha() >= 3) {
//                //Fecha por debajo de los 3 dias, no se toma en cuenta la tendencia
//                return "Debajo baja";
//            }else{
//                //Fecha por debajo de los 3 dias, no se toma en cuenta la tendencia
//                return "Debajo";
//            }
//        }

        //Este return deberia ser el valor de la ultima validacion 
        //Pero aun no termino las validaciones son varias
        //El chiste es solamente jugar con las dif combinaciones
        //Del valor actual, prom, tendencia y si el pago es a futuro (3 dias+) o no
    }
}
