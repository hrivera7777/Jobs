
/**
 * Write a description of class PruebaStringBuilder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaStringBuilder
{

    public static void main (String args []){
    
        StringBuilder sb = new StringBuilder("hola");
        sb.append("mundo");
        System.out.println(sb);
        
        
        StringBuilder x = new StringBuilder("avión");
        System.out.println(x.charAt(2));
        
        
        x.setCharAt(1, 'V');
        System.out.println(x); // aVión
        
        
        StringBuilder y = new StringBuilder("0123456789");
        System.out.println(y.delete(4,6));
        // Devolvería 01236789
        
        
        
        StringBuilder sb2 = new StringBuilder("01234");
        sb2.insert(3, "-");
        System.out.println(sb2);
        //Devolvería 012-34
        
        
        StringBuilder sb3 = new StringBuilder ("01234");
        sb3.reverse();
        System.out.println(sb3);
        // devolvería 43210
        
        
        StringBuilder sb4 = new StringBuilder ("test");
        String s = sb4.toString();
        System.out.println(s);
        
    }
    
}