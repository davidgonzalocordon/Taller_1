import java.util.Scanner;
import java.util.Random;

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
                            int contador = 0;
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
                            int datosP2, rang_1, rang_2;
                            double mediana_par;
                            rang_1 = 0;
                            rang_2 = 0;
                            double mitad_vec = num_max / 2;
                            double residuo = num_max % 2;
                            Math.round(mitad_vec);
                            double a = mitad_vec + 1;

                            System.out.println("el numero maximo de numeros que se pueden registrar es de " + num_max);

                            for (int j = 0; j < list_num.length; j++) {
                                System.out.println("por favor digitar el valor #" + (j + 1));
                                Validar = lector.nextLine();
                                if (Validar.matches(
                                        "[0-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999]")) {
                                    datosP2 = Integer.parseInt(Validar);
                                    list_num[j] = datosP2;
                                } else {
                                    System.out.println("");
                                    while (!Validar.matches(
                                            "[1-99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999]")) {
                                        System.out.println("");
                                        System.out.println(
                                                "por favor escriba un numero para el valor #" + (j + 1));
                                        Validar = lector.nextLine();
                                    }
                                    datosP2 = Integer.parseInt(Validar);
                                    list_num[j] = datosP2;
                                }
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

                                            do {

                                            } while (repite_seleccion_punto);

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

                                            if (num_max == 1) {
                                                System.out.println("la mediana de este ejercicio es: 1");
                                            }

                                            if (residuo == 0 & num_max != 1) {
                                                for (int i = 0; i < list_num.length; i++) {
                                                    if (i == mitad_vec) {
                                                        rang_1 = i;
                                                    } else {
                                                        if (i == a) {
                                                            rang_2 = i;
                                                        }
                                                    }
                                                }
                                                mediana_par = list_num[rang_1] + list_num[rang_2];
                                                mediana_par = mediana_par / 2;
                                                System.out.println("la mediana es de " + mediana_par);

                                            } else {
                                                for (int i = 0; i < list_num.length; i++) {
                                                    if (i == mitad_vec) {
                                                        System.out.println(
                                                                "la mediana es: " + list_num[(int) mitad_vec]);
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
                            System.out.println("punto 4");
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

                            System.out.println("punto 5");

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
