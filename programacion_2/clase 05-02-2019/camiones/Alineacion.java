
public class Alineacion{
    private Portero elPortero;
    private Ofensivo elOfensivo;
    private Defensivo losDefensivos[];
    private SuplenteCampo losSuplentesCampo[];
    
    public Alineacion(String nombrePortero, String nombreOfensivo, 
                      String[] nombresDefensivos, int numero_suplentes_campo,
                      String [] nombresSuplentesCampo){
      elPortero = new Portero(nombrePortero);
      elOfensivo = new Ofensivo (nombreOfensivo);
      losDefensivos = new Defensivo[9];
      for (int i=0; i<9; i++){
          losDefensivos[i]= new Defensivo (nombresDefensivos[i]);
          
        }
      losSuplentesCampo = new SuplenteCampo[numero_suplentes_campo];
      for (int i=0; i<numero_suplentes_campo; i++){
        
          losSuplentesCampo[i]= new SuplenteCampo(nombresSuplentesCampo[i]);
        }
      
                        
    }
    public void mostrarAlineacion(){
        System.out.print("BAJO LOS PALOS... ");
        System.out.println(elPortero.obtenerNombre());
        System.out.println();
        System.out.print("EN PUNTA... ");
        System.out.println(elOfensivo.obtenerNombre());
        System.out.println();
        System.out.print("EN EL RESTO DEL TERRENO: ");
        for (int i=0; i<losDefensivos.length; i++){
           System.out.print(losDefensivos[i].obtenerNombre()+" "); 
        
        }
        System.out.println();
        System.out.print("EN LA BANCA: ");
        for (int i=0; i<losSuplentesCampo.length; i++){
           System.out.print(losSuplentesCampo[i].obtenerNombre() + " "); 
        
        }

    }
    

}
    