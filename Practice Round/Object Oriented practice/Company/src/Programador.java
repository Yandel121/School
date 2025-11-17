public class Programador extends Empleado{
    private int horasExtra;
    private static final double  PAGO_HORA_EXTRA= 50.0;

    public Programador(String nombre, int IdEmpleado, double salarioBase, int horasExtra) {
        super(nombre, IdEmpleado, salarioBase);
        this.horasExtra=horasExtra;
    }

    @Override
    public double calcularSalario(){
        return super.calcularSalario()+(this.horasExtra*PAGO_HORA_EXTRA);

    }
}
