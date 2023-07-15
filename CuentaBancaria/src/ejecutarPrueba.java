
import java.math.BigDecimal;
import java.util.Scanner;

/** @author mikkel */
/**
 * El inciso a) fue aplicado en las lineas 14, 27, 34, 41, 48, 55, 62 y 69 de la
 * clase "CuentaBancaria"
 * 
 * Los incisos b) y c) se encuentra presente en todo el codigo de ambas clases
 * 
 * El punto 1.2 fue desarrollado a partir de la linea 17 de ejecutarPrueba
 * El punto 1.3 fue desarrollado a partir de la linea 28 de ejecutarPrueba
 * EL punto 1.9 fue desarrollado a partir de la linea 44 de ejecutarPrueba
 */
public class ejecutarPrueba {
 
    //Metodo para la creacion de una cuenta con valores predeterminados
    private static void cuentaDefault(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Inserte nombre del usuario");
        String nombre=entrada.nextLine();
        System.out.println("Inserte apellidos del usuario");
        String apellido=entrada.nextLine();
        System.out.println("Inserte fecha actual");
        String fecha=entrada.nextLine();
    }
    
    //Metodo para la creacion de una cuenta con valores especificos
    private static void cuentaPersonalizada(){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Inserte el identificador deseado para la cuenta");
        int identificador=entrada.nextInt();
        System.out.println("Inserte nombre del usuario");
        String nombre=entrada.nextLine();
        System.out.println("Inserte apellidos del usuario");
        String apellido=entrada.nextLine();
        System.out.println("Inserte el saldo incial deseado");
        int saldo=entrada.nextInt();
        System.out.println("Inserte fecha actual");
        String fecha=entrada.nextLine();
    }
    
    private static void prueba(){
        int identificador = 1234;
        int saldo=21000;
        double interesAnual= 4.5;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Inserte nombre del usuario");
        String nombre=entrada.nextLine();
        System.out.println("Inserte apellidos del usuario");
        String apellido=entrada.nextLine();
        System.out.println("Inserte fecha actual");
        String fecha=entrada.nextLine();
        
        CuentaBancaria cuentaPrueba = new CuentaBancaria(saldo, nombre, apellido, saldo, saldo, BigDecimal.valueOf(interesAnual), fecha);
        
        System.out.println("Retiro de $2500");
        cuentaPrueba.setSaldoActual(saldo-2500);
        
        System.out.println("Deposito de 3000");
        cuentaPrueba.setSaldoActual(saldo+3000);
        
        System.out.println("El saldo actual es de:"+ cuentaPrueba.getSaldoActual());
        System.out.println("La fecha de la creacion de la cuenta fue el: " + cuentaPrueba.getFechaCreacion());
    }
    
    public static void main(String[] args) {
        System.out.println("Inserte 1 para crear una cuenta "
                + "con valoess predeterminados, 2 para crear una cuenta con "
                + "valores personalizados y 3 para la cuenta prueba");
        Scanner entrada= new Scanner(System.in);
        int valor=entrada.nextInt();
        if (valor == 1) {
            cuentaDefault();
        }
        if (valor == 2) {
            cuentaPersonalizada();
        }
        if (valor ==3 ) {
            prueba();
        }
        
        
    }
}