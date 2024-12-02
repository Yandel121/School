// File: Proyecto Final
// Author:Hector M De Jesus Menard,Yandel Colon Rivera,Isael robles Maldonado,Nensin Perez fernandez
//﻿ Date: 2024-11-27
// Class: COMP 2120 Programming Logic﻿
// Description: Programa que saca una tabla de multiplicasion
//import para poner un panel estetico al programa
import javax.swing.JOptionPane;

public class Final {

    public static void main(String[] args) {
//Declaracion de variables en el programa

        int firstNumber;
        int secondNumber;
        int answer;
        int result;
        String response;
//Empiezan los Procesos
        do {
//Primer Proceso
            firstNumber = (int)( Math.random () * 10 + 1);
//segundo proceso
            secondNumber = (int)( Math.random () * 10 + 1);
//Declarando una variable
            result = firstNumber * secondNumber;
//Implementando un panel estetico al progrma(solo es visual)
            answer=Integer.parseInt(JOptionPane.showInputDialog( null , firstNumber + " x " + secondNumber + " = " ));
//El programa analiza la respuesta, si este esta correcto o no
            if(result == answer){
                JOptionPane.showMessageDialog(null,"Correcto");
            }else{
                JOptionPane.showMessageDialog(null,"Incorrecto" );

            }
            //Decision para repetir el programa
            response = JOptionPane.showInputDialog("Deseas repetir el programa?(Si o No)");
        }while(response.equalsIgnoreCase("Si"));
        JOptionPane.showMessageDialog(null,"Adios");
    }

}