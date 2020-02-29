import java.util.Scanner;
public class Turnos{

        public static void main(String [] args){
            Scanner teclado = new Scanner (System.in);
            
            System.out.println("Ingrese la cantidad de empleados");
            
            int cantEmp = teclado.nextInt();
            int [] empleados = new int [cantEmp];
            
            System.out.println("Se calcula el jornal diario");
            
            for (int i=0; i<cantEmp; i++){
                int horasT, turno, diaT;
                
                System.out.println("Ingrese el turno para el empleado: "+(i+1));
                turno = teclado.nextInt();
                
                System.out.println("Ingrese el horas trabajadas para el empleado: "+(i+1));
                horasT = teclado.nextInt();
                
                System.out.println("Ingrese el día trabajado para el empleado: "+(i+1));
                diaT = teclado.nextInt();
                
                empleados[i]= calculaJornal(horasT, turno, diaT);
                
            }
            
            System.out.println("se muestra el pago para cada empleado");
            
            for(int i=0; i<cantEmp; i++){
            
                System.out.print("Pago para el empleado " + (i+1));
                System.out.println(" "+ empleados[i]);
                
            }
           
        
        }
        
        public static int calculaJornal(int horasT, int turno, int diaT){
            int valorH =0; 
            
            if((turno ==1) && (diaT != 7)){
                valorH= horasT*500;
            }else if((turno==1) && (diaT==7)){
                valorH = horasT*700;
            }else if ((turno==2)&&(diaT != 7)){
                valorH = horasT*800;
            }else if((turno == 2)&&(diaT == 7 )){
                valorH = horasT * 1100;
            }
            
            return valorH;
            
            
        }
}