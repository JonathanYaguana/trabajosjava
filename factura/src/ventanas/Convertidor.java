/*To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author davis
 */
public class Convertidor {

    private final static String[] unidades = {"", "Uno", "Dos", "Tres", "Cuatro",
        "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Once", "Doce", "Trece", "Catorce", "Quince",
        "Dieciséis", "Diecisiete", "Dieciocho", "Diecinueve"};

    private final static String[] decenas = {"Veinte", "Treinta", "Cuarenta", "Cincuenta", "Sesenta", "Setenta",
        "Ochenta", "Noventa"};

    private final static String[] centenas = {"Ciento", "Doscientos", "Trescientos", "Cuatrocientos", "Quinientos",
        "Seiscientos", "Setecientos", "Ochocientos", "Novecientos"};

    public static String aPalabra(double numero) {
        String[] strnumero = ("" + numero).replace(".", "/").split("/");
        String entero = getNumero(strnumero[0]);
        String decimal = "";
        if (strnumero.length == 2 && !strnumero[1].contentEquals("0")) {
            decimal += " coma " + getNumero(strnumero[1]);
        }

        return (entero.isEmpty() ? "Cero" : entero) + decimal.toLowerCase();
    }

    private static String getNumero(String numero) {
        int length = numero.length();
        if (length == 1 || length == 4 || length == 7) {
            numero = "00" + numero;
        } else if (length == 2 || length == 5) {
            numero = "0" + numero;
        }

        List<String> centenas = new ArrayList<>();

        String add = "";
        for (int i = 0; i < numero.length(); i++) {
            add += String.valueOf(numero.charAt(i));
            if ((i + 1) % 3 == 0) {
                centenas.add(add);
                add = "";
            }
        }

        String adds = "";

        for (int i = 0; i < centenas.size(); i++) {
            String ctena = getCentena(centenas.get(i));
            String decenaUnidad = getDecenaUnidad(centenas.get(i).substring(1));

            if (centenas.size() >= 2 && i >= 1) {
                ctena = ctena.toLowerCase();
                decenaUnidad = decenaUnidad.toLowerCase();
            }

            if (!ctena.isEmpty()) {
                decenaUnidad = decenaUnidad.toLowerCase();
            }

            if (!ctena.isEmpty() && !decenaUnidad.isEmpty()) {
                ctena += " ";
            }

            if (((centenas.size() == 2 && i == 0) || (centenas.size() == 3 && i == 1))
                    && !centenas.get(i).contentEquals("000")) {
                decenaUnidad = (decenaUnidad.trim().replace("uno", "")) + " mil ";
            }

            if (centenas.size() == 3 && i == 0) {
                if (aLetra(centenas.get(i), 2).contentEquals("1")) {
                    decenaUnidad = decenaUnidad.toLowerCase()
                            .replaceAll("uno", "Un millón ");
                } else {
                    decenaUnidad += " millones ";
                }
            }

            adds += ctena + decenaUnidad;
        }

        adds = adds.replaceAll("Uno mil", "Mil").trim();

        return adds;
    }

    private static String aLetra(String palabra, int index) {
        return String.valueOf(palabra.charAt(index));
    }

    private static boolean letraEsCero(String palabra, int index) {
        return String.valueOf(palabra.charAt(index)).contentEquals("0");
    }

    private static String getCentena(String centena) {
        if (centena.contentEquals("100")) {
            return "Cien";
        } else if (centena.length() == 3 && !aLetra(centena, 0).contentEquals("0")) {
            int numero = Integer.valueOf(aLetra(centena, 0));
            return centenas[numero - 1];
        } else {
            return "";
        }
    }

    private static String getDecenaUnidad(String decenaUnidad) {
        int numero = Integer.valueOf(decenaUnidad);
        if (numero < 20) {
            return unidades[numero];
        } else {
            int indexDecena = Integer.valueOf(aLetra(decenaUnidad, 0));
            String decena = "";
            if (indexDecena != 0) {
                decena = decenas[indexDecena - 2];
            }

            int indexUnidad = Integer.valueOf(aLetra(decenaUnidad, 1));
            String unidad = "";
            if (indexUnidad != 0) {
                String y = "y ";
                unidad = y + unidades[indexUnidad];
            }

            return decena + (unidad.isEmpty() ? "" : " ")
                    + (decena.isEmpty() ? unidad : unidad.toLowerCase());
        }
    }
}