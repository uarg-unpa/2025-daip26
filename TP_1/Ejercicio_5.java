import java.util.Scanner;
public class Ejercicio_5 {
    public static void main(String [] args){
        Scanner scanner= new Scanner (System.in);
        char día=scanner.nextLine();
        System.out.print("Ingrese un día de la seemana:");
        switch (día) {
            case 'M': case 'I': case 'J':
            System.out.println("HOY TENGO RESOLUCION");
            break;
            case 'L': case 'V': case 'S': case 'D':
                System.out.println("No hay resolución. ");
            break;
            default:
            System.out.println("Letra inválida. ");
        
            scanner.close();
    }
}
}
