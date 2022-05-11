package problema02;

/**
 *
 * @author Daniel
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;
    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor() {
        nombre = "Gabriel";
        apellido = "Conde";
        cedula = "1100303202";
        sueldoBasico = 580.99;
    }

    public Profesor(String nom, String ape, String ced, double sueldoB) {
        nombre = nom;
        apellido = ape;
        cedula = ced;
        sueldoBasico = sueldoB;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerApellido(String c) {
        apellido = c;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerSueldoBasico(double c) {
        sueldoBasico = c;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (sueldoBasico) + (sueldoBasico * 0.2);
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Cedula: %s\n"
                + "Sueldo Basico %.2f\n"
                + "Sueldo Total %.2f\n",
                obtenerNombre(),
                obtenerApellido(),
                obtenerCedula(),
                obtenerSueldoBasico(),
                obtenerSueldoTotal());
        return cadena;
    }
}
