import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.lang.reflect.Array;
import java.util.Collections;

public class Taller_1 {

    public static void main(String[] args) {

        try (Scanner lector = new Scanner(System.in)) {
            String Validar;
            int Seleccion_Punto = 0;
            int Seleccion_bucle;

            System.out.println("");
            System.out.println("hola bienvenido");
            System.out.println("este es el menu para el taller #1 las opciones son: ");
            System.out.println(
                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar. ");
            System.out.println(
                    "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
            System.out.println(
                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
            System.out.println("5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

            System.out.print("Por favor escoger la opción que desea ver: ");
            Validar = lector.nextLine();
            if (Validar.matches("[1-5]")) {
                Seleccion_Punto = Integer.parseInt(Validar);
            } else {
                System.out.println("");
                while (!Validar.matches("[1-5]")) {
                    System.out.println("");
                    System.out.println("por favor escoja una respuesta de selección numérica ");
                    System.out.println(
                            "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar. ");
                    System.out.println(
                            "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                    System.out.println(
                            "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                    System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                    System.out.println(
                            "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                    System.out.println("coloque el numero que va a seleccionar es: ");
                    Validar = lector.nextLine();
                }
                Seleccion_Punto = Integer.parseInt(Validar);
            }
            System.out.println("");
            boolean repite_seleccion_punto = true;
            Boolean repite_seleccion_bucle = true;
            int contador = 0;
            int contador2 = 0;
            do {
                if (Seleccion_Punto <= 5 & Seleccion_Punto >= 1) {
                    switch (Seleccion_Punto) {
                        case 1:

                            System.out.println("");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");

                            Random numA = new Random();
                            int multiplicado, multiplicador, producto;
                            multiplicado = numA.nextInt(2023) + 1;
                            multiplicador = numA.nextInt(2023) + 1;

                            int[] productos = new int[multiplicador + 1];

                            System.out.println("");
                            System.out.println(" los números que salieron son: ");
                            System.out.println("multiplicado = " + multiplicado);
                            System.out
                                    .println("el multiplicado va a ser multiplicado hasta el numero " + multiplicador);

                            System.out.println("");
                            System.out.println("por favor escoja con cual bucle desea ver las multiplicaciones: ");
                            System.out.println("1) do-while");
                            System.out.println("2) while");
                            System.out.println("3) for");
                            System.out.println("4) for each");
                            System.out.print("coloque el numero de la opción que va a escoger: ");

                            Validar = lector.nextLine();
                            if (Validar.matches("[1-4]")) {
                                Seleccion_bucle = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-4]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.println("coloque el bucle que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_bucle = Integer.parseInt(Validar);
                            }
                            System.out.println("");

                            do {
                                if (Seleccion_bucle <= 4 & Seleccion_bucle >= 1) {
                                    switch (Seleccion_bucle) {
                                        case 1: // do while
                                            contador = 0;
                                            do {
                                                producto = multiplicado * contador;
                                                System.out.println(
                                                        multiplicado + "*" + contador + "=" + producto);
                                                contador = contador + 1;
                                            } while (contador <= multiplicador);
                                            System.out.println("do while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) repetir do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) repetir do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 2: // while
                                            contador = 0;
                                            while (contador <= multiplicador) {
                                                producto = multiplicado * contador;
                                                System.out.println(
                                                        multiplicado + "*" + contador + "=" + producto);
                                                contador = contador + 1;
                                            }
                                            System.out.println("while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) repetir while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) repetir while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 3:// for

                                            for (contador = 0; contador <= multiplicador; contador++) {
                                                producto = multiplicado * contador;
                                                System.out.println(
                                                        multiplicado + "*" + contador + "=" + producto);
                                            }
                                            System.out.println("for");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) repetir for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) repetir for");
                                                        System.out.println("4) for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }
                                            break;
                                        case 4:// foreach

                                            for (contador = 0; contador <= multiplicador; contador++) {
                                                producto = multiplicado * contador;
                                                productos[contador] = producto;
                                            }
                                            contador = 0;
                                            for (int contar : productos) {
                                                contar = contador;
                                                System.out
                                                        .println(multiplicado + "*" + contar + "=" + productos[contar]);
                                                contador++;
                                            }
                                            System.out.println("foreach");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) repetir foreach");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) repetir for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                    }
                                } else {
                                    System.out.println("");
                                    System.out.println(
                                            "profe por favor rinda se con el tema de intentar tumbarme el código con la cuestión de colocar un numero de opción que no se pude ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.print("coloque el numero de la opción que va a escoger: ");
                                    Seleccion_bucle = lector.nextInt();
                                }
                            } while (repite_seleccion_bucle == true);

                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-2]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-2]")) {
                                    System.out.println("");
                                    System.out.println(
                                            "por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) si 2) no ");
                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("hasta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[2-5]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[2-5]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de seleccion valida ");
                                    System.out.println(
                                            "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                                    System.out.println(
                                            "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                                    System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                    System.out.println(
                                            "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                    System.out.println("coloque el numero que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            switch (Seleccion_Punto) {
                                case 2:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 4:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            break;

                        // fin punto 1

                        case 2:

                            System.out.println(
                                    "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                            System.out.println("");

                            int num_max = (int) (Math.random() * 4 + 1);
                            int[] list_num = new int[num_max];
                            int rang_1, rang_2, moda, contador3, contador4;
                            double mediana_par;
                            rang_1 = 0;
                            rang_2 = 0;
                            double mitad_vec = num_max / 2;
                            double residuo = num_max % 2;
                            Math.round(mitad_vec);
                            double a = mitad_vec + 1;
                            double media = 0;

                            System.out.println("el numero maximo de numeros que se pueden registrar es de " + num_max);

                            for (int j = 0; j < list_num.length; j++) {
                                System.out.println("por favor digitar el valor #" + (j + 1));
                                list_num[j] = lector.nextInt();
                                Validar = lector.nextLine();

                            }
                            System.out.println("");

                            System.out.println("");
                            System.out.println("por favor escoja con cual bucle desea ver las multiplicaciones: ");
                            System.out.println("1) do-while");
                            System.out.println("2) while");
                            System.out.println("3) for");
                            System.out.println("4) for each");
                            System.out.print("coloque el numero de la opción que va a escoger: ");

                            Validar = lector.nextLine();
                            if (Validar.matches("[1-4]")) {
                                Seleccion_bucle = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-4]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.println("coloque el bucle que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_bucle = Integer.parseInt(Validar);
                            }
                            System.out.println("");

                            do {
                                if (Seleccion_bucle <= 4 & Seleccion_bucle >= 1) {
                                    switch (Seleccion_bucle) {
                                        case 1: // do while

                                            // mediana

                                            if (num_max == 1) {
                                                System.out.println("la mediana de este ejercicio es: 1");
                                            }

                                            contador = 0;
                                            if (residuo == 0 & num_max != 1) {

                                                do {
                                                    switch (num_max) {
                                                        case 2:
                                                            if (contador == mitad_vec) {

                                                                rang_1 = list_num[contador - 1];
                                                            }
                                                            if (contador == (int) a) {

                                                                rang_2 = list_num[contador - 1];

                                                            }
                                                            break;

                                                        case 4:
                                                            if (contador == mitad_vec) {
                                                                rang_1 = list_num[contador - 1];
                                                            } else {
                                                                if (contador == a) {
                                                                    rang_2 = list_num[contador - 1];
                                                                }
                                                            }
                                                            break;
                                                    }

                                                    contador++;
                                                } while (contador <= list_num.length);

                                                mediana_par = rang_1 + rang_2;

                                                mediana_par = mediana_par / 2;
                                                System.out.println("la mediana es de " + mediana_par);
                                                mediana_par = 0;
                                                rang_1 = 0;
                                                rang_2 = 0;

                                            } else {
                                                do {
                                                    if (contador == mitad_vec) {
                                                        System.out.println(
                                                                "la mediana es: " + list_num[(int) mitad_vec]);
                                                    }
                                                    contador++;
                                                } while (contador < list_num.length);

                                            }

                                            // media
                                            contador = 0;
                                            media = 0;
                                            do {
                                                media = media + list_num[contador];
                                                contador++;
                                            } while (contador < list_num.length);

                                            media = media / num_max;
                                            System.out.println("");
                                            System.out.println("la media de los datos dados es: " + (media));

                                            // moda
                                            moda = 0;
                                            contador2 = -1;
                                            contador3 = 0;
                                            contador4 = 0;

                                            do {
                                                contador = 0;
                                                do {
                                                    if (list_num[contador3] == list_num[contador4]) {
                                                        contador = contador++;
                                                    }
                                                    contador4++;
                                                } while (contador4 > list_num.length);

                                                if (contador > contador2) {

                                                    moda = list_num[contador3];
                                                    contador2 = contador;

                                                }
                                                contador3++;
                                            } while (contador3 >= list_num.length);
                                            System.out.println("la moda es: " + moda);

                                            System.out.println("do while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) repetir do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) repetir do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 2: // while
                                            contador = 0;
                                            // mediana

                                            if (num_max == 1) {
                                                System.out.println("la mediana de este ejercicio es: 1");
                                            }

                                            contador = 0;
                                            if (residuo == 0 & num_max != 1) {

                                                while (contador <= list_num.length) {
                                                    switch (num_max) {
                                                        case 2:
                                                            if (contador == mitad_vec) {

                                                                rang_1 = list_num[contador - 1];
                                                            }
                                                            if (contador == (int) a) {

                                                                rang_2 = list_num[contador - 1];

                                                            }
                                                            break;

                                                        case 4:
                                                            if (contador == mitad_vec) {
                                                                rang_1 = list_num[contador - 1];
                                                            } else {
                                                                if (contador == a) {
                                                                    rang_2 = list_num[contador - 1];
                                                                }
                                                            }
                                                            break;
                                                    }

                                                    contador++;
                                                }

                                                mediana_par = rang_1 + rang_2;

                                                mediana_par = mediana_par / 2;
                                                System.out.println("la mediana es de " + mediana_par);
                                                mediana_par = 0;
                                                rang_1 = 0;
                                                rang_2 = 0;

                                            } else {
                                                while (contador < list_num.length) {
                                                    if (contador == mitad_vec) {
                                                        System.out.println(
                                                                "la mediana es: " + list_num[(int) mitad_vec]);
                                                    }
                                                    contador++;
                                                }

                                            }

                                            // media
                                            contador = 0;
                                            media = 0;
                                            while (contador < list_num.length) {
                                                media = media + list_num[contador];
                                                contador++;
                                            }

                                            media = media / num_max;
                                            System.out.println("");
                                            System.out.println("la media de los datos dados es: " + (media));

                                            // moda
                                            moda = 0;
                                            contador2 = -1;
                                            contador3 = 0;
                                            contador4 = 0;

                                            while (contador3 < list_num.length) {
                                                contador = 0;
                                                while (contador4 < list_num.length) {
                                                    if (list_num[contador3] == list_num[contador4]) {
                                                        contador = contador++;
                                                    }
                                                    contador4++;
                                                }
                                                if (contador > contador2) {

                                                    moda = list_num[contador3];
                                                    contador2 = contador;

                                                }
                                                contador3++;
                                            }

                                            System.out.println("la moda es: " + moda);

                                            System.out.println("while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) repetir while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) repetir while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 3:// for

                                            // mediana

                                            if (num_max == 1) {
                                                System.out.println("la mediana de este ejercicio es: 1");
                                            }

                                            if (residuo == 0 & num_max != 1) {
                                                for (int i = 0; i <= list_num.length; i++) {
                                                    switch (num_max) {
                                                        case 2:
                                                            if (i == mitad_vec) {

                                                                rang_1 = list_num[i - 1];
                                                            }
                                                            if (i == (int) a) {

                                                                rang_2 = list_num[i - 1];

                                                            }
                                                            break;

                                                        case 4:
                                                            if (i == mitad_vec) {
                                                                rang_1 = list_num[i - 1];
                                                            } else {
                                                                if (i == a) {
                                                                    rang_2 = list_num[i - 1];
                                                                }
                                                            }
                                                            break;
                                                    }
                                                }

                                                mediana_par = rang_1 + rang_2;

                                                mediana_par = mediana_par / 2;
                                                System.out.println("la mediana es de " + mediana_par);
                                                mediana_par = 0;
                                                rang_1 = 0;
                                                rang_2 = 0;

                                            } else {
                                                for (int i = 0; i <= list_num.length; i++) {
                                                    if (i == mitad_vec) {
                                                        System.out.println(
                                                                "la mediana es: " + list_num[(int) mitad_vec]);
                                                    }
                                                }

                                            }

                                            // media
                                            media = 0;
                                            for (int i = 0; i < list_num.length; i++) {
                                                media = media + list_num[i];

                                            }

                                            media = media / num_max;
                                            System.out.println("");
                                            System.out.println("la media de los datos dados es: " + (media));

                                            // moda
                                            moda = 0;
                                            contador2 = -1;
                                            contador3 = 0;
                                            contador4 = 0;

                                            for (int i = 0; i < list_num.length; i++) {
                                                contador = 0;
                                                for (int j = 0; j < list_num.length; j++) {
                                                    if (list_num[i] == list_num[j]) {
                                                        contador = contador++;
                                                    }
                                                }
                                                if (contador > contador2) {

                                                    moda = list_num[i];
                                                    contador2 = contador;

                                                }

                                            }
                                            System.out.println("la moda es: " + moda);

                                            System.out.println("for");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) repetir for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) repetir for");
                                                        System.out.println("4) for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }
                                            break;
                                        case 4:// foreach

                                            // mediana

                                            if (num_max == 1) {
                                                System.out.println("la mediana de este ejercicio es: 1");
                                            }

                                            contador = 0;
                                            if (residuo == 0 & num_max != 1) {

                                                for (int k : list_num) {
                                                    switch (num_max) {
                                                        case 2:
                                                            if (k == mitad_vec) {

                                                                rang_1 = list_num[k - 1];
                                                                rang_2 = list_num[k];
                                                            }

                                                            break;

                                                        case 4:
                                                            if (k == mitad_vec) {
                                                                rang_1 = list_num[k - 1];
                                                            } else {
                                                                if (k == a) {
                                                                    rang_2 = list_num[k - 1];
                                                                }
                                                            }
                                                            break;
                                                    }

                                                }

                                                mediana_par = rang_1 + rang_2;

                                                mediana_par = mediana_par / 2;
                                                System.out.println("la mediana es de " + mediana_par);
                                                mediana_par = 0;
                                                rang_1 = 0;
                                                rang_2 = 0;

                                            } else {

                                                System.out.println(
                                                        "la mediana es: " + list_num[(int) mitad_vec]);

                                            }

                                            // media
                                            media = 0;
                                            for (int k : list_num) {
                                                media = media + list_num[k];
                                            }

                                            media = media / num_max;
                                            System.out.println("");
                                            System.out.println("la media de los datos dados es: " + (media));

                                            // moda

                                            moda = 0;
                                            contador2 = -1;
                                            contador3 = 0;
                                            contador4 = 0;
                                            for (int i : list_num) {
                                                contador = 0;
                                                contador3 = i;
                                                for (int j : list_num) {
                                                    contador4 = j;
                                                    if (list_num[contador3] == list_num[contador4]) {
                                                        contador = contador++;
                                                    }

                                                }

                                                if (contador > contador2) {

                                                    moda = list_num[contador3];
                                                    contador2 = contador;

                                                }
                                            }

                                            System.out.println("la moda es: " + moda);

                                            System.out.println("foreach");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) repetir foreach");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) repetir for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                    }
                                } else {
                                    System.out.println("");
                                    System.out.println(
                                            "profe por favor rinda se con el tema de intentar tumbarme el código con la cuestión de colocar un numero de opción que no se pude ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.print("coloque el numero de la opción que va a escoger: ");
                                    Seleccion_bucle = lector.nextInt();
                                }
                            } while (repite_seleccion_bucle == true);

                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-2]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-2]")) {
                                    System.out.println("");
                                    System.out.println(
                                            "por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) si 2) no ");
                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("hasta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-5]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-5]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de seleccion valida ");
                                    System.out.println(
                                            "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                    System.out.println(
                                            "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                                    System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                    System.out.println(
                                            "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                    System.out.println("coloque el numero que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 2) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                System.out.println(
                                        "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");

                                System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Validar = lector.nextLine();
                                if (Validar.matches("[1-5]")) {
                                    Seleccion_Punto = Integer.parseInt(Validar);
                                } else {
                                    System.out.println("");
                                    while (!Validar.matches("[1-5]")) {
                                        System.out.println("");
                                        System.out.println("por favor escoja una respuesta de seleccion valida ");
                                        System.out.println(
                                                "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                        System.out.println(
                                                "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                                        System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                        System.out.println(
                                                "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                        System.out.println("coloque el numero que va a seleccionar es: ");
                                        Validar = lector.nextLine();
                                    }
                                    Seleccion_Punto = Integer.parseInt(Validar);
                                }

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 4:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // fin punto 2
                            break;

                        case 3:
                            String[] NomProductos = new String[23];
                            int[] PrecioProductos = new int[23];
                            int[] CantidadProductos = new int[23];
                            System.out.println(
                                    "3) Pedir nombres (23), precios que ud quiera y cantidad (del 1 al 23) y que con esos datos los impriman.");

                            System.out.println("por favor insertar los nombres: ");

                            for (int i = 0; i < NomProductos.length; i++) {
                                System.out.println("");
                                System.out.println("Nombre #" + (i + 1));
                                NomProductos[i] = lector.nextLine();

                            }

                            System.out.println("");
                            System.out.println("Por favor insertar los precios de cada producto: ");

                            for (int i = 0; i < PrecioProductos.length; i++) {
                                System.out.println("");
                                System.out.print("valor del producto " + NomProductos[i] + ": ");
                                PrecioProductos[i] = lector.nextInt();
                            }

                            System.out.println("");
                            System.out.println("por favor insertar la cantidad que hay de cada producto: ");

                            for (int i = 0; i < CantidadProductos.length; i++) {
                                System.out.println("");
                                System.out.print("cantidad de unidades de " + NomProductos[i] + ": ");
                                CantidadProductos[i] = lector.nextInt();
                            }

                            System.out.println("");
                            System.out.println("por favor escoja con cual bucle desea ver las multiplicaciones: ");
                            System.out.println("1) do-while");
                            System.out.println("2) while");
                            System.out.println("3) for");
                            System.out.println("4) for each");
                            System.out.print("coloque el numero de la opción que va a escoger: ");

                            Validar = lector.nextLine();
                            if (Validar.matches("[1-4]")) {
                                Seleccion_bucle = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-4]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.println("coloque el bucle que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_bucle = Integer.parseInt(Validar);
                            }
                            System.out.println("");

                            do {
                                if (Seleccion_bucle <= 4 & Seleccion_bucle >= 1) {
                                    switch (Seleccion_bucle) {
                                        case 1: // do while
                                            contador = 0;
                                            System.out.println("productos que la tienda tiene: ");
                                            do {
                                                System.out.println("");
                                                System.out.println(NomProductos[contador] + ": su valor es "
                                                        + PrecioProductos[contador] + " y tenemos "
                                                        + CantidadProductos[contador] + " unidades");
                                                contador++;
                                            } while (contador < CantidadProductos.length);

                                            System.out.println("do while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) repetir do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) repetir do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 2: // while
                                            contador = 0;
                                            System.out.println("productos que la tienda tiene: ");

                                            while (contador < NomProductos.length) {
                                                System.out.println("");
                                                System.out.println(NomProductos[contador] + ": su valor es "
                                                        + PrecioProductos[contador] + " y tenemos "
                                                        + CantidadProductos[contador] + " unidades");
                                                contador++;
                                            }

                                            System.out.println("while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) repetir while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) repetir while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 3:// for

                                            for (int i = 0; i < NomProductos.length; i++) {
                                                System.out.println("");
                                                System.out.println(NomProductos[i] + ": su valor es "
                                                        + PrecioProductos[i] + " y tenemos "
                                                        + CantidadProductos[i] + " unidades");
                                            }

                                            System.out.println("for");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) repetir for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) repetir for");
                                                        System.out.println("4) for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }
                                            break;
                                        case 4:// foreach
                                            boolean repetir = false;
                                            for (int i : PrecioProductos) {
                                                if (repetir == false) {
                                                    for (int j = 0; j < NomProductos.length; j++) {
                                                        System.out.println("");
                                                        System.out.println(NomProductos[j] + ": su valor es "
                                                                + PrecioProductos[j] + " y tenemos "
                                                                + CantidadProductos[j] + " unidades");
                                                    }
                                                    repetir = true;
                                                }

                                            }

                                            System.out.println("foreach");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) repetir foreach");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) repetir for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                    }
                                } else {
                                    System.out.println("");
                                    System.out.println(
                                            "profe por favor rinda se con el tema de intentar tumbarme el código con la cuestión de colocar un numero de opción que no se pude ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.print("coloque el numero de la opción que va a escoger: ");
                                    Seleccion_bucle = lector.nextInt();
                                }
                            } while (repite_seleccion_bucle == true);

                            System.out.println("punto 3");
                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-2]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-2]")) {
                                    System.out.println("");
                                    System.out.println(
                                            "por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) si 2) no ");
                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("hasta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                            System.out.println(
                                    "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-5]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-5]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de seleccion valida ");
                                    System.out.println(
                                            "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                    System.out.println(
                                            "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                                    System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                    System.out.println(
                                            "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                    System.out.println("coloque el numero que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 3) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                System.out.println(
                                        "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética. ");

                                System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Validar = lector.nextLine();
                                if (Validar.matches("[1-5]")) {
                                    Seleccion_Punto = Integer.parseInt(Validar);
                                } else {
                                    System.out.println("");
                                    while (!Validar.matches("[1-5]")) {
                                        System.out.println("");
                                        System.out.println("por favor escoja una respuesta de seleccion valida ");
                                        System.out.println(
                                                "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                        System.out.println(
                                                "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                                        System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                        System.out.println(
                                                "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                        System.out.println("coloque el numero que va a seleccionar es: ");
                                        Validar = lector.nextLine();
                                    }
                                    Seleccion_Punto = Integer.parseInt(Validar);
                                }

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 2:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 4:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // Fin punto 3

                            break;
                        case 4:
                            System.out.println(
                                    "punto 4, este punto no me toca pero planeo incluirlo en un futuro Att David Gonzalo Cordon Fontecha");
                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-2]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-2]")) {
                                    System.out.println("");
                                    System.out.println(
                                            "por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) si 2) no ");
                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("hasta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                            System.out.println(
                                    "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-5]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-5]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de seleccion valida ");
                                    System.out.println(
                                            "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                    System.out.println(
                                            "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                                    System.out.println(
                                            "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                                    System.out.println(
                                            "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                    System.out.println("coloque el numero que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 4) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                System.out.println(
                                        "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética. ");

                                System.out.println(
                                        "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Validar = lector.nextLine();
                                if (Validar.matches("[1-3]") || Validar.matches("[5]")) {
                                    Seleccion_Punto = Integer.parseInt(Validar);
                                } else {
                                    System.out.println("");
                                    while (!Validar.matches("[1-5]")) {
                                        System.out.println("");
                                        System.out.println("por favor escoja una respuesta de seleccion valida ");
                                        System.out.println(
                                                "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                        System.out.println(
                                                "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                                        System.out.println(
                                                "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                                        System.out.println(
                                                "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                                        System.out.println("coloque el numero que va a seleccionar es: ");
                                        Validar = lector.nextLine();
                                    }
                                    Seleccion_Punto = Integer.parseInt(Validar);
                                }

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 2:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // Fin punto 4

                            break;
                        case 5:
                            int k = 0;
                            String raiz = " ";
                            String palabra = " ";
                            String[] palabras = new String[4];
                            boolean validacion = false;
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            do {
                                System.out.println("por favor ingresa la palabra raiz: ");
                                raiz = lector.next();
                                if (raiz.matches("[a-zA-Z]*")) {
                                    validacion = true;
                                } else {
                                    System.out.println("ingrese una palabra valida ");
                                    System.out.println("");
                                }

                            } while (validacion == false);

                            validacion = false;

                            System.out.println("Ingresa 4 palabras mas: ");

                            for (int i = 0; i < 4; i++) {
                                do {
                                    System.out.print("Ingrese palabra #" + (i + 1) + ": ");
                                    palabra = lector.next();
                                    if (palabra.matches("[a-zA-Z]*")) {
                                        palabras[k] = palabra;
                                        validacion = true;
                                    } else {
                                        System.out.println(
                                                "\n Ingrese de manera correcta el nombre del producto \n");
                                    }
                                } while (validacion == false);
                                k++;
                            }
                            int i = 0;

                            System.out.println("");
                            System.out.println("por favor escoja con cual bucle desea ver las multiplicaciones: ");
                            System.out.println("1) do-while");
                            System.out.println("2) while");
                            System.out.println("3) for");
                            System.out.println("4) for each");
                            System.out.print("coloque el numero de la opción que va a escoger: ");

                            Validar = lector.nextLine();
                            if (Validar.matches("[1-4]")) {
                                Seleccion_bucle = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-4]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.println("coloque el bucle que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_bucle = Integer.parseInt(Validar);
                            }
                            System.out.println("");

                            do {
                                if (Seleccion_bucle <= 4 & Seleccion_bucle >= 1) {
                                    switch (Seleccion_bucle) {
                                        case 1: // do while
                                            for (String w : palabras) {
                                                for (i = 0; i < w.length(); i++) {
                                                    if (raiz.contains(String.valueOf(w.charAt(i)))) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "esta palabra " + w + " encaja en la palabra base ");
                                                        System.out.println("");
                                                        break;
                                                    }
                                                }
                                            }
                                            System.out.println("do while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) repetir do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) repetir do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 2: // while

                                            while (i < palabras.length) {
                                                int j = 0;
                                                while (j < palabras[i].length()) {
                                                    if (raiz.contains(String.valueOf(palabras[i].charAt(j)))) {
                                                        System.out.println("esta palabra (" + palabras[i]
                                                                + ") encaja en la palabra base  ");

                                                    }
                                                    j++;
                                                }
                                                i++;
                                            }

                                            System.out.println("while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) repetir while");
                                                System.out.println("3) for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();

                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) repetir while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) for each");
                                                        System.out
                                                                .println("coloque el bucle que va a seleccionar es: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                        case 3:// for
                                            for (String w : palabras) {
                                                for (i = 0; i < w.length(); i++) {
                                                    if (raiz.contains(String.valueOf(w.charAt(i)))) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "esta palabra " + w + " encaja en la palabra base ");
                                                        System.out.println("");
                                                        break;
                                                    }
                                                }
                                            }
                                            System.out.println("for");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) repetir for");
                                                System.out.println("4) for each");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) repetir for");
                                                        System.out.println("4) for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }
                                            break;
                                        case 4:// foreach

                                            for (String w : palabras) {
                                                for (i = 0; i < w.length(); i++) {
                                                    if (raiz.contains(String.valueOf(w.charAt(i)))) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "esta palabra " + w + " encaja en la palabra base ");
                                                        System.out.println("");
                                                        break;
                                                    }
                                                }
                                            }

                                            System.out.println("foreach");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Validar = lector.nextLine();
                                            if (Validar.matches("[1-2]")) {
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            } else {
                                                System.out.println("");
                                                while (!Validar.matches("[1-2]")) {
                                                    System.out.println("");
                                                    System.out.println(
                                                            "por favor escoja una respuesta de selección valida ");
                                                    System.out.println("1) si 2) no ");
                                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                                    Validar = lector.nextLine();
                                                }
                                                Seleccion_bucle = Integer.parseInt(Validar);
                                            }

                                            if (Seleccion_bucle == 1) {
                                                System.out.println("");
                                                System.out.println(
                                                        "por favor escoja con cual bucle desea ver las multiplicaciones: ");
                                                System.out.println("1) do-while");
                                                System.out.println("2) while");
                                                System.out.println("3) for");
                                                System.out.println("4) repetir foreach");
                                                System.out
                                                        .print("coloque el numero de la opción que va a escoger: ");
                                                Validar = lector.nextLine();
                                                if (Validar.matches("[1-4]")) {
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                } else {
                                                    System.out.println("");
                                                    while (!Validar.matches("[1-4]")) {
                                                        System.out.println("");
                                                        System.out.println(
                                                                "por favor escoja una respuesta de selección valida ");
                                                        System.out.println("1) do-while");
                                                        System.out.println("2) while");
                                                        System.out.println("3) for");
                                                        System.out.println("4) repetir for each");
                                                        System.out.println(
                                                                "coloque el numero de acuerdo a su decision: ");
                                                        Validar = lector.nextLine();
                                                    }
                                                    Seleccion_bucle = Integer.parseInt(Validar);
                                                }

                                                repite_seleccion_bucle = true;
                                            } else {
                                                System.out.println(
                                                        "okey muchas gracias por haver visto este punto");
                                                repite_seleccion_bucle = false;
                                                repite_seleccion_punto = true;
                                            }

                                            break;
                                    }
                                } else {
                                    System.out.println("");
                                    System.out.println(
                                            "profe por favor rinda se con el tema de intentar tumbarme el código con la cuestión de colocar un numero de opción que no se pude ");
                                    System.out.println("1) do-while");
                                    System.out.println("2) while");
                                    System.out.println("3) for");
                                    System.out.println("4) for each");
                                    System.out.print("coloque el numero de la opción que va a escoger: ");
                                    Seleccion_bucle = lector.nextInt();
                                }
                            } while (repite_seleccion_bucle == true);

                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-2]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-2]")) {
                                    System.out.println("");
                                    System.out.println(
                                            "por favor escoja una respuesta de selección valida ");
                                    System.out.println("1) si 2) no ");
                                    System.out.println("coloque el numero de acuerdo a su decision: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("hasta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                            System.out.println(
                                    "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                            System.out.println(
                                    "4) Dada una palabra imprimir el inverso de la palabra ");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Validar = lector.nextLine();
                            if (Validar.matches("[1-4]")) {
                                Seleccion_Punto = Integer.parseInt(Validar);
                            } else {
                                System.out.println("");
                                while (!Validar.matches("[1-4]")) {
                                    System.out.println("");
                                    System.out.println("por favor escoja una respuesta de seleccion valida ");
                                    System.out.println(
                                            "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es hasta el multiplicador que debe llegar.");
                                    System.out.println(
                                            "2) De 0 a los dos últimos dígitos de su código estudiantil, generar un numero random que va a hacer la cantidad de números que debe ingresar y con esa lista de números sacar media, moda y aritmética.");
                                    System.out.println(
                                            "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                                    System.out.println(
                                            "4) Dada una palabra imprimir el inverso de la palabra ");
                                    System.out.println("coloque el numero que va a seleccionar es: ");
                                    Validar = lector.nextLine();
                                }
                                Seleccion_Punto = Integer.parseInt(Validar);
                            }

                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 2:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // Fin punto 5
                            break;
                    }
                }
            } while (repite_seleccion_punto);

        }

    }
}
