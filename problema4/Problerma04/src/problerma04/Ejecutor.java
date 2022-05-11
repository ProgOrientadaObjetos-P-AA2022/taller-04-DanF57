
package problerma04;

/**
 *
 * @author Daniel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nombre = "Daniel Flores";
        String banco = "Banco del Pichincha";
        double valor = 2022.123;

        Cheque cheque1 = new Cheque();
        cheque1.calcularComision();

        Cheque cheque2 = new Cheque(nombre, banco, valor);
        cheque2.calcularComision();

        System.out.printf("%s\n", cheque1);
        System.out.println("----------------------------");
        System.out.printf("%s\n", cheque2);
    }

}
