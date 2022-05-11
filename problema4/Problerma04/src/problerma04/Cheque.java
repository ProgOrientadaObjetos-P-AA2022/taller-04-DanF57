
package problerma04;

/**
 *
 * @author Daniel
 */
public class Cheque {

    private String nombre;
    private String banco;
    private double valor;
    private double comision;

    public Cheque() {
        nombre = "Gabriel Solano";
        banco = "Banco de Loja";
        valor = 6900;
    }

    public Cheque(String nom, String ban, double val) {
        nombre = nom;
        banco = ban;
        valor = val;
    }

    public void establecerNombre(String c) {
        nombre = c;
    }

    public void establecerBanco(String c) {
        banco = c;
    }

    public void establecerValor(double c) {
        valor = c;
    }

    public void calcularComision() {
        comision = valor * 0.003;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerBanco() {
        return banco;
    }

    public double obtenerValor() {
        return valor;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String cadena = String.format("Datos del Cheque\n"
                + "Nombre: %s\n"
                + "Banco: %s\n"
                + "Valor del Cheque %.2f\n"
                + "Comision %.2f\n",
                obtenerNombre(),
                obtenerBanco(),
                obtenerValor(),
                obtenerComision());
        return cadena;
    }
}
