
import java.util.Scanner;

/*
 * Copyright (C) 2021 Mikkel
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * @author Mikkel
 */
public class ejecutarSmartphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de celulares
        String estadoCel = "Encendidos";
        //Celular Num1
        int precio = 17000, memoria = 128, resolucion = 64;
        Celular android1 = new android("Android", "Samsung", precio, memoria, resolucion, "Negro", estadoCel);
        //Celular Num2
        precio = 19000;
        Celular iOS1 = new iOS("iOS", "Apple", precio, memoria, resolucion, "Negro", estadoCel);

        //Menú de usuario
        System.out.print("Menú principal: seleccione la opcion deseada" + "\n1) Lista de celulares" + "\n2) Apps Instaladas" + "\n3) Salir");
        Scanner entrada = new Scanner(System.in);
        int opc = entrada.nextInt();
        while (opc != 3) {
            //Opcion 1 del menú de usuario
            if (opc == 1) {
                System.out.println("-----------------------------------------");
                System.out.println("1) " + android1 + "\n2) " + iOS1);
                System.out.println("-----------------------------------------");
            }
            //Opcion 2 del menú de usuario
            if (opc == 2) {
                String apps = "Youtube, Google Chrome, Facebook, PlayStore";
                System.out.println("-----------------------------------------");
                System.out.println("Android: " + apps);
                apps = "Safari, iCloud, iTunes, AppStore";
                System.out.println("iOS: " + apps);
                System.out.println("-----------------------------------------");
            }
            System.out.print("Menú principal: seleccione la opcion deseada" + "\n1) Lista de celulares" + "\n2) Apps Instaladas" + "\n3) Salir");
            opc = entrada.nextInt();
           
        }
    }
}
