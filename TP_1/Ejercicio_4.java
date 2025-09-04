import java.util.Scanner;
public class Ejercicio_4{
    public static void main(String[] args) {
        Scanner sca= new Scanner(System.in);

        System.out.println("Ingrese tres números");
        int NRO1=sca.nextInt(), NRO2=sca.nextInt(), NRO3=sca.nextInt();

        if(NRO1>NRO2 && NRO2>NRO3){
            System.out.println("El mayor es: "+ NRO1);
        }else{
            if(NRO2>NRO1 && NRO2>NRO3){
                System.out.println("El mayor es: "+ NRO2);
            }else{
                System.out.println("El mayor es: "+ NRO3);
                }
            }
        sca.close();
    }
}
