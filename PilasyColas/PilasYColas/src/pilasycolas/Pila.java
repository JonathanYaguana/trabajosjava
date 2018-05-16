/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilasycolas;

/**
 *
 * @author Davis
 */
public class Pila {

    private String[] datos;

    public Pila() {
        datos = new String[0];
    }

    public void agregar(String valor) {
        String[] copia = datos;
        datos = new String[datos.length + 1];
        System.arraycopy(copia, 0, datos, 0, copia.length);
        datos[datos.length - 1] = valor;
    }

    public boolean estaVacia() {
        return datos.length == 0;
    }

    public String obtenerUltimo() {
        return getLast();
    }

    public String obtenerUltimoYEliminar() {
        String ultimo = getLast();
        if (datos.length > 0) {
            String[] copia = datos;
            datos = new String[datos.length - 1];
            System.arraycopy(copia, 0, datos, 0, datos.length);
        }
        return ultimo;
    }

    private String getLast() {
        if (datos.length > 0) {
            return datos[datos.length - 1];
        }
        return String.valueOf(-1);
    }

    public int buscarExactamente(String valorABuscar) { // Busca exactamente como está
        for (int i = 0; i < datos.length; i++) {
            if (valorABuscar.contentEquals(datos[i])) {
                return datos.length - i;
            }
        }

        return -1;
    }

    public int buscar(String valorABuscar) { // Busca ignorando mayúsculas y minúsculas
        for (int i = 0; i < datos.length; i++) {
            if (valorABuscar.equalsIgnoreCase(datos[i])) {
                return datos.length - i;
            }
        }

        return -1;
    }

    public int obtenerTamanio() {
        return datos.length;
    }

    //
    public void mostrar() {
        System.out.print("[");
        for (int i = 0; i < datos.length; i++) {
            String signo = i == datos.length - 1 ? "" : ", ";
            System.out.print(datos[i] + signo);
        }
        System.out.print("]\n");
    }
}
