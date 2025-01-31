public class TempConversionDos {

    // File: TempConversionDos.java
    // Author: Yandel Colón Rivera
    // Date: 2025-1-30
    // Class: COMP 2315 Structured Programming
    // Description: A program that outputs every even number from 2 through 200.
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
    //Fahrenheit to Rankine
    public static double F_R(double F) {
        double R = F+459.67;
        return R;
    }
    //Celsius to Fahrenheit
    public static double C_F(double C) {
        double F = (C*1.8)+32;
        return F;
    }
    //Celsius to Kelvin
    public static double C_K(double C) {
        double K = C+273.15;
        return K;
    }
    //Celsius to Rankine
    public static double C_R(double C) {
        double R = (C+273.15)*1.8;
        return R;
    }
    //Kelvin to Fahrenheit
    public static double K_F(double K) {
        double F = (K-273.15)*1.8+32;
        return F;
    }
    //Kelvin to Celsius
    public static double K_C(double K) {
        double C = K-273.15;
        return C;
    }
    //Kelvin to Rankine
    public static double K_R(double K) {
        double R = K*1.8;
        return R;
    }
    //Rankine to Fahrenheit
    public static double R_F(double R) {
        double F = R-459.67;
        return F;
    }
    //Rankine to Celsius
    public static double R_C(double R) {
        double C =-+459.67*5/9;
        return C;
    }
    //Rankine to Kelvin//
    public static double R_K(double R) {
        double K= (R-491.67)/1.79999999+273.15;
        return K;
    }
        //Metodo Principal
        public static void main (String[]args){
            System.out.println("Fahrenheit to Celsius:\t"+F_C(32));
            System.out.println("Fahrenheit to Kelvin:\t"+F_K(32));
            System.out.println("Fahrenheit to Rankine:\t"+F_R(32));
            System.out.println("Celsius to Fahrenheit:\t"+C_F(32));
            System.out.println("Celsius to Kelvin:\t"+C_K(32));
            System.out.println("Celsius to Rankine:\t"+C_R(32));
            System.out.println("Kelvin to Fahrenheit:\t"+K_F(32));
            System.out.println("Kelvin to Celsius:\t"+K_C(32));
            System.out.println("Kelvin to Rankine:\t"+K_R(32));
            System.out.println("Rankine to Fahrenheit:\t"+R_F(32));
            System.out.println("Rankine to Celsius:\t"+R_C(32));
            System.out.println("Rankine to Kelvin:\t"+R_K(32));

        }

    }


