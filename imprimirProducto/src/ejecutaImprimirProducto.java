
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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
 *
 * @author Mikkel
 */
public class ejecutaImprimirProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inserte nombre y precio del primer producto");
        Scanner entrada=new Scanner(System.in);
        String nombre1=entrada.next();
        double precioProducto1=entrada.nextDouble();
        System.out.println("Inserte nombre y precio del segundo producto");
        String nombre2=entrada.next();
        double precioProducto2=entrada.nextDouble();
        Producto product1=new Producto(nombre1, BigDecimal.valueOf(precioProducto1));
        Producto product2=new Producto(nombre2, BigDecimal.valueOf(precioProducto2));
        System.out.println("Precio normal \n"+product1+"\n"+product2);
        product1.setDescuento(BigDecimal.valueOf(50));
        product2.setDescuento(BigDecimal.valueOf(50));
        product1.setPrecio(product1.getPrecio().subtract(product1.getDescuento()).setScale(0,RoundingMode.HALF_UP));
        product2.setPrecio(product2.getPrecio().subtract(product2.getDescuento()).setScale(0,RoundingMode.HALF_UP));
        System.out.println("Precios con descuento: \n"+product1+"\n"+product2);
    }   
}