import java.util.Scanner;
import java.util.Random;

public class Taller_1 {

    public static void main(String[] args) {

        try (Scanner lector = new Scanner(System.in)) {
            int Seleccion_Punto = 0;

            System.out.println("");
            System.out.println("hola bienvenido");
            System.out.println("este es el menu para el taller #1 las opciones son: ");
            System.out.println(
                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar. ");
            System.out.println(
                    "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética.");
            System.out.println(
                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
            System.out.println("5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

            System.out.print("Por favor escoger la opción que desea ver: ");
            Seleccion_Punto = lector.nextInt();

            boolean repite_seleccion_punto = true;
            Boolean repite_seleccion_bucle = true;
            do {
                if (Seleccion_Punto <= 5 & Seleccion_Punto >= 1) {
                    switch (Seleccion_Punto) {
                        case 1:

                            System.out.println("");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");

                            Random numA = new Random();
                            int multiplicado, multiplicador, producto;
                            multiplicado = numA.nextInt(2023) + 1;
                            multiplicador = numA.nextInt(2023) + 1;
                            int contador = 0;
                            int[] productos = new int[multiplicador + 1];

                            for (contador = 0; contador <= multiplicador; contador++) {
                                producto = multiplicado * contador;
                                productos[contador] = producto;
                            }

                            System.out.println(" los números que salieron son: ");
                            System.out.println("multiplicado = " + multiplicado);
                            System.out
                                    .println("el multiplicado va a ser multiplicado asta el numero " + multiplicador);

                            System.out.println("");
                            System.out.println("por favor escoja con cual bucle desea ver las multiplicaciones: ");
                            System.out.println("1) do-while");
                            System.out.println("2) while");
                            System.out.println("3) for");
                            System.out.println("4) for each");
                            System.out.print("coloque el numero de la opción que va a escoger: ");
                            int Seleccion_bucle = lector.nextInt();
                            System.out.println("");

                            do {
                                if (Seleccion_bucle <= 4 & Seleccion_bucle >= 1) {
                                    switch (Seleccion_bucle) {
                                        case 1: // do while
                                            contador = 0;
                                            do {
                                                System.out.println(
                                                        multiplicado + "*" + contador + "=" + productos[contador]);
                                                contador = contador + 1;
                                            } while (contador <= multiplicador);
                                            System.out.println("do while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Seleccion_bucle = lector.nextInt();

                                            while (Seleccion_bucle <= 0 || Seleccion_bucle >= 3) {
                                                System.out.println("por favor escoja entre las opciones dadas: ");
                                                System.out.println("1) si 2) no ");
                                                Seleccion_bucle = lector.nextInt();
                                                repite_seleccion_punto = true;
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
                                                Seleccion_bucle = lector.nextInt();

                                                while (Seleccion_bucle <= 0 || Seleccion_bucle >= 5) {
                                                    System.out.println("");
                                                    System.out.println("por favor escoja entre las opciones dadas: ");
                                                    System.out.println("1) repetir do-while");
                                                    System.out.println("2) while");
                                                    System.out.println("3) for");
                                                    System.out.println("4) for each");
                                                    System.out
                                                            .print("coloque el numero de la opción que va a escoger: ");
                                                    Seleccion_bucle = lector.nextInt();
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
                                                System.out.println(
                                                        multiplicado + "*" + contador + "=" + productos[contador]);
                                                contador = contador + 1;
                                            }
                                            System.out.println("while");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Seleccion_bucle = lector.nextInt();

                                            while (Seleccion_bucle <= 0 || Seleccion_bucle >= 3) {
                                                System.out.println("por favor escoja entre las opciones dadas: ");
                                                System.out.println("1) si 2) no ");
                                                Seleccion_bucle = lector.nextInt();
                                                repite_seleccion_punto = true;
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
                                                Seleccion_bucle = lector.nextInt();

                                                while (Seleccion_bucle <= 0 || Seleccion_bucle >= 5) {
                                                    System.out.println("");
                                                    System.out.println("por favor escoja entre las opciones dadas: ");
                                                    System.out.println("1) do-while");
                                                    System.out.println("2) repetir while");
                                                    System.out.println("3) for");
                                                    System.out.println("4) for each");
                                                    System.out
                                                            .print("coloque el numero de la opción que va a escoger: ");
                                                    Seleccion_bucle = lector.nextInt();
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

                                                System.out.println(
                                                        multiplicado + "*" + contador + "=" + productos[contador]);
                                            }
                                            System.out.println("for");

                                            System.out.println("");
                                            System.out.println("desea escoger otro bucle? ");
                                            System.out.println("1) si 2) no ");
                                            Seleccion_bucle = lector.nextInt();

                                            while (Seleccion_bucle <= 0 || Seleccion_bucle >= 3) {
                                                System.out.println("por favor escoja entre las opciones dadas: ");
                                                System.out.println("1) si 2) no ");
                                                Seleccion_bucle = lector.nextInt();
                                                repite_seleccion_punto = true;
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
                                                Seleccion_bucle = lector.nextInt();

                                                while (Seleccion_bucle <= 0 || Seleccion_bucle >= 5) {
                                                    System.out.println("");
                                                    System.out.println("por favor escoja entre las opciones dadas: ");
                                                    System.out.println("1) do-while");
                                                    System.out.println("2) while");
                                                    System.out.println("3) repetir for");
                                                    System.out.println("4) for each");
                                                    System.out
                                                            .print("coloque el numero de la opción que va a escoger: ");
                                                    Seleccion_bucle = lector.nextInt();
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
                                            Seleccion_bucle = lector.nextInt();

                                            while (Seleccion_bucle <= 0 || Seleccion_bucle >= 3) {
                                                System.out.println("por favor escoja entre las opciones dadas: ");
                                                System.out.println("1) si 2) no ");
                                                Seleccion_bucle = lector.nextInt();
                                                repite_seleccion_punto = true;
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
                                                Seleccion_bucle = lector.nextInt();

                                                while (Seleccion_bucle <= 0 || Seleccion_bucle >= 5) {
                                                    System.out.println("");
                                                    System.out.println("por favor escoja entre las opciones dadas: ");
                                                    System.out.println("1) do-while");
                                                    System.out.println("2) while");
                                                    System.out.println("3) for");
                                                    System.out.println("4) repetir foreach");
                                                    System.out
                                                            .print("coloque el numero de la opción que va a escoger: ");
                                                    Seleccion_bucle = lector.nextInt();
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
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 3) {
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println("1) si 2) no ");
                                Seleccion_Punto = lector.nextInt();
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("asta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética.");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 1 || Seleccion_Punto >= 6) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética.");
                                System.out.println(
                                        "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");

                                System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Seleccion_Punto = lector.nextInt();

                            }
                            switch (Seleccion_Punto) {
                                case 2:
                                    System.out.println("hola 2");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("hola 3");
                                    repite_seleccion_punto = true;
                                    break;
                                case 4:
                                    System.out.println("hola 4");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("hola 5");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            break;

                        // fin seleccion del primer punto

                        case 2:
                            System.out.println("punto 2");
                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 3) {
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println("1) si 2) no ");
                                Seleccion_Punto = lector.nextInt();
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("asta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 2) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                                System.out.println(
                                        "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");

                                System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Seleccion_Punto = lector.nextInt();

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("hola 1");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("hola 3");
                                    repite_seleccion_punto = true;
                                    break;
                                case 4:
                                    System.out.println("hola 4");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("hola 5");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // fin punto 2
                            break;

                        case 3:
                            System.out.println("punto 3");
                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 3) {
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println("1) si 2) no ");
                                Seleccion_Punto = lector.nextInt();
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("asta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                            System.out.println(
                                    "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética ");
                            System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 3) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                                System.out.println(
                                        "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética ");

                                System.out.println("4) Dada una palabra imprimir el inverso de la palabra ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Seleccion_Punto = lector.nextInt();

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("hola 1");
                                    repite_seleccion_punto = true;
                                    break;
                                case 2:
                                    System.out.println("hola 2");
                                    repite_seleccion_punto = true;
                                    break;
                                case 4:
                                    System.out.println("hola 4");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("hola 5");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // Fin punto 3

                            break;
                        case 4:
                            System.out.println("punto 4");
                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 3) {
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println("1) si 2) no ");
                                Seleccion_Punto = lector.nextInt();
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("asta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                            System.out.println(
                                    "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética ");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                            System.out.println(
                                    "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 4) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                                System.out.println(
                                        "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética ");

                                System.out.println(
                                        "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                                System.out.println(
                                        "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Seleccion_Punto = lector.nextInt();

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("hola 1");
                                    repite_seleccion_punto = true;
                                    break;
                                case 2:
                                    System.out.println("hola 2");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("hola 3");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("hola 5");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // Fin punto 4

                            break;
                        case 5:

                            System.out.println("punto 5");

                            System.out.println("");
                            System.out.println("desea escoger otro punto del taller??");
                            System.out.println("1) si 2) no ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 3) {
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println("1) si 2) no ");
                                Seleccion_Punto = lector.nextInt();
                            }

                            if (Seleccion_Punto == 2) {
                                System.out.println("asta luego profe");
                                System.exit(1);
                            }

                            System.out.println("");
                            System.out.println("los otros puntos son: ");
                            System.out.println(
                                    "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                            System.out.println(
                                    "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética ");
                            System.out.println(
                                    "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                            System.out.println(
                                    "4) Dada una palabra imprimir el inverso de la palabra ");

                            System.out.print("Por favor escoger la opción que desea ver: ");
                            Seleccion_Punto = lector.nextInt();

                            while (Seleccion_Punto <= 0 || Seleccion_Punto >= 6 || Seleccion_Punto == 5) {
                                System.out.println("");
                                System.out.println("por favor escoja entre las opciones dadas: ");
                                System.out.println(
                                        "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar.");
                                System.out.println(
                                        "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética ");

                                System.out.println(
                                        "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15) ");
                                System.out.println(
                                        "4) Dada una palabra imprimir el inverso de la palabra ");

                                System.out.print("Por favor escoger la opción que desea ver: ");
                                Seleccion_Punto = lector.nextInt();

                            }
                            switch (Seleccion_Punto) {
                                case 1:
                                    System.out.println("hola 1");
                                    repite_seleccion_punto = true;
                                    break;
                                case 2:
                                    System.out.println("hola 2");
                                    repite_seleccion_punto = true;
                                    break;
                                case 3:
                                    System.out.println("hola 3");
                                    repite_seleccion_punto = true;
                                    break;
                                case 5:
                                    System.out.println("hola 4");
                                    repite_seleccion_punto = true;
                                    break;
                                default:
                                    break;
                            }

                            // Fin punto 5
                            break;
                    }
                } else {
                    System.out.println("");
                    System.out.println("profe por favor no me trate de tirar el cogido como lo hacia Duglas");
                    System.out.println("escoja una de las opciones: ");
                    System.out.println(
                            "1) Dado dos números aleatorios entre el 1 al 2023, imprimir la tabla de multiplicar donde A es el numero del que se tiene que hacer la tabla y B es asta el multiplicador que debe llegar. ");
                    System.out.println(
                            "2) Hacer de 0 a los dos últimos dígitos de su código estudiantil sacar media, moda y aritmética.");
                    System.out.println(
                            "3) Pedir un numero random: nombres (del 1 al 23), precios que ud quiera y cantidad (del 1 al 15).");
                    System.out.println("4) Dada una palabra imprimir el inverso de la palabra. ");
                    System.out.println(
                            "5) Pedir 5 palabras, y que se mire con cual palabra se puede hacer un crucigrama.");
                    Seleccion_Punto = lector.nextInt();

                }
            } while (repite_seleccion_punto);

        }

    }
}
