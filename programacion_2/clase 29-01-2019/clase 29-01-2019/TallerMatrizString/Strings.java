package TallerMatrizString;


/**
 *
 * 
 * @author Hans Rivera, Jorge L. Ordoñez.
 * 
 */

public class Strings{
    
    public int numeroVocales (String cadena){
        
        int contador =0;
        
        char [] cadena2= cadena.toCharArray();
        
        for (int i=0; i<cadena2.length; i++){
        
            if((cadena2[i] =='a')||(cadena2[i] =='e')||(cadena2[i] =='i')||(cadena2[i] =='o')||(cadena2[i] =='u')){
                contador++;
            }
        }

        return contador;
        
    }
    
    public int numeroVocaleSinRepetir(String cadena){
        
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        int sum=0;
        
        char [] cadena2= cadena.toCharArray();
        
        for (int l=0; l<cadena2.length; l++){
       
            if(cadena2[l] =='a'){
                a++;
            }else if((cadena2[l] =='e')){
                e++;
            }else if (cadena2[l] =='i'){
                i++;
            }else if(cadena2[l] =='o'){
                o++;
            }else if (cadena2[l] =='u'){
                u++;
            }
        }
        
        if (a>1){
                a=1;
        }else if(e>1){
            e=1;
        }else if(i>1){
            i=1;
        }else if(o>1){
            o=1;
        }else if(u>1){
            u=1;
        }
        
        sum = a+e+i+o+u;
        
        return sum;
    }
    
    public void numeroVocalesMayusMinus(String cadena){
        
        int contadorMayus = 0;
        int contadorMinus = 0;
        
        char [] cadena2= cadena.toCharArray();
        
        for (int i=0; i<cadena2.length; i++){
            if((cadena2[i] =='a')||(cadena2[i] =='e')||(cadena2[i] =='i')||(cadena2[i] =='o')||(cadena2[i] =='u')){
                contadorMinus++;
            }else if((cadena2[i] =='A')||(cadena2[i] =='E')||(cadena2[i] =='I')||(cadena2[i] =='O')||(cadena2[i] =='U')){
                contadorMayus++;
            }
        }
        
        System.out.println("La cantidad de vocales mayúsculas es: " + contadorMayus);
        System.out.println("La cantidad de vocales minusculas es: " + contadorMinus);    
    }
    
    public static void main (String args[]){
        
        Strings miString = new Strings();
        
        System.out.println("Cantidad de vocales: " + miString.numeroVocales("ipanema"));
        System.out.println("Cantidad de vocales sin repetir: "+miString.numeroVocaleSinRepetir("ipanema"));
        miString.numeroVocalesMayusMinus("murciElagO");
    }

}
  