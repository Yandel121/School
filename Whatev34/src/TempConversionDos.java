public class TempConversionDos {
    //Metodo de conversion Fahrenheit a Celsius
    public static double F_C(double F ) {
        double C = (F - 32) * 5 / 9;
        return C;
    }
    //Fahrenheit to Kelvin
    public static double F_K(double F) {
        double K = (F - 32) * 5 / 9+273.15;
        return K;
    }
        //Metodo Principal
        public static void main (String[]args){
            System.out.println(F_C(32));
            System.out.println(F_K(32));
        }

    }


