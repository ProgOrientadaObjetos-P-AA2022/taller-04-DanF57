package problema02;

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
        String nombre = "William";
        String apellido = "Dafoe";
        String cedula = "1103456789";
        double sueldoBasico = 9.98;

        Profesor profe1 = new Profesor();
        profe1.calcularSueldoTotal();

        Profesor profe2 = new Profesor(nombre, apellido, cedula, sueldoBasico);
        profe2.calcularSueldoTotal();

        System.out.printf("%s\n", profe1);
        System.out.println("----------------------------");
        System.out.printf("%s\n", profe2);
    }

}
