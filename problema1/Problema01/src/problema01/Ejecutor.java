package problema01;

/**
 *
 * @author Daniel
 */
public class Ejecutor {
    //
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = "Jorge Cango";
        double calMateria1 = 9.98;
        double calMateria2 = 8.45;
        double calMateria3 = 6.40;

        Estudiante estu1 = new Estudiante();
        estu1.calcularPromedio();

        Estudiante estu2 = new Estudiante(nombre, calMateria1, 
                                          calMateria2, calMateria3);
        estu2.calcularPromedio();

        System.out.printf("%s\n", estu1);
        System.out.println("----------------------------");
        System.out.printf("%s\n", estu2);
    }

}
