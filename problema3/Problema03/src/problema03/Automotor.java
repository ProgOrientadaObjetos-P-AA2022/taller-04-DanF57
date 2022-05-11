package problema03;

/**
 *
 * @author Daniel
 */
public class Automotor {

    private String cedula;
    private String marca;
    private int year;
    private double valorVehiculo;
    private double valorMatricula;

    public Automotor() {
        cedula = "11046530689";
        marca = "Hyundai";
        year = 2016;
        valorVehiculo = 30500.99;
    }

    public Automotor(String ced, String mar, int a, double valor) {
        cedula = ced;
        marca = mar;
        year = a;
        valorVehiculo = valor;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerMarca(String c) {
        marca = c;
    }

    public void establecerYear(int c) {
        year = c;
    }

    public void establecerValorVehiculo(double c) {
        valorVehiculo = c;
    }

    public void calcularMatricula() {
        int a;
        if (year == 2022) {
            a = 1;
        } else {
            a = 2022 - year;
        }
        valorMatricula = (valorVehiculo * 0.002) * a;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerMarca() {
        return marca;
    }

    public int obtenerYear() {
        return year;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Automotor\n"
                + "Cedula: %s\n"
                + "Marca: %s\n"
                + "Año de Fabricación: %d\n"
                + "Valor Vehiculo: %.2f\n"
                + "Valor Matricula: %.2f\n",
                obtenerCedula(),
                obtenerMarca(),
                obtenerYear(),
                obtenerValorVehiculo(),
                obtenerValorMatricula());
        return cadena;
    }

}
