import java.*;
import java.lang.*;
import java.util.*;

public class Pri{

public static void main(String[] doku){
int n1 = 1;
int n2 = 2;
int cprimo = 1;
do{

boolean resp = false;
int temp = n1 - 1 ;
int cont = 0;

for(int j=2; j<n1;j++){
if( n1 % j == 0)	
cont++;
}
if(n1 != 1){
if(cont == 0){
System.out.print(n1+"!");
cprimo++;
n2 = n2+2;
}
}else{
n2 = n2+2;
}	
n1++;

}while(100 != cprimo);

}

}
