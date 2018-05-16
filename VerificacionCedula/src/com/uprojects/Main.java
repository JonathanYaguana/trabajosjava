package com.uprojects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tomamos valores
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba su cédula: ");
        String cedula = scanner.next();

        // Verificamos si la longitud de la cédula es igual a 10, sino motrar un mensaje de error.
        if (cedula.length() == 10) {
            /*
                Llamo a la función <cedulaEsCorrecta> (ver más abajo), para verificar si la cédula
                es correcta.
             */
            if (cedulaEsCorrecta(cedula)) { // Si lo es, mostrar que es correcta.
                System.out.println("Su cédula es correcta.");
            } else { // Sino, o en caso contrario, mostrar que no es válida
                System.out.println("Su cédula no es válida");
            }
        } else {
            System.out.println("Escriba una cédula completa.");
            /*
                Mensaje de error de la cédula cuando la longitud de ésta no se adecúa
                al tamaño necesario.
             */
        }
    }

    private static boolean cedulaEsCorrecta(String cedula) {
        int suma = 0; // Empiezo con un contador, se va a encargar de sumar todos los números de la cédula menos el último

        for (int i = 0; i < cedula.length() - 1; i++) { // Leemos cada número con un for solo hasta el penúltimo
            int numero = Integer.valueOf(String.valueOf(cedula.charAt(i)));

            /*
                Por cada número que se repita lo tomamos y lo convertimos a int. Ya que éste viene de una cadena String.
                Los que hacemos es tomar el número en la posición <i>, luego lo transforarmos a String para después
                convertirlo a int con la función <Integer.valueOf(parametro)>
             */

            /*
                Los números  de la cédula se tiene que multiplicar por 2 y luego 1 continuamente.
                Pero, como solo el 2 cuenta (cada número multiplicado por 1 da lo mismo) entonces
                usamos un solo if -> Si el número es par entonces multiplicamos el número que convertimos
                anteriomente por 2.
             */

            if (i % 2 == 0) {
                numero *= 2;
            }

            /*
                Una vez tenemos el número completo procedemos a hacer la comprobación:
                Si el número es mayor que 9, le restamos 9. Y así sucesivamente hasta que la condición
                sea falta. He ahí el uso del <while>:
             */

            while (numero > 9) {
                numero -= 9;
            }

            suma += numero; // Por cada operación que hacemsos al número tomado, se lo agregamos al contador <suma>.
        }

        int ultimoNumero = Integer.valueOf(String.valueOf(cedula.charAt(cedula.length() - 1)));
        // Tomamos el último número
        int superior = suma;
        /*
            Creo una variable para una variable superior. Es decir, si  tengo 47, superior debe ser igual a 50.
            Si tengo 41, superior debe ser 50. Si tengo 30, no hace nada. Ya que ya está en su número "máximo".

            Básicamente la verificación de la cédula es la siguiente:
            Una cédula es válida si la diferencia del número superior de la suma y la suma es igual al último
            número de la cédula.
         */

        while (superior % 10 != 0) {
            superior++; // Si superior no está en su máximo, sumaremos +1 a éste cada vez hasta que lo sea.
            /*
                Por ejemplo, si tengo 45, sucederá lo sigueinte: 46, 47, 48, 49, 50 <-- Y ahí se detiene,
                ya que está en número máximo. O, como está en la condición del <while> : superior  % 10 != 0 es falso.
             */
        }

        /*
            Finalmente mostramos el valor de verdad -> devolver el valor de verdad entre la diferencia de superior y suma
            sea igual a ultimoNumero.

            La línea de abajo es como escribir.

            if(superior - suma == ultimoNumero){
                return true;
            }else{
                return false;
            }
         */

        return superior - suma == ultimoNumero;
    }
}
