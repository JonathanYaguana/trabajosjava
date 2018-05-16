
package seriefibonacci;

/**
 *
 * @author Franklin
 */
public class Seriefibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1=0,n2=1,t,l=50;
        System.out.println(n1);
        System.out.println(n2);
        while(n1+n2 <=l);
        t=n1;
        n1=n2;
        n2=t+n1;
        System.out.println(n2);
    }
    }
