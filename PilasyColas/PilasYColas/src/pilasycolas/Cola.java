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
public class Cola {

    private String[] datos;

    public Cola() {
        datos = new String[0];
    }

    public void agregarEnLaUltimaPosicion(String valor) {
        String[] copia = datos;
        datos = new String[datos.length + 1];
        System.arraycopy(copia, 0, datos, 0, copia.length);
        datos[datos.length - 1] = valor;
    }

    public void agregarEnLaPrimeraPosicion(String valor) {
        if (datos.length == 0) {
            datos = new String[1];
            datos[0] = valor;
        } else {
            String[] copia = datos;
            datos = new String[datos.length + 1];
            datos[0] = valor;
            System.arraycopy(copia, 0, datos, 1, copia.length);
        }
    }

    public void agregarGrupo(String[] grupoDeValores) {
        if (datos.length == 0) {
            datos = grupoDeValores;
        } else {
            String[] copia = datos;
            datos = new String[datos.length + grupoDeValores.length];
            System.arraycopy(copia, 0, datos, 0, copia.length);

            for (int i = copia.length; i < datos.length; i++) {
                datos[i] = grupoDeValores[(i - 1) - grupoDeValores.length];
            }
        }
    }

    public void eliminarTodo() {
        datos = new String[0];
    }

    public String[] clonar() {
        return datos;
    }

    public boolean contieneExactamenteEsteElemento(String valorABuscar) {
        if (datos.length > 0) {
            for (String dato : datos) {
                if (dato.contentEquals(valorABuscar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean contieneEsteElemento(String valorABuscar) {
        if (datos.length > 0) {
            for (String dato : datos) {
                if (dato.equalsIgnoreCase(valorABuscar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public String obtenerElPrimerElemento() {
        return getFirst();
    }

    public String obtenerElPrimerElementoYEliminarlo() {
        String primero = getFirst();
        if (datos.length > 0) {
            String[] copia = datos;
            datos = new String[datos.length - 1];

            for (int i = 0; i < datos.length; i++) {
                datos[i] = copia[i + 1];
            }
        }
        return primero;
    }

    private String getFirst() {
        if (datos.length > 0) {
            return datos[0];
        }
        return null;
    }

    public String obtenerElUltimoElemento() {
        return getLast();
    }

    public String obtenerElUltimoElementoYEliminarlo() {
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
        return null;
    }

    public String obtenerElementoEnLaPosicion(int posicion) {
        if (datos.length > 0 && posicion >= 0 && posicion < datos.length) {
            return datos[posicion];
        }
        return null;
    }

    public int posicionDelElementoExacto(String elemento) {
        for (int i = 0; i < datos.length; i++) {
            if (elemento.contentEquals(datos[i])) {
                return i;
            }
        }
        return -1;
    }

    public int posicionDelElemento(String elemento) {
        for (int i = 0; i < datos.length; i++) {
            if (elemento.equalsIgnoreCase(datos[i])) {
                return i;
            }
        }
        return -1;
    }

    public int obtenerUltimaPosicionDelElementoExacto(String elemento) {
        int posicion = -1;
        for (int i = 0; i < datos.length; i++) {
            if (elemento.contentEquals(datos[i])) {
                posicion = i;
            }
        }
        return posicion;
    }

    public int obtenerUltimaPosicionDelElemento(String elemento) {
        int posicion = -1;
        for (int i = 0; i < datos.length; i++) {
            if (elemento.equalsIgnoreCase(datos[i])) {
                posicion = i;
            }
        }
        return posicion;
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
