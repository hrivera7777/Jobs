
public class PruebaBarcos{
    public static void main(String args[]){
        Barco [] bs = new Barco[3];
        BarcoDeVapor bv = new BarcoDeVapor();
        Velero vel = new Velero();
        Carguero car = new Carguero();
        bs[0] = bv;
        bs[1] = vel;
        bs[2] = car;
        
        for(int i=0; i<3; i++){
            bs[i].alarma();
        }
        Barco b1 = new Barco();
        b1 = car;
        b1.alarma();
        
    }
}
