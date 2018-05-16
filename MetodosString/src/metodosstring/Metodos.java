/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosstring;

import java.util.Scanner;

/**
 *
 * @author PROGRAMACION 2do A
 */
public class Metodos
{

    Scanner sc = new Scanner(System.in);

    public char charAt(String strCadena)
    {
        char s = ' ';
        int intPosicion = 0;
        System.out.println("Que posicion quiere");
        intPosicion = sc.nextInt();

        s = strCadena.charAt(intPosicion);

        return s;
    }

    public int compareTo(String srtCadena)
    {
        int intComparar = 0;
        String strComparar = "";
        System.out.println("Ingrese la palabra a comparar");
        strComparar = sc.next();
        intComparar = strComparar.compareTo(srtCadena);

        return intComparar;
    }

    public int compareToIgnoreCase(String srtCadena)
    {
        int intComparar = 0;
        String strComparar = "";
        System.out.println("Ingrese la palabra a comparar");
        strComparar = sc.next();
        intComparar = strComparar.compareToIgnoreCase(srtCadena);

        return intComparar;
    }

    public String Concat(String strCadena)
    {

        String strConcat = "";
        String strUnido = "";
        System.out.println("Ingrese la palabar a unir");
        strConcat = sc.next();
        strUnido = strCadena.concat(" " + strConcat);
        return strUnido;

    }

    public boolean endswith(String strCadena)
    {
        String strEnd = "";
        boolean booRes = true;
        System.out.println("Ingrese la palabra a comparar");
        strEnd = sc.next();
        booRes = strCadena.endsWith(strEnd);
        return booRes;

    }

    public boolean equalIgnoreCase(String strCadena)
    {

        boolean booresp = true;
        String strCadena2 = "";
        System.out.println("Ingrese la palabra a comprar");

        booresp = strCadena.equalsIgnoreCase(strCadena2);

        return booresp;
    }

    public int indexOf(String strCadena)
    {
        int intIndex = 0;
        String strCaracter = "";

        System.out.println("Ingrese el caracter a buscar");
        strCaracter = sc.nextLine();

        intIndex = strCadena.indexOf(strCaracter);
        return intIndex;
    }

    public int lastIndexOf(String strCadena)
    {
        int intIndex = 0;
        String strCaracter = "";

        System.out.println("Ingrese el caracter a buscar");
        strCaracter = sc.nextLine();

        intIndex = strCadena.indexOf(strCaracter);
        return intIndex;
    }

    public int length(String strCadena)
    {
        int intLength = strCadena.length();

        return intLength;
    }

    public String remplace(String strCadena)
    {
        String strCambio = "";
        String strPCambio = "";
        System.out.println("Ingrese la palabra por la que va a cambiar");
        strCambio = sc.nextLine();

        strPCambio = strCadena.replace(strCadena, strCambio);

        return strPCambio;
    }

    public String remplaceFirst(String strCadena)
    {
        String strCambio = "";
        String strCaracter = "";
        String strRCaracter = "";
        System.out.println("Ingrese el caracter a cambiar");
        strCaracter = sc.nextLine();
        System.out.println("Ingrese el caracter por el que va a cambiar");
        strRCaracter = sc.nextLine();

        strCambio = strCadena.replaceFirst(strCaracter, strRCaracter);

        return strCambio;
    }

    public String remplaceAll(String strCadena)
    {
        String strCambio = "";
        String strCaracter = "";
        String strRCaracter = "";
        System.out.println("Ingrese el caracter a cambiar");
        strCaracter = sc.nextLine();
        System.out.println("Ingrese el caracter por el que va a cambiar");
        strRCaracter = sc.nextLine();

        strCambio = strCadena.replaceAll(strCaracter, strRCaracter);
        return strCambio;
    }

    public boolean StartsWith(String strCadena)
    {
        boolean booComp = true;
        String strLetras = "";
        System.out.println("Ingrese las letras a comprar");
        strLetras = sc.nextLine();
        booComp = strCadena.startsWith(strLetras);

        return booComp;
    }

    public String subString(String StrCadena)
    {
        int intpos = 0;
        int intpos2 = 0;

        String strSubS;
        System.out.println("Ingrese el inicio del rango");
        intpos = sc.nextInt();

        System.out.println("Ingrese el fin del rango");
        intpos2 = sc.nextInt();
        strSubS = StrCadena.substring(intpos, intpos2);
        return strSubS;

    }

    public char[] ToArray(String strCadena)
    {
        char[] array = strCadena.toCharArray();
        return array;
    }

    public String toLowerCase(String strCadena)
    {
        String strCambio = "";
        strCambio = strCadena.toLowerCase();
        return strCambio;

    }

    public String toUpperCase(String strCadena)
    {
        String strCambio = "";
        strCambio = strCadena.toUpperCase();
        return strCambio;

    }

    public String trim(String strCadena)
    {
        String strCambio = "";
        strCambio = strCadena.trim();
        return strCambio;

    }

    public void StringValueof()
    {
        int intnumero = 0;
        String strCadena = "";
        boolean boores;
        System.out.println("Ingrese un numero");
        intnumero = sc.nextInt();
        strCadena = String.valueOf(intnumero);
        System.out.println("El numero transformado a string es: " + strCadena);

    }

    public boolean isEmpi(String strCadena)
    {
        boolean boores = true;
        String strCambio = "";
        boores = strCadena.isEmpty();
        return boores;

    }

}
