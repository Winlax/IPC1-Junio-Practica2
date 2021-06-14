package src;

import java.util.*;

public class Memorabilia {

    public static void main(String[] args) {
        Memorabilia a = new Memorabilia();
    }
    Scanner teclado = new Scanner(System.in);

    //Matrices para almacenar datos
    String[][] datosString = new String[3][20];
    int[][] datosInt = new int[4][20];
    boolean[][] datosBoolean = new boolean[2][20];

    int[][] prestamoPeliculas = new int[3][20];
    String[][] titulosMatrices = new String[5][1];
    int respuestaMenu, cont1, cont2, cont3, cont4, cont5;

    //variables Generales
    String nombreCliente, nombrePelicula, categoriaPelicula;
    int idCliente = 1;
    int idPeliculas = 1;
    int telefonoCliente, añoPelicula, diasPrestamo;
    boolean prestamoCliente, disponibilidadPelicula;

    //Variables aumento Peliculas
    int yyy = 1;
    int zzz = 0;

    //Variables aumento Clientes
    int yy = 1;
    int zz = 0;

    //Variables generales Matrices prestamo de peliculas
    int y = 1;
    int z = 0;

    //Metodo principal
    public Memorabilia() {
        menu();
    }

    public void Clientes(String nombre, int id, int telefono, boolean prestamo) {

        for (int i = 0; i < 1; i++) {
            for (int j = zz; j < yy; j++) {
                datosString[i][j] = nombre;
                datosBoolean[i][j] = prestamo;
                datosInt[0][j] = id;
                datosInt[1][j] = telefono;
            }
        }

        zz += 1;
        yy += 1;
        idCliente += 1;

    }

    public void Peliculas(String nombre, int id, int año, String categoria, boolean disponibilidad) {

        for (int i = 0; i < 1; i++) {
            for (int j = zzz; j < yyy; j++) {
                datosString[1][j] = nombre;
                datosInt[2][j] = id;
                datosInt[3][j] = año;
                datosString[2][j] = categoria;
                datosBoolean[1][j] = disponibilidad;
            }
        }

        zzz += 1;
        yyy += 1;
        idPeliculas += 1;

    }

    public void prestamoPeliculas(int idPeli, int idCli, int diasPres) {
        datosBoolean[1][idPeli - 1] = false;
        datosBoolean[0][idCli - 1] = true;

        for (int i = 0; i < 1; i++) {
            for (int j = z; j < y; j++) {
                prestamoPeliculas[0][j] = idPeli;
                prestamoPeliculas[1][j] = idCli;
                prestamoPeliculas[2][j] = diasPres;
            }
        }

        y += 1;
        z += 1;

    }

    public void devolverPeliculas(int idP, int idC) {
        datosBoolean[1][idP - 1] = true;
        datosBoolean[0][idC - 1] = false;
    }

