/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometricas_fibonacci;

// Impórtala si usas el try catch
//import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Davis
 */
public class FigurasGeometricas_Fibonacci {

    /*    
        Variables constantes que, por comoidad fueron asiganas.
        Síentete libre de cambiar su nombre (ten cuidado al cambiar
        los valores), o si prefieres no usarlas. Directamente pon su
        valor en vez de sus nombres cuando se usen.
     */
    private static final int CILINDRO = 1;
    private static final int CIRCULO = 2;
    private static final int CUADRADO = 3;
    private static final int FIBONACCI = 4;
    private static final int RECTANGULO = 5;
    private static final int TRIANGULO = 6;
    private static final int PIRAMIDE = 7;

    private static final int AREA = 1;
    private static final int PERIMETRO = 2;

    /*
     *
     *
     *
     *  SIMPLIFICAD ESTA APLICACIÓN A VUESTRO PARECER
     *
     *
     *
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  
            Do while es una estructura de repetición similar
            al While, con la diferencia que el doWhile se ejecuturará
            al menos una vez.
            Podemos usar esta estrucutra de ciclo de repetición para preguntar
            al usuario si desea repetir la aplicación nuevamente
        
            Escribimos en do todo nuestro código, y dentro de while la condición
            que será la siguiente: "Si el usuario escribe s (de sí) se repetirá,
            (esta condición modifícala a tu parecer), caso contrario sea otro valor
            ya sea n, NO, o abc, el programa acabará.
         */

        // Creamos una referencia de clase que nos permite obtener datos por teclado
        Scanner scanner = new Scanner(System.in);

