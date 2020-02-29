
public class EjemploString{
    
    public static void main (String args[]){
    
        String great = " HOW ".trim();
        String lc = great + "DY".toLowerCase();
        
        System.out.println(lc);
        System.out.println(great);
        
         String great1 = " HOW ".trim();
        String lc1 = (great + "DY").toLowerCase();
        
        System.out.println(lc1);
        System.out.println(great1);
        
        String s1 = "Hola Mundo";
        String s2 = s1.substring(6);
        
        boolean finMundo = "Hola Mundo".endsWith("Mundo");
        
        System.out.println(s2);
        System.out.println(finMundo);
        
        String x = "avion";
        System.out.println(x.charAt(2));
        
        String x1 = "holamundo";
        
        System.out.println(x1.substring(0, 3));
        
        System.out.println("Windows".compareTo("Waterloo"));
        System.out.println("Mac".compareTo("Mac"));
        System.out.println("Nadie".compareTo("nadie"));
        
        // 29-01-2019
        
        
       String nombre= "Esperanza";
       System.out.println(nombre.equalsIgnoreCase("esperanza"));
       
       String c = "oxoxox";
       
       System.out.println(c.replace('o','0'));
       
       String t= "hola";
       char[] arrayDeChars = t.toCharArray();
       System.out.println(arrayDeChars[2]);
       
       
       String y = "hola";
       
       System.out.println(y.toUpperCase());
        
       
       String pat = "Java, lenguaje de alto nivel";
       
       int k;
       k= pat.indexOf((int) 'v');
       System.out.println(k);
       
       
       String cadenaLast = "----x----";
       int e;
       e = cadenaLast.lastIndexOf((int)'x');
       if(e!=-1){
           System.out.println("Subcadena a partir de posición " + e + ": " + cadenaLast.substring(e));
        }
        
       String encx= "abc";
       String ency = encx.concat("def").toUpperCase().replace('C', 'x');
       System.out.println("y= " + ency);
        
       
    }
    
    
}