    public void peliculasDisponibles() {
        titulosMatrices[0][0] = "ID";
        titulosMatrices[1][0] = "Pelicula";
        titulosMatrices[2][0] = "Categoria";
        titulosMatrices[3][0] = "Año";
        titulosMatrices[4][0] = "Disponibilidad";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("  " + titulosMatrices[i][j] + "  ");
            }
        }

        System.out.print("\n");

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < yyy; j++) {
                if (datosBoolean[i][j] == true) {
                    System.out.print("   " + datosInt[2][j] + "     " + datosString[1][j] + "     " + datosString[2][j] + "     " + datosInt[3][j] + "     " + datosBoolean[1][j]);
                    System.out.print("\n");
                }
            }
        }
    }

    public void peliculasNODisponibles() {
        titulosMatrices[0][0] = "idP";
        titulosMatrices[1][0] = "Pelicula";
        titulosMatrices[2][0] = "Cliente";
        titulosMatrices[3][0] = "idCliente";
        titulosMatrices[4][0] = "Disponibilidad";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("  " + titulosMatrices[i][j] + "  ");
            }
        }

        System.out.print("\n");

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < yyy; j++) {
                if (datosString[1][j] != null && datosString[0][j] != null) {
                    if (datosBoolean[i][j] == false) {
                        System.out.print("   " + datosInt[2][j] + "     " + datosString[1][j] + "     " + datosString[0][j] + "     " + datosInt[0][j] + "     " + datosBoolean[1][j]);
                        System.out.print("\n");
                    }
                }
            }
        }
    }

    public void clientesDisponibles(int numero) {
        if (datosBoolean[0][numero - 1] == false) {
            System.out.println("Ingrese ID de pelicula que desea prestar:");
            int idPeli = teclado.nextInt();
            System.out.println("Cuantos dias prestara la pelicula:");
            int diasPres = teclado.nextInt();

            prestamoPeliculas(idPeli, numero, diasPres);
        } else {

            System.out.println("Usted ya ha prestado una pelicula, no puede prestar otra...");

        }
    }

    public void mostrarPeliculas() {
        titulosMatrices[0][0] = "ID";
        titulosMatrices[1][0] = "Pelicula";
        titulosMatrices[2][0] = "Categoria";
        titulosMatrices[3][0] = "Año";
        titulosMatrices[4][0] = "Disponibilidad";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("  " + titulosMatrices[i][j] + "  ");
            }
        }

        System.out.print("\n");

        for (int j = 0; j < yyy; j++) {
            for (int i = 0; i < 1; i++) {
                if (datosString[1][j] != null && datosString[2][j] != null) {
                    System.out.print("   " + datosInt[2][j] + "     " + datosString[1][j] + "     " + datosString[2][j] + "     " + datosInt[3][j] + "     " + datosBoolean[1][j]);
                }
            }

            System.out.print("\n");

        }
    }

    public void mostrarClientes() {
        titulosMatrices[0][0] = "ID";
        titulosMatrices[1][0] = "Cliente";
        titulosMatrices[2][0] = "Telefono";
        titulosMatrices[3][0] = "PeliculaPrestada";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("  " + titulosMatrices[i][j] + "  ");
            }
        }

        System.out.print("\n");

        for (int j = 0; j < yy; j++) {
            for (int i = 0; i < 1; i++) {
                if (datosString[i][j] != null) {
                    System.out.print("   " + datosInt[0][j] + "     " + datosString[i][j] + "     " + datosInt[1][j] + "     " + datosBoolean[i][j] + "     ");
                }
            }

            System.out.print("\n");

        }
    }

    public void mostrarPrestamos() {
        titulosMatrices[0][0] = "idPelicula";
        titulosMatrices[1][0] = "idCliente";
        titulosMatrices[2][0] = "diasPrestados";

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("  " + titulosMatrices[i][j] + "  ");
            }
        }

        System.out.print("\n");

        for (int j = 0; j < y; j++) {
            for (int i = 0; i < 1; i++) {
                System.out.print("   " + prestamoPeliculas[0][j] + "        " + prestamoPeliculas[1][j] + "        " + prestamoPeliculas[2][j] + "     ");
            }

            System.out.print("\n");

        }

        int[] contador = new int[y];
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < y; i++) {
            contador[i] = 0;
        }

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < y; k++) {
                    if (prestamoPeliculas[0][j] == prestamoPeliculas[0][k]) {
                        contador[j] += 1;

                    }
                }
            }
        }

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < y; j++) {
                if (contador[i] > contador[j]) {
                    mayor = contador[i];
                }
                if (contador[i] < contador[j]) {
                    menor = contador[i];
                }
            }
        }

        System.out.println("La pelicula mayor prestada, se presto: " + mayor);
        System.out.println("La pelicula menor prestada, se presto: " + menor);
    }

    public void peliculasCategoria(String cate) {
        titulosMatrices[0][0] = "ID";
        titulosMatrices[1][0] = "Pelicula";
        titulosMatrices[2][0] = "Categoria";
        titulosMatrices[3][0] = "Año";
        titulosMatrices[4][0] = "Disponibilidad";

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print("  " + titulosMatrices[i][j] + "  ");
            }
        }

        System.out.print("\n");

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < yyy; j++) {
                if (datosString[2][j] != null) {
                    if (datosString[2][j].equalsIgnoreCase(cate)) {
                        System.out.print(" " + datosInt[2][j] + " " + datosString[1][j] + " " + datosString[2][j] + " " + datosInt[3][j] + " " + datosBoolean[1][j]);
                        System.out.print("\n");
                    }
                }
            }
        }

    }

    public void cantidadCategoria() {
        cont1 = 0;//Terror
        cont2 = 0;//Accion
        cont3 = 0;//Comedia
        cont4 = 0;//Romance
        cont5 = 0;//Suspenso

        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < yyy; j++) {
                if (datosString[2][j] != null) {
                    if (datosString[2][j].equalsIgnoreCase("Terror")) {
                        cont1 += 1;
                    } else if (datosString[2][j].equalsIgnoreCase("accion")) {
                        cont2 += 1;
                    } else if (datosString[2][j].equalsIgnoreCase("comedia")) {
                        cont3 += 1;
                    } else if (datosString[2][j].equalsIgnoreCase("romance")) {
                        cont4 += 1;
                    } else if (datosString[2][j].equalsIgnoreCase("suspenso")) {
                        cont5 += 1;
                    } else {
                        System.out.println("Categoria de peliculas NO DISPONIBLE...");
                    }
                }
            }
        }

        System.out.println("Peliculas de Terror " + cont1);
        System.out.println("Peliculas de Accion " + cont2);
        System.out.println("Peliculas de Comedia " + cont3);
        System.out.println("Peliculas de Romance " + cont4);
        System.out.println("Peliculas de Suspenso " + cont5);

    }

    public void ordenarPeliculas() {
        for (int j = 0; j < yyy; j++) {
            System.out.println(datosString[1][j]);
        }
    }

    public void menu() {
        do {
            System.out.println("\n\n---------- Peliculas Memorabilia ----------");

            System.out.println("------------------ MENU -------------------");
            System.out.println("\n");
            System.out.println("1) Prestamo de Peliculas");
            System.out.println("2) Devolucion de Peliculas");
            System.out.println("3) Mostrar Peliculas");
            System.out.println("4) Ingresar Peliculas");
            System.out.println("5) Ordenar Peliculas (Por Nombre Ascendente)");
            System.out.println("6) Ingresar Clientes Nuevos");
            System.out.println("7) Mostrar Clientes");
            System.out.println("8) Reportes");
            System.out.println("9) Salir");
            System.out.println("\n Ingrese una Opcion:  ");
            respuestaMenu = teclado.nextInt();
            System.out.println("-------------------------------------------");

            switch (respuestaMenu) {
                case 1 -> {
                    peliculasDisponibles();
                    System.out.println("-------------------------------------------");

                    System.out.println("Ingrese ID de cliente:");
                    int numero = teclado.nextInt();

                    clientesDisponibles(numero);
                    System.out.println("-------------------------------------------");

                }
                case 2 -> {
                    peliculasNODisponibles();
                    System.out.println("-------------------------------------------");

                    System.out.println("Ingrese ID de pelicula:");
                    int idP = teclado.nextInt();

                    System.out.println("Ingrese ID de cliente:");
                    int idC = teclado.nextInt();

                    devolverPeliculas(idP, idC);
                    System.out.println("-------------------------------------------");

                }
                case 3 ->
                    mostrarPeliculas();
                case 4 -> {
                    System.out.print("\nIngrese nombre de la nueva Pelicula:\n");
                    nombrePelicula = teclado.next();

                    System.out.println("Su nuevo ID es: " + idPeliculas);

                    System.out.print("Ingresa categoria de la nueva pelicula:\n");
                    categoriaPelicula = teclado.next();

                    System.out.println("Ingrese año de la pelicula:");
                    añoPelicula = teclado.nextInt();

                    disponibilidadPelicula = true;

                    System.out.println("-------------------------------------------");

                    Peliculas(nombrePelicula, idPeliculas, añoPelicula, categoriaPelicula, disponibilidadPelicula);
                }
                case 5 -> {
                    ordenarPeliculas();
                }
                case 6 -> {
                    System.out.print("\nIngrese nombre del nuevo cliente:\n");
                    nombreCliente = teclado.next();

                    System.out.println("Su nuevo ID es: " + idCliente);

                    System.out.println("Ingresa numero de telefono del nuevo cliente:");
                    telefonoCliente = teclado.nextInt();

                    prestamoCliente = false;

                    System.out.println("-------------------------------------------");

                    Clientes(nombreCliente, idCliente, telefonoCliente, prestamoCliente);
                }
                case 7 ->
                    mostrarClientes();
                case 8 -> {
                    cantidadCategoria();
                    System.out.println("-------------------------------------------");
                    System.out.print("\nIngrese categoria de pelicula: (Accion, Romance, Comedia, Terror, Suspenso)\n");
                    String rep = teclado.next();
                    peliculasCategoria(rep);
                    System.out.println("-------------------------------------------");
                    mostrarPrestamos();
                    System.out.println("-------------------------------------------");

                }
                case 9 ->
                    System.out.println("\n--------------  ¡Nos Vemos!  --------------\n");
                default ->
                    System.out.println("\n-Debe ingresar una de las opciones disponibles...-");

            }

        } while (respuestaMenu != 9);
    }

}

