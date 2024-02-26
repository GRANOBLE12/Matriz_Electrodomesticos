/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlElectrodomestico;
import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Electrodomestico {

    String[][] electrodomestico = new String[4][3];
    Scanner in = new Scanner(System.in);

    int i = 0;

    void guardarElectrodomestico() {
        String numeroSerie, tipoElectrodomestico, precio;
        for (int i = 0; i < electrodomestico.length; i++) {
            System.out.println("Ingrese el numero de serie");
            numeroSerie = in.next();
            System.out.println("Ingrese el tipo de Electrodomestico");
            tipoElectrodomestico = in.next();
            System.out.println("Ingrese el precio");
            precio = in.next();

            electrodomestico[i][0] = numeroSerie;
            electrodomestico[i][1] = tipoElectrodomestico;
            electrodomestico[i][2] = precio;
            System.out.println("Producto Almacenado Exitosamente");
        }
    }

    void buscarElectrodomestico() {
        String numeroSerieBuscar;
        System.out.println("Ingrese el nummero de serie a Buscar");
        numeroSerieBuscar = in.next();
        boolean bandera = false;
        for (int i = 0; i < electrodomestico.length; i++) {
            if (numeroSerieBuscar.equals(electrodomestico[i][0])) {
                System.out.println("");
                System.out.println(" NUMERO SERIE : " + electrodomestico[i][0]);
                System.out.println(" ELECTRODOMESTICO :" + electrodomestico[i][1]);
                System.out.println(" PRECIO ELECTRODOMESTICO :" + electrodomestico[i][2]);
                bandera = true;
            }

        }
        if(bandera == false){
            System.out.println("EL NUMERO DE SERIE NO COINCIDE CON NINGUN ELECTRODOMESTICO");
        }
    }

    void listarElectrodomestico() {
        System.out.println("Listando datos guardados");
        System.out.println("N° Serie / Tipo / Precio");
        for (int i = 0; i < electrodomestico.length; i++) {
            System.out.println(electrodomestico[i][0] + " / " + electrodomestico[i][1] + " / " + electrodomestico[i][2]);
        }
    }

    void menu() {
        int opcion = 0;
        do {
            System.out.println("");
            System.out.println("""
                               ******MENU DE OPCIONES*****
                               
                               1. Guardar electrodomesticos
                               2. Listar electrodomesticos
                               3. Buscar electrodomesticos
                               4. Salir
                             
                                 Opcion:
                               """);
            opcion = in.nextInt();
            switch (opcion) {
            case 1:
                this.guardarElectrodomestico();
            break;
            case 2:
                this.listarElectrodomestico();
            break;
            case 3:
                this.buscarElectrodomestico();
            break;
        }
                
        
    }while(opcion > 0 && opcion < 4);

    }
}
