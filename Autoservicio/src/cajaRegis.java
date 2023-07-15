import java.math.BigDecimal;
import java.util.Scanner;
/* Copyright (C) 2021 Mikkel
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
/* @author Mikkel*/
public class cajaRegis {
    public static void main(String[] args) {
        /*Declaracion de productos*/
        Productos prod1=new Productos();
        prod1.setId(101);
        prod1.setName("Tea");
        prod1.setPrecio(BigDecimal.valueOf(20));
        Productos prod2=new Productos();
        prod2.setId(102);
        prod2.setName("Coffe");
        prod2.setPrecio(BigDecimal.valueOf(15));
        Productos prod3=new Productos();
        prod3.setId(103);
        prod3.setName("Iced Coffe");
        prod3.setPrecio(BigDecimal.valueOf(30));
         /*Inicio de caja registradora*/
        System.out.println("Ingrese cantidad de productos: ");
        Scanner entrada= new Scanner(System.in);
        int cantidad=entrada.nextInt();
        double etiqueta,total=0;
        for (int i=0; i<cantidad;i++){
            System.out.println("Ingrese precio");
            etiqueta=entrada.nextDouble();
            /*Precio mal ingresado, se vuelve a pedir que se ingrese nuevamente sin sumar al total ese error*/
            if (etiqueta!=20&&etiqueta!=15&&etiqueta!=30) {
                System.out.println("Precio mal ingresado");
                i=i-1;
                etiqueta=0;
            }
            if (etiqueta==20){
                System.out.println("Nombre del producto: "+prod1.getName()+" ID: "+prod1.getId()+" Precio: "+prod1.getPrecio());
            }
            if (etiqueta==15){
                System.out.println("Nombre del producto: "+prod2.getName()+" ID: "+prod2.getId()+" Precio: "+prod2.getPrecio());
            }
            if (etiqueta==30){
                System.out.println("Nombre del producto: "+prod3.getName()+" ID: "+prod3.getId()+" Precio: "+prod3.getPrecio());
            }
            total=total+etiqueta;
        }
        System.out.println("Total a pagar: "+total);
        System.out.println("Ingrese cantidad de dinero con la que desea pagar:");
        double pago,camb;
        pago=entrada.nextDouble();
         /*Aqui se inicia la clase cliente, la cual se sirve para identificar y separar a cada cliente*/
        Cliente client1=new Cliente();
        client1.setDinero(BigDecimal.valueOf(pago));
        client1.setTotal(BigDecimal.valueOf(total));
        camb=pago-total;
        client1.setCambio(BigDecimal.valueOf(camb));
        if (camb<0){
             /*Pedir que se pague lo faltante*/
            System.out.println("Pago insuficiente, ingrese lo faltante: "+camb);
            total=camb*-1;
            pago=entrada.nextDouble();
            client1.setDinero(BigDecimal.valueOf(pago));
            camb=pago-total;
            client1.setCambio(BigDecimal.valueOf(camb));
        }
        System.out.println("El cambio restante es de: "+client1.getCambio());
    }
}