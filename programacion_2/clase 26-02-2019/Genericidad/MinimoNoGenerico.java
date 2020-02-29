
public abstract class MinimoNoGenerico implements Comparable {

    public static void main (String args[]){
        int ea = 1, eb =5;
        System.out.println("(int): "+ minimo (ea, eb));
        long la = 1000L, lb = 4000L;
        System.out.println("(long): "+ minimo (la, lb));
        char ca = 'a', cb = 'b';
        System.out.println("(Char): "+ minimo (ca, cb));
        double da = 432.654, db = 789.10;
        System.out.println("(double): "+ minimo (da, db));

        System.out.println("(double2): "+ minimoGenerico(da, db));

    }
    
    public static <P> P minimoGenerico(P a, P b){
        String result;
        String c= a.toString();
        String d= b.toString();

        if (c.compareTo(d) < 0){

            return a;

        }else {
            return b;
        }

        /*if (a.equals(b)){
        return a;

        }else {
        return b;
        }*/

        
    }
    static int minimo (int a, int b){
        if (a<=b){
            return a;

        }else {
            return b;
        }

    }

    static long minimo (long a, long b){
        if (a<=b){
            return a;

        }else {
            return b;
        }

    }

    static char minimo (char a, char b){
        if (a<=b){
            return a;

        }else {
            return b;
        }

    }

    static double  minimo (double  a, double b){
        if (a<=b){
            return a;

        }else {
            return b;
        }

    }

}