        do {
            // Damos una <bienvenida>, los *** es solo interfaz, para no equivocarnos al repetir al aplicación
            msg("**********************************");

            msg("Funciones de figuras geométricas y serie de Fibonacci");
            // Un simple salto de línea
            msg();
            // Damos a elegir opciones
            msg("Elige con números una figura, o bien la serie de Fibonacci:");
            msg();
            msg("1. Cilindro\n2. Círculo\n3. Cuadrado\n4. Fibonacci\n5. Rectángulo"
                    + "\n6. Triángulo\n7. Pirámide\n");

            msgSinSalto("Tu respuesta: ");
            // Obtenemos la respuesta y lo guardamos en una variable en este caso de tipo entero (int)
            // Verificamos que el dato obtenido es un valor correcto. (Ej. que no sea una letra)
            // Valor por defecto;
            int respuesta = scanner.nextInt();
            /*
            Si quieres comprobar que el dato ingresado es correcto, escribe
            el siguiente código:
            
            int respuesta = CILINDRO;
            while (true) {
                try {
                    respuesta = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    msg("Ingresa un valor correcto: ");
                    scanner.next(); // clear scanner wrong input
                }
            }   
             */
            // Si no es Fibonacci preguntamos si queremos obtener el área o perímetro
            /*
            Pero ,¿qué pasa si no fueron ninguna de las dos?.
            Añadamos un par de líneas para definir un valor "por defecto"
            y asignemos su valor respectivo
             */

            if (respuesta != CILINDRO && respuesta != CIRCULO && respuesta != CUADRADO
                    && respuesta != FIBONACCI & respuesta != RECTANGULO && respuesta != TRIANGULO
                    && respuesta != PIRAMIDE) {
                // Valor por defecto
                respuesta = CILINDRO;
                msg("Se usará el valor Cilindro por defecto");
            }

            // Declaramos opcion área y un valor por defecto;
            boolean esarea = true;
            if (respuesta != FIBONACCI) {
                msg("\n¿Qué obtengo?");
                msg("1. Área\n2. Perímetro (en algunas figuras Volumen)\n");
                /* 
                Obtenemos la funcion
                Creamos una variable de tipo boolean, puede tener solo dos valores
                verdadero o falso (true o false). Es idóneo ya que si si no es área
                lo que el usuario ha escrito, por ende o lógica es perímetro.
                 */

                msgSinSalto("Tu respuesta: ");
                int funcion = scanner.nextInt();
                // Añadamos su valor, y además uno por defecto
                if (funcion != AREA && funcion != PERIMETRO) {
                    esarea = true;
                    // Mostramos que se usará el valor por defecto
                    msg("Se usará el valor área por defecto");
                } else {
                    esarea = funcion == AREA;
                }
            }
            // Empezamos a hacer funciones en relación a la respuesta
            // Usamos estructuras de condición para saber con qué figura o sucesión trabajar
            // Un switch se nos es más cómod para esta aplicación
            switch (respuesta) {
                case CIRCULO: {
                    /*
                        Tomamos datos:
                        Área = PI * radio * radio (radio al cuadrado)
                        Perímetro = 2 * PI * radio
                        Obtenemos valores esenciales; que, en este caso, es el radio
                     */
                    msgSinSalto("Escribe un radio: ");
                    /*  Usamos double (no usamos float por que el valor de un área puede ser muy alto)
                        para obtener el radio como un decimal (2.4, 2.8, 9.17), ya que no siempre el radio va a ser un dato
                        de tipo entero (1, 5, 8)
                     */
                    // Usamos la funcion next junto a al tipo de variable que estamos asignando, es decir double -> nextDouble();
                    double radio = scanner.nextDouble();
                    // Con el dato esencial hacemos las operaciones y mostramos los resultados
                    // Usamos (double) para transformar el dato obtenido a tipo double (a decimal)
                    // Usamos la librería Math.PI que trae consigo PI ya definido
                    // Antes habíamos definido si área o perímetro queriamos obtener, usemos esa variable y hagamos las operaciones
                    // Usamos el símbolo "+" para unir el título que asignamos junto al valor obtenido
                    if (esarea) {
                        double area = (double) Math.PI * radio * radio;
                        msgSinSalto("El área es: " + area);
                    } else {
                        double perimetro = (double) 2 * Math.PI * radio;
                        msgSinSalto("El perímetro es: " + perimetro);
                    }
                    // Hacemos lo mismo con las demás figuras
                    break;
                }

                case CILINDRO: {
                    msgSinSalto("Escribe una radio: ");
                    double radio = scanner.nextDouble();
                    msgSinSalto("Escribe una altura: ");
                    double altura = scanner.nextDouble();
                    if (esarea) {
                        double area = (double) 2 * Math.PI * radio * (altura + radio);
                        msgSinSalto("El área es: " + area);
                    } else {
                        double volumen = (double) Math.PI * radio * radio * altura;
                        msgSinSalto("El volumen es: " + volumen);
                    }
                    break;
                }

                case CUADRADO: {
                    msgSinSalto("Escribe un lado: ");
                    double lado = scanner.nextDouble();
                    if (esarea) {
                        double area = (double) lado * lado;
                        msgSinSalto("El área es: " + area);
                    } else {
                        double perimetro = (double) lado * 4;
                        msgSinSalto("El perímetro es: " + perimetro);
                    }
                    break;
                }

                case RECTANGULO: {
                    msgSinSalto("Escribe una base: ");
                    double base = (double) scanner.nextDouble();
                    msgSinSalto("Escribe una atlura: ");
                    double altura = (double) scanner.nextDouble();

                    if (esarea) {
                        double area = (double) base * altura;
                        msgSinSalto("El área es: " + area);
                    } else {
                        double perimetro = (double) (base * 2) + (altura * 2);
                        msgSinSalto("El perímetro es: " + perimetro);
                    }
                    break;
                }

                case TRIANGULO: {
                    final int EQUILATERO = 1;
                    final int ISOSCELES = 2;
                    final int ESCALENO = 3;

                    if (esarea) {
                        msgSinSalto("Escribe una base: ");
                        double base = (double) scanner.nextDouble();
                        msgSinSalto("Escribe una altura: ");
                        double altura = (double) scanner.nextDouble();
                        double area = (double) (base * altura) / 2;
                        msgSinSalto("El área es: " + area);
                    } else {
                        msg("\n Elige el tipo de triangulo, por defecto será el equilátero");
                        int tipo = scanner.nextInt();

                        if (tipo != EQUILATERO && tipo != ISOSCELES && tipo != ESCALENO) {
                            tipo = EQUILATERO;
                            msg("Se usó el valor por defecto");
                        }

                        switch (tipo) {
                            case EQUILATERO: {
                                msgSinSalto("Escribe una base: ");
                                double base = (double) scanner.nextDouble();
                                double perimetro = (double) base * 3;
                                msgSinSalto("El perímetro es: " + perimetro);
                                break;
                            }
                            case ISOSCELES: {
                                msgSinSalto("Escribe una base: ");
                                double base = (double) scanner.nextDouble();
                                msgSinSalto("Ingresa un lado: ");
                                double lado = scanner.nextDouble();
                                double perimetro = (double) base + (lado * 2);
                                msg("El perímetro es: " + perimetro);
                                break;
                            }
                            default: {
                                msgSinSalto("Ingresa el lado 1: ");
                                double lado1 = scanner.nextDouble();
                                msgSinSalto("Ingresa el lado 2: ");
                                double lado2 = scanner.nextDouble();
                                msgSinSalto("Ingresa el lado 3: ");
                                double lado3 = scanner.nextDouble();
                                double perimetro = (double) lado1 + lado2 + lado3;
                                msgSinSalto("El perímetro es: " + perimetro);
                            }
                        }
                    }
                    break;
                }

                case PIRAMIDE: {
                    // Math.sqrt sirve para obtener raices cuadradas, ver a continuación un ejemplo
                    if (esarea) {
                        msg("Perímetro: ");
                        msgSinSalto("Ingresa un lado de la base");
                        double lado = scanner.nextDouble();
                        msgSinSalto("¿Cuántos lados son en total?");
                        int cantidad = scanner.nextInt();
                        double perimetro = (double) lado * cantidad;

                        msg("Apotema lateral: ");
                        msgSinSalto("Ingresa la altura de la pirámide: ");
                        double altura = scanner.nextDouble();
                        msgSinSalto("Ahora, la apotema de la base: ");
                        double apotema = scanner.nextDouble();
                        double resultado = (double) ((altura * altura) + (apotema * apotema));
                        double ap = Math.sqrt(resultado);
                        double arealado = (double) (perimetro + ap) / 2;

                        msg("Tipo de base: ");
                        msgSinSalto("¿Qué figura es su base?: ");
                        msg("1. Triángulo\n2. Cuadrado\n3. Pentágono");
                        msgSinSalto("Tu respuesta (por defecto triángulo): ");
                        msg();
                        int tipo = scanner.nextInt();

                        double areabase;
                        switch (tipo) {
                            case 2: {
                                msgSinSalto("Ingresa un lado: ");
                                double ladoin = scanner.nextDouble();
                                areabase = (double) ladoin * ladoin;
                                break;
                            }
                            case 3: {
                                msgSinSalto("Ingresa una base: ");
                                double basein = scanner.nextDouble();
                                msgSinSalto("Ingresa una altura: ");
                                double alturain = scanner.nextDouble();
                                areabase = (double) (basein * alturain) / 2;
                                break;
                            }
                            default:
                                msgSinSalto("Ingresa un lado");
                                double ladoin = scanner.nextDouble();
                                msgSinSalto("Ahora, su apotema");
                                double apotemain = scanner.nextDouble();
                                areabase = ((ladoin * 5) * apotemain) / 2;
                        }

                        double areatotal = arealado + areabase;
                        msgSinSalto("El área total es: " + areatotal);
                    } else {
                        // Básicamente, repetimos lo mismo
                        msgSinSalto("¿Qué figura es su base?: ");
                        msg("1. Triángulo\n2. Cuadrado\n3. Pentágono");
                        msgSinSalto("Tu respuesta (por defecto triángulo): ");
                        msg();
                        int tipo = scanner.nextInt();

                        double areabase;
                        switch (tipo) {
                            case 2: {
                                msgSinSalto("Ingresa un lado: ");
                                double ladoin = scanner.nextDouble();
                                areabase = (double) ladoin * ladoin;
                                break;
                            }
                            case 3: {
                                msgSinSalto("Ingresa una base: ");
                                double basein = scanner.nextDouble();
                                msgSinSalto("Ingresa una altura: ");
                                double alturain = scanner.nextDouble();
                                areabase = (double) (basein * alturain) / 2;
                                break;
                            }
                            default:
                                msgSinSalto("Ingresa un lado");
                                double ladoin = scanner.nextDouble();
                                msgSinSalto("Ahora, su apotema");
                                double apotemain = scanner.nextDouble();
                                areabase = (double) ((ladoin * 5) * apotemain) / 2;
                        }

                        msgSinSalto("Ingresa la altura de la pirámide: ");
                        double altura = scanner.nextDouble();

                        double volumen = (double) (areabase * altura) / 3;
                        msgSinSalto("Su volumen es: " + volumen);
                    }
                    break;
                }
                //Para evitar confusiones, por defecto será la serie de Fibonacci
                default:
                    msgSinSalto("Ingresa una posición máxima (mayor que 1): ");
                    int posicion = scanner.nextInt();
                    while (posicion < 2) {
                        msgSinSalto("Ingresa un número mayor que 1: ");
                        posicion = scanner.nextInt();

                        if (posicion > 1) {
                            break;
                        }
                    }

                    String sucesion = "\n Tu serie: 1, 1";
                    int c = 0;
                    int a = 1;
                    int b = 1;

                    if (posicion > 2) {
                        for (int i = 0; i < posicion - 2; i++) {
                            c = a + b;
                            sucesion += ", " + c;
                            a = b;
                            b = c;
                        }
                    }

                    msgSinSalto(sucesion);
                    break;
            }

            // Unos simple salto de línea para finalizar esta sección
            msg();
            msg();
            msgSinSalto("¿Empezar nuevamente?: ");

            /*
                Se ha tomado en cuenta que el usuario ingresará valores lógicos
                *
                **No se simplificó para entender mejor las operaciones
             */
        } while (scanner.next().contentEquals("s"));

        // Salto de líneas para finalizar la aplicación
        msg();
    }

    /*
        Métodos para enviar mensajes de manera más cómoda.
        Modifícalos, tanto su nombre como lo que hay en su interior 
        para que se adecuen a tu parecer.
     */
    // Escribe una línea en blanco y da un salto de ésta misma.
    private static void msg() {
        System.out.println();
    }

    private static void msgSinSalto(String mensaje) {
        System.out.print(mensaje);
    }

    // Escribe el mensaje que hayas enviado y da un salto de línea;
    private static void msg(String mensaje) {
        System.out.println(mensaje);
    }
}