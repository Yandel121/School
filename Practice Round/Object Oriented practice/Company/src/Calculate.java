import java.util.ArrayList;
import java.util.List;

public class Calculate {

public static void main(String[] args) {
//Crear instancias de las clases derivadas
            Empleado gerente1= new Gerente("Ana Lopez",1002, 15000, 5000);
            Empleado programador1= new Programador("Luis Pérez", 1003, 5000,20);

            // Usar polimorfismo para almacenar en una lista de tipo Empleado
    List<Empleado> empleados= new ArrayList<>();
    empleados.add(gerente1);
    empleados.add(programador1);

    //Recorrer la lista y calcular el salario de cada uno
    for (Empleado emp: empleados){
        System.out.println("Nombre\n"+emp.getNombre());
        System.out.println("ID:\n"+emp.getIdEmpleado());
        System.out.println("Salario Total: $"+emp.calcularSalario());
    }

}
}
