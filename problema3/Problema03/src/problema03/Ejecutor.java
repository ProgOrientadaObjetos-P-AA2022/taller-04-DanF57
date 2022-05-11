
package problema03;

/**
 *
 * @author Daniel
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String cedula = "1102060676";
        String marca = "Seat";
        int year = 2022;
        double valorVehiculo = 15000.99;

        Automotor auto1 = new Automotor();
        auto1.calcularMatricula();

        Automotor auto2 = new Automotor(cedula, marca, year, valorVehiculo);
        auto2.calcularMatricula();

        System.out.printf("%s\n", auto1);
        System.out.println("----------------------------");
        System.out.printf("%s\n", auto2);
    }
    
}
