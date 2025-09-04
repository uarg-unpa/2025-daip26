import java.util.Scanner;
public class Ejercicio_6 {
//Algoritmo1
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Ingresar 3 núumeros");
        int NUM1=scan.nextInt(), NUM2=scan.nextInt(), NUM3=scan.nextInt();
        int PRODUCTO= NUM1*NUM2*NUM3;
        int SUMA= NUM1+NUM2+NUM3;
        System.out.println("Suma entero: " +SUMA);
        System.out.println("Producto entero: " +PRODUCTO);

        scan.close();
    }
//Algoritmo2
{
        Scanner scann=new Scanner (System.in);
        int Suma=0;
        int Producto=1;
        for(int i= 1; i<=3; i++){
            System.out.println("Ingresa unos números");
            int NUM=scann.nextInt();
            Suma=Suma+ NUM;
            Producto=Producto*NUM;

            scann.close();
        }
        System.out.println("Suma enteros: "+ Suma);
        System.out.println("Producto entero: "+ Producto);
    }
}
