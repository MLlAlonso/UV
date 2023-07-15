
import java.util.Locale;
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
public class ejecutaVotaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de los partidos, con su primer nombre
        MaquinaParaVotaciones partido1 = new MaquinaParaVotaciones(0);
        MaquinaParaVotaciones partido2 = new MaquinaParaVotaciones(0);
        MaquinaParaVotaciones partido3 = new MaquinaParaVotaciones(0);
        System.out.println("Introduzca nombre de los 3 partidos: ");
        Scanner entrada = new Scanner(System.in);
        String nombrep1 = entrada.next();
        String nombrep2 = entrada.next();
        String nombrep3 = entrada.next();
        partido1.setNombrePartido(nombrep1);
        partido2.setNombrePartido(nombrep2);
        partido3.setNombrePartido(nombrep3);
        //Menu principal
        System.out.println("1)Votar\n" + "2)Resultados\n" + "3)Reinicio\n" + "4)Salir");
        byte opc = entrada.nextByte();
        int totalVotantes = 0;
        int votosP1 = 0;
        int votosP2 = 0;
        int votosP3 = 0;
        while (opc != 4) {
            switch (opc) {
                case 1: {
                    //Menu de votos
                    System.out.println("Introduzca el numero de votantes");
                    int nVotantes = entrada.nextInt();
                    totalVotantes = totalVotantes + nVotantes;
                    for (int i = 0; i < nVotantes; i++) {
                        System.out.println("Votar por:\n" + "1)" + partido1.getNombrePartido() + "\n2)" + partido2.getNombrePartido() + "\n3)" + partido3.getNombrePartido());
                        opc = entrada.nextByte();
                        switch (opc) {
                            case 1: {
                                votosP1++;
                                partido1.settVotos(votosP1);
                                break;
                            }
                            case 2: {
                                votosP2++;
                                partido2.settVotos(votosP2);
                                break;
                            }
                            case 3: {
                                votosP3++;
                                partido3.settVotos(votosP3);
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.print("Numero de votantes: " + totalVotantes + "\n> " + partido1.getNombrePartido());
                    for (int i = 0; i < partido1.gettVotos(); i++) {
                        System.out.print("*");
                    }
                    System.out.println(" ("+partido1.gettVotos()+")");
                    System.out.print("> "+partido2.getNombrePartido());
                    for (int i = 0; i < partido2.gettVotos(); i++) {
                        System.out.print("*");
                    }
                    System.out.println(" ("+partido2.gettVotos()+")");
                    System.out.print("> "+partido3.getNombrePartido());
                    for (int i = 0; i < partido3.gettVotos(); i++) {
                        System.out.print("*");
                    }
                    System.out.println(" ("+partido3.gettVotos()+")");
                    break;
                }
                case 3: {
                    partido1.setReset(true);
                    partido2.setReset(true);
                    partido3.setReset(true);
                    System.out.println("Reiniciando sistema...\n Introduzca los nuevos nombres de los partidos");
                    partido1.settVotos(0);
                    partido2.settVotos(0);
                    partido3.settVotos(0);
                    partido1.setReset(false);
                    partido2.setReset(false);
                    partido3.setReset(false);
                    nombrep1 = entrada.next();
                    nombrep2 = entrada.next();
                    nombrep3 = entrada.next();
                    partido1.setNombrePartido(nombrep1);
                    partido2.setNombrePartido(nombrep2);
                    partido3.setNombrePartido(nombrep3);
                    totalVotantes=0;
                    System.out.println("Nuevos nombres:\n" + "1)" + partido1.getNombrePartido() + "\n2)" + partido2.getNombrePartido() + "\n3)" + partido3.getNombrePartido());
                }
            }
            System.out.println("\nDar por terminado el proceso de votacion? " + "1)Si " + "2)No");
            opc = entrada.nextByte();
            if (opc == 1) {
                opc = 4;
            } else {
                System.out.println("1)Votar\n" + "2)Resultados\n" + "3)Reinicio\n");
                opc = entrada.nextByte();
            }
        }
    }
}