package fibonacii;

import java.util.Scanner;

public class Fibonacii {

    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num=entrada.nextInt();
        int num2=num,factRecursivo=1,factIteractivo=1;
        while (num>=1) {            
            factIteractivo=factIteractivo*num;
            num--;
        }
        if (num2>=1) {
            factRecursivo=factRecursivo*num2;
            num2--;
        }
        System.out.println("Iteractivo: "+factIteractivo);
        System.out.println("Recursivo: "+factRecursivo);
    }
}
