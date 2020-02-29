
public class MetodoGenerico
{
   public static <T> String aCadena (T a, T b){
       String q;
       q= a.toString();
       q = q+ b.toString();
       return q;
    }
}
