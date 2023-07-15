
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
public class controlTV {

    public static void main(String[] args) {
        boolean apagar = true;
        String estado = "apagado", decision;
        int vol = 10, cambiar = 1;
        Scanner entrada = new Scanner(System.in);
        //creacion de menus de canales
        canal canal = new canal();
        canal.setNombreCanal("Disney");
        canal canal2 = new canal();
        canal2.setNombreCanal("National Geographic");
        canal canal3 = new canal();
        canal3.setNombreCanal("History");
        canal canal4 = new canal();
        canal4.setNombreCanal("HBO");
        canal canal5 = new canal();
        canal5.setNombreCanal("Star Channel");

        //Estado inicial de TV
        tv television = new tv();
        television.setEstadoTv(estado);
        System.out.println("Estado de TV: " + television.getEstadoTv());
        television.setSonido(vol);
        television.setCanal(canal.getNombreCanal());
        //creacion de control remoto       
        controlRemoto control = new controlRemoto();

        //proceso de encendido de TV
        System.out.println("Encender TV");
        apagar = false;
        control.setEncendido(apagar);
        estado = "Endendido";
        television.setEstadoTv(estado);
        System.out.println("Estado de TV: " + television.getEstadoTv() + " Canal: " + television.getCanal() + " Volumen: " + television.getSonido());
      
        //Cambiar de canal
        System.out.println("Cambiar al canal: ");
        cambiar = entrada.nextInt();
        control.setCambiarCanal(cambiar);
        if (control.getCambiarCanal() == 1) {
            television.setCanal(canal.getNombreCanal());
            System.out.println("Canal cambiado a: " + television.getCanal());
        }
        if (control.getCambiarCanal() == 2) {
            television.setCanal(canal2.getNombreCanal());
            System.out.println("Canal cambiado a: " + television.getCanal());
        }
        if (control.getCambiarCanal() == 3) {
            television.setCanal(canal3.getNombreCanal());
            System.out.println("Canal cambiado a: " + television.getCanal());
        }
        if (control.getCambiarCanal() == 4) {
            television.setCanal(canal4.getNombreCanal());
            System.out.println("Canal cambiado a: " + television.getCanal());
        }
        if (control.getCambiarCanal() == 5) {
            television.setCanal(canal5.getNombreCanal());
            System.out.println("Canal cambiado a: " + television.getCanal());
        }
        
        //cambiar volumen
        //subir
        System.out.println("Subir volumen");
        vol++;
        control.setVolumen(vol);
        television.setSonido(control.getVolumen());
        System.out.println("Volumen de TV a: " + television.getSonido());
        //bajar
        System.out.println("Bajar volumen");
        vol--;
        control.setVolumen(vol);
        television.setSonido(control.getVolumen());
        System.out.println("Volumen de TV a: " + television.getSonido());
        
        //apagar TV
        System.out.println("Aapagar TV");
        apagar = true;
        control.setEncendido(apagar);
        estado = "Apagado";
        television.setEstadoTv(estado);
        System.out.println("Estado de TV: " + television.getEstadoTv());
    }

}
