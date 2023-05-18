/**
 * Para sistemas financieros hay que tener cuidado al utilizar los tipos de datos double y float ya
 * que suelen ocacionar algunos problemas de cáculo. Es mejor utilizar el tipo de dato
 * BigDecimal, aunque no se podrá utilizar operaciones básicas con sus variables si no que se
 * dispone de unos métodos especiales para éstas operaciones.
 */
package tipo.datos;

import java.math.BigDecimal;

public class BigDecimalTipo {
  public static void main(String[] args) {
    BigDecimal valorA = new BigDecimal(0.1f);
    /* valorA.multiply(4);  Tampoco es posible de esta manera ya que nos marca un error incompatible types */
    /* Se deben empatar los tipos a utilizar */
    BigDecimal valorB = new BigDecimal(4f);
    BigDecimal resultado = valorA.add(valorB);

    System.out.println(resultado.toString());

  }
}
