public class CalculadoraGeometrica {
    //Metodo para calcular el área del circulo//
    public static double calcularAreaCirculo(double radio){
        return Math.PI * radio * radio;
    }
    //Metodo para calcular el área del rectángulo//
    public static double calcularAreaRectangulo(double largo, double ancho){
        return largo * ancho;
    }
    //Metodo principal
    public static void main(String[] args) {
        double areaCirculo= calcularAreaCirculo(5.0);
        double areaRectangulo = calcularAreaRectangulo(4.0, 6.0);

        System.out.println("Aréa del círculo;"+areaCirculo);
        System.out.println("Aréa del rectangulo;"+areaRectangulo);
    }
}
