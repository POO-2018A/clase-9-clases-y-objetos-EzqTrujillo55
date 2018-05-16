

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int opc;

         //Ingreso de datos de la tienda
        Scanner scan= new Scanner(System.in);
        System.out.println("Bienvenido, proporcione los datos de la tienda");
        System.out.print("Nombre: ");
        String nombre = scan.next();

        System.out.print("Direccion: ");
        String direccion = scan.next();

        System.out.print("RUC: ");
        String ruc = scan.next();


         //Variables y arreglos a utilizar para el ingreso de productos

        int cantidad_productos=0;
        int aux=cantidad_productos;
        Productos[] datos = new Productos[100];
        String [] productos = new String [100];
        int [] codigos = new int[100]; //Se almacenan los codigos en un arreglo para poder ir comparandolos




       //MENU Y EJECUCIONES SEGUN LO TECLEADO
        do {
            System.out.println("###Sistema de informacion de tiendas###");
            System.out.println("Digite la opción deseada");
            System.out.println("1.- Ingresar nuevo producto");
            System.out.println("2.- Visualizar lista de productos");
            System.out.println("3.- Salir");
            opc = scan.nextInt();

            switch (opc) {

                case 1: {
                    //Ingreso de productos y sus respectivos datos
                    System.out.println("Ingrese cantidad de productos que va a ingresar");
                    cantidad_productos=scan.nextInt();
                    for(int i=0; i<cantidad_productos; i++){
                        System.out.println("Ingrese producto " + (i+1));
                        productos[i]=scan.next();
                        System.out.println("Marca: ");
                        String marca = scan.next();
                        System.out.println("Codigo: ");
                        codigos[i] = scan.nextInt();
                        if(i>0){

                            for(int k=i; k>0; k--){
                                while(codigos[k]==codigos[k-1]){
                                    System.out.println("El codigo ya se ha ingresado antes, ingrese otro");
                                    codigos[k] = scan.nextInt();
                                }
                            }

                        }
                        System.out.println("Tipo: ");
                        String tipo = scan.next();
                        System.out.println("Precio: ");
                        double precio = scan.nextInt();
                        datos [i]= new Productos(marca,tipo,precio);
                    }

                    break;


                }

                case 2: {
                    System.out.println("Visualizar lista de productos");
                    System.out.println("");
                    System.out.println("####Productos que ofrece la tienda####");

                    for (int j=0; j<cantidad_productos; j++){
                        System.out.println("Producto "+ (j+1) + ": " + productos[j]);
                        System.out.println("Marca: " + datos[j].getMarca());

                        System.out.println("Codigo: "  + codigos[j]);

                        System.out.println("Tipo: " + datos[j].getTipo());

                        System.out.println("Precio: " +  datos[j].getPrecio());
                        System.out.println("\n");

                    }

                    break;
                }

                case 3: {

                    System.out.println("Adios");

                    break;
                }

                default: {
                    System.out.println("Opción inválida");
                }
            }
        }while ( opc !=3);

    }

}
