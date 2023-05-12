package lab4.lab4p1_eduardochinchilla;

import java.util.Scanner;

public class Lab4P1_EduardoChinchilla {

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        while (opcion != 3) {

            System.out.println("Menu");
            System.out.println("1. Conjuntos");
            System.out.println("2. Contraseña Mejorada ");
            System.out.println("3.Salir ");

            opcion = read.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el conjunto A: ");
                    String a = read.next();
                    System.out.println("Ingrese el conjunto B: ");
                    String b = read.next();

                    if (a.length() == b.length()) {
                        int cont = 0;

                        boolean igual = false;
                        for (int i = 0; i < a.length(); i++) {
                            char letra = a.charAt(i);
                            for (int j = 0; j < b.length(); j++) {
                                char letra2 = a.charAt(j);
                                if (letra == letra2 && ((cont == a.length()) && (cont == b.length()))) {
                                    cont++;
                                    igual = true;
                                    break;
                                }

                            }

                        }
                        if (igual == true) {
                            System.out.println("Ambos conjuntos son iguales: ");
                        } else {
                            System.out.println("Los conjuntos no son iguales: ");

                            String C = "";

//                        C= a + b;
//                        System.out.println("Union C: "+C);
                            for (int i = 0; i < a.length(); i++) {
                                char letra3 = a.charAt(i);
                                for (int j = 0; j < b.length(); j++) {
                                    char letra4 = b.charAt(j);
                                    if (a.charAt(i) == b.charAt(j)) {
                                        C = i + b;
                                    }
                                }
                            }
                            System.out.println("Union C: " + C);
                        }
                    } else {
                        System.out.println("Los conjuntos no son iguales");
                        String C = "";

//                        C= a + b;
//                        System.out.println("Union C: "+C);
                        for (int i = 0; i < a.length(); i++) {
                            char letra3 = a.charAt(i);
                            for (int j = 0; j < b.length(); j++) {
                                char letra4 = b.charAt(j);
                                if (a.charAt(i) == b.charAt(j)) {
                                    C = a + b;
                                }
                            }
                        }
                        System.out.println("Union C: " + C);
                    }

                    break;
                }
                case 2: {
                    System.out.println("Ingrese una contraseña: ");
                    String pass = read.next();
                    System.out.println("Ingrese un numero: ");
                    int numero = read.nextInt();
                    boolean num = false;
                    boolean let = false;

                    int cont = 0;
                    int cont2 = 0;

                    for (int i = 0; i < pass.length(); i++) {
                        int letra = pass.charAt(i);
                        cont = letra;
                        cont2++;
                    }
   
                    if (cont2 >= 8 && ((cont >= 65 && cont <= 90 )|| (cont >= 97 && cont <= 122) || (cont >= 48 && cont <= 57))) {

                        System.out.println("Su contraseña es segura");

                        int posicion = 1;
                        String passM = "";
                        for (int j = 0; j < pass.length(); j++) {
                            char letra1 = pass.charAt(j);
                            passM += letra1;
                            if (j == posicion) {
                                passM += numero;
                                numero++;
                                posicion += 2;
                            }
                        }
                        System.out.println("Contra mejorada: " + passM);
                        
                        
                    } else if (cont2 <= 8) {
                        System.out.println("Su contraseña no cumple con los requisitos, debe tener 8 o mas caracteres");
                        
                    } else {
                        System.out.println("Su contraseña no cumple con los requisitos, debe tener al menos un numero o una letra");
                    }

                    break;
                }
                case 3: {
                    System.out.println("Ha salido del menu");
                    break;
                }

                default:
                    System.out.println("Error vuelva a ingresar: ");
            }//fin switch
        }// fin while
    }
}
