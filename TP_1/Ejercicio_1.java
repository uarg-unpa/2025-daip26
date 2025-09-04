public class Ejercicio_1 {
    public static void main(String[] args) {
        int A= 5, B= 3, R1;
        double C= 2.5, D= 2.0, R2;

        R1= A / B;
        R2= A / C;
        R2= A * C;
        R1= A * (int) D;
        R1= (int) (C * D);
        R1= A * (int) D;
        A++;
        B= A++;

        System.out.println("Resutado (A/C)= "+ R1);
        System.out.println("Resultado (A/C)= "+ R2);
        System.out.println("Resultado (A*C)= "+ R2);
        System.out.println("Resultado (A* (int) D)= "+ R1);
        System.out.println("Resultado ((int) (C*D)= "+ R1);
        System.out.println("Resultado (A* (int) D)= "+ R1);
        System.out.println("Resultado (A++))= "+ A);
        System.out.println("Resultado (B= A++) B= " +B+ "A= "+A);
    }
}
