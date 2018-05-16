/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_factura;

import java.util.Scanner;

/**
 *
 * @author Edison
 */
public class Deber_factura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String unidades[] = {"", "uno ", "dos ", "tres ", "cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve "};
        String decenas[] = {"", "diez ", "veinte ", "treinta ", "cuarenta ", "cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa "};
        String especiales[] = {"once ", "doce ", "trece ", "catorce ", "quince ", "dieciseis ", "diecisiete ", "dieciocho ", "diecinueve"};
        String centenas[] = {"", "ciento ", "doscientos ", "trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ", "setecientos ", "ochocientos ", "novecientos "};
        int n;
        do {
            Scanner s = new Scanner(System.in);
System.out.println("-------------------------------------");
            System.out.print("Usted tiene que pagar: $");
            int precio = s.nextInt();
            System.out.print("Voy apagar con: $");
            int pago = s.nextInt();
            n=pago-precio;
            
            System.out.print("Su vuelto es de: $" + n + "--> ");
            
            //n=s.nextInt();
            if (n <= 9) {
                System.out.println(unidades[n]);
            }
            if (n <= 19) {
                System.out.println(especiales[n - 11]);
            }
            if (n <= 90) {
                int aux = n;
                aux = aux % 10;
                if (aux == 0) {
                    System.out.println(decenas[n / 10]);
                } else {
                    System.out.println(decenas[n / 10] + "y " + unidades[n % 10]);
                }
            } else if (n <= 900) {
                int cent = n % 100;
                int dec = (n % 100) / 10;
                int uni = n % 10;

                if (cent == 0) {
                    System.out.println(centenas[n / 100]);
                } else if (dec == 0) {
                    System.out.println(centenas[n / 100] + unidades[uni]);
                } else if (uni == 0) {
                    System.out.println(centenas[n / 100] + " " + decenas[dec]);
                } else if (cent >= 11 && cent <= 19) {

                    System.out.println(centenas[n / 100] + "" + especiales[cent - 11]);
                } else if (dec != 0) {
                    System.out.println(centenas[n / 100] + "" + decenas[dec] + "y " + unidades[cent % 10]);
                }
            } else if (n <= 19999) {
                int mil = n / 1000;
                int cent = (n % 1000) / 100;
                int dec = n % 100;
                int uni = n % 10;
                int dec1 = (n % 100) / 10;
                 if (mil==1) {
                    if (n % 1000 == 0) {
                        System.out.println("mil ");
                    } else if (cent <= 9) {
                        if (dec == 0) {
                            System.out.println( "mil " + centenas[cent]);
                        } else if (dec >= 11 && dec <= 19) {
                            System.out.println( "mil " + especiales[dec - 11]);
                        }else if (dec1 == 0 && uni != 0) {
                            System.out.println( "mil " + centenas[cent] + unidades[uni]);
                        } else if (dec1 <= 9 && uni == 0) {
                            System.out.println("mil " + centenas[cent] + decenas[dec1]);
                        } else if (dec1 <= 9 && uni <= 9) {
                            System.out.println("mil "+ centenas[cent] + decenas[dec1] + "y " + unidades[uni]);
                        } 
                    }else if (cent == 0) {
                        if (dec1 == 0) {
                            System.out.println( "mil " + unidades[uni]);
                        } else if (dec >= 11 && dec <= 19) {
                            System.out.println("mil " + especiales[dec - 11]);
                        
                        } else if (dec1 <= 9 && uni == 0) {
                            System.out.println( "mil " + decenas[dec1]);
                        } else if (dec1 <= 9 && uni <= 9) {
                            System.out.println("mil "+ decenas[dec1] + "y " + unidades[uni]);
                        }
                    }
                 }
                if (mil>=2&&mil <= 9) {
                    if (n % 1000 == 0) {
                        System.out.println(unidades[mil] + "mil ");
                    } else if (cent <= 9) {
                        if (dec == 0) {
                            System.out.println(unidades[mil] + "mil " + centenas[cent]);
                        } else if (dec >= 11 && dec <= 19) {
                            System.out.println(unidades[mil] + "mil " + especiales[dec - 11]);
                        }else if (dec1 == 0 && uni != 0) {
                            System.out.println(unidades[mil] + "mil " + centenas[cent] + unidades[uni]);
                        } else if (dec1 <= 9 && uni == 0) {
                            System.out.println(unidades[mil] + "mil " + centenas[cent] + decenas[dec1]);
                        } else if (dec1 <= 9 && uni <= 9) {
                            System.out.println(unidades[mil] + "mil " + centenas[cent]+ decenas[dec1] + "y " + unidades[uni]);
                        } 
                    } else if (cent == 0) {
                        if (dec1 == 0) {
                            System.out.println(unidades[mil] + "mil " + unidades[uni]);
                        } else if (dec >= 11 && dec <= 19) {
                            System.out.println(unidades[mil] + "mil " + especiales[dec - 11]);
                        
                        } else if (dec1 <= 9 && uni == 0) {
                            System.out.println(unidades[mil] + "mil " + decenas[dec1]);
                        } else if (dec1 <= 9 && uni <= 9) {
                            System.out.println(unidades[mil] + "mil " + decenas[dec1] + "y " + unidades[uni]);
                        }
                    } 
                } else if (mil>=11&&mil <= 19) {
                    if (n % 1000 == 0) {
                        System.out.print(especiales[mil - 11] + "mil ");
                    } else if (cent <= 9) {
                        if (dec == 0) {
                            System.out.println(especiales[mil - 11] + "mil " + centenas[cent]);
                        } else if (dec >= 11 && dec <= 19) {
                            System.out.println(especiales[mil - 11] + "mil " + especiales[dec - 11]);
                        } else if (dec1 == 0 && uni <= 9) {
                            System.out.println(especiales[mil - 11] + "mil " + centenas[cent] + unidades[uni]);
                        } else if (dec1 <= 9 && uni == 0) {
                            System.out.println(especiales[mil - 11] + "mil " + centenas[cent] + decenas[dec1]);
                        } else if (dec1 <= 9 && uni <= 9) {
                            System.out.println(especiales[mil - 11] + "mil "+ centenas[cent] + decenas[dec1] + "y " + unidades[uni]);
                        }
                    }else if (cent == 0) {
                        if (dec1 == 0&& uni<=9) {
                            System.out.println(especiales[mil - 11] + "mil " + unidades[uni]);
                        }else if (dec >= 11 && dec <= 19) {
                            System.out.println(especiales[mil - 11] + "mil " + especiales[dec - 11]);
                        } else if (dec1 <= 9 && uni == 0) {
                            System.out.println(especiales[mil - 11] + "mil " + decenas[dec1]);
                        } else if (dec1 <= 9 && uni <= 9) {
                            System.out.println(especiales[mil - 11] + "mil " + decenas[dec1] + "y " + unidades[uni]);
                        } 
                    } 
                }
            } else if (n > 19999) {
                System.err.println("Numero fuera de rango");
            }
        } while (n >= 0);
    }
}

