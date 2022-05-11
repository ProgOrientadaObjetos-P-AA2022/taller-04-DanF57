package problema01;

/**
 *
 * @author Daniel
 */
public class Estudiante {

    private String nombre_estudiante;
    private double calMateria1;
    private double calMateria2;
    private double calMateria3;
    private double promedio;

    public Estudiante() {
        nombre_estudiante = "Daniel Flores";
        calMateria1 = 10;
        calMateria2 = 9.35;
        calMateria3 = 8.85;
    }

    public Estudiante(String nom, double cal1, double cal2, double cal3) {
        nombre_estudiante = nom;
        calMateria1 = cal1;
        calMateria2 = cal2;
        calMateria3 = cal3;
    }

    public void establecerNombreEstudiante(String c) {
        nombre_estudiante = c;
    }

    public void establecerCalMateria1(double c) {
        calMateria1 = c;
    }

    public void establecerCalMateria2(double c) {
        calMateria2 = c;
    }

    public void establecerCalMateria3(double c) {
        calMateria3 = c;
    }

    public void calcularPromedio() {
        promedio = (calMateria1 + calMateria2 + calMateria3) / 3;
    }

    public String obtenerNombreEstudiante() {
        return nombre_estudiante;
    }

    public double obtenerCalMateria1() {
        return calMateria1;
    }

    public double obtenerCalMateria2() {
        return calMateria2;
    }

    public double obtenerCalMateria3() {
        return calMateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Estudiante\n"
                + "Nombre de Estudiante: %s\n"
                + "Calificación Materia 1: %.2f\n"
                + "Calificación Materia 2: %.2f\n"
                + "Calificación Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                obtenerNombreEstudiante(),
                obtenerCalMateria1(),
                obtenerCalMateria2(),
                obtenerCalMateria3(),
                obtenerPromedio());
        return cadena;
    }

}
