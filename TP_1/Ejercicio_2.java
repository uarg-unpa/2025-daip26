public class Ejercicio_2 {
    public static void main(String[] args) {
        int A= 5, B= 3, X;
        double C= 7.5, D= 2.0, Y;

        X= A / B;
        X= (int) (A * D) / (int) (C / A);
        Y= A / B;
        Y= (double) (A / B);
        Y= (double) A * D / (int) C;
        Y= (double) A / D;
        Y= (double) (A * D) / (C * (int) D);
        Y= A * (int) D;
        Y= (int) (A * (int) D);

        System.out.println("Reaultado (A/B)= "+ X);
        System.out.println("Reaultado ((int)(A*D)/(int)(C/A))= "+ X);
        System.out.println("Reaultado (A/B)= "+ Y);
        System.out.println("Reaultado ((double)(A/B)= "+ Y);
        System.out.println("Reaultado ((double)A*D/(int)C)= "+ Y);
        System.out.println("Reaultado ((double)A*D)="+ Y);
        System.out.println("Reaultado ((double)(A*D)/(C*(int)D)= "+ Y);
        System.out.println("Reaultado (A*(int)D)= "+ Y);
        System.out.println("Reaultado ((int)(A*(int)D)= "+ Y);
    }
}