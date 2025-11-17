public class Gerente extends Empleado{
private double bonoAnual;
    public Gerente(String nombre, int idEmpleado, double salarioBase, double bonoAnual) {
        super(nombre, idEmpleado, salarioBase);
        this.bonoAnual= bonoAnual;
    }
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.bonoAnual;
    }
}
