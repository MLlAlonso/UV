package actividad_figuras;
import java.util.Scanner;
/**
 * @author Mikkel
 */
public class Actividad_Figuras{
    /**
     * @param args
    */
    public static void main(String[] args) {
        int comprobar=0;
        /*
        *Ingresar el nombre de la figura
        */
        System.out.println("Escriba nombre de la Figura");
        Scanner entrada= new Scanner(System.in);
        String nombreFigrua=entrada.nextLine();
        /**
        * Cambiar nombreFigura a todo minusculas
        * para que asi no ocurra ningun problema de ingreso
        */
        nombreFigrua=nombreFigrua.toLowerCase();
        /**
        *Comprobar que el nombre de la figura sea el correcto 
        */
        while (comprobar!=1) {
            if (nombreFigrua.equals("triangulo")) {
                comprobar=1;
            }
            if (nombreFigrua.equals("rectangulo")) {
                comprobar=1;
            }
            if (nombreFigrua.equals("circulo")) {
                comprobar=1;
            }
            if (nombreFigrua.equals("cuadrado")) {
                comprobar=1;
            }
            /**
            * Si el nombre de la figura es erroneo se pide que se introduzca nuevamente
            */
            if (comprobar!=1) {
                System.out.println("Nombre de figura erroneo, volver a introducirlo");
                nombreFigrua=entrada.nextLine();
                nombreFigrua= nombreFigrua.toLowerCase();
            }
        }
        /**
        * Desarrollo y obtencin de los datos deseados segun la figura
        */
        switch(nombreFigrua) {
            case "triangulo":
                {
                    System.out.println("Ingrese la base y altura");
                    double base=entrada.nextDouble(),altura=entrada.nextDouble(),area;
                    area=(base*altura)/2;
                    /**
                    * Constructor de triangulo
                    */
                    Figura triangulo=new Triangulo(nombreFigrua, base, altura, area);
                    System.out.println(triangulo);
                    break;
                }
            case "rectangulo":
                {
                    System.out.println("Ingrese la base y altura");
                    double base=entrada.nextDouble(),altura=entrada.nextDouble(),area;
                    area=base*altura;
                    /**
                    * Constructor de rectangulo
                    */
                    Figura rectangulo= new Rectangulo(nombreFigrua, base, altura, area);
                    System.out.println(rectangulo);
                    break;
                }
            case "circulo":
                {
                    System.out.println("Ingrese el radio");
                    double radio=entrada.nextDouble(),area;
                    area=3.1416*(radio*radio);
                    /**
                    * Constructor del circulo
                    */
                    Figura circulo=new Circulo(nombreFigrua, radio, area);
                    System.out.println(circulo);
                    break;
                }
            case "cuadrado":
                {
                    System.out.println("Ingrese lado");
                    double lado=entrada.nextDouble(),area;
                    area=lado*lado;
                    /**
                    * Constructor de cuadrado
                    */
                    Figura cuadrado=new Cuadrado(nombreFigrua, lado, area);
                    System.out.println(cuadrado);
                    break;
                }
        }
    }  
}