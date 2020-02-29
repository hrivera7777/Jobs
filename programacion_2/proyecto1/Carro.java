import javax.swing.*;
class Carro {
    
   String placa;
   String color;
   String marca;
   int precio;
   
   Carro (String unaPlaca, String unColor, String unaMarca, int elPrecio){
       
       placa= unaPlaca;
       color=unColor;
       marca= unaMarca;
       precio=elPrecio;
       
       
    }
    
    void mostrarDatos(){
        
        System.out.println("placa: " + placa + "\n" + "Color: " + color + "\n" + "Marca: " + marca +"\n"+ "Este es el precio" + precio);
        
    }
    
    void camiarPlaca (String nuevaPlaca){
        
        placa=nuevaPlaca;
        
    }
    
    void calcularTipoCosto(){
        
        if (precio< 15000){
            System.out.println("Tipo: Barato");
            
        } else if(precio<3000 && precio>15000){
            System.out.println("Tipo: Normal");
            
            
        
        }else if(precio>3000){
            
            System.out.println("Tipo: Muy caro");
        };
    }
       
    String calcularTipoCosto2(){
        if(precio < 150000){
            return "Barato";
        }else if (precio > 150000 && precio<30000){
        
            return "Normal";
        }else if (precio >30000){
            return "Barato";
        }
        
            
        else return "Sin Tipo";
    }
        
        
    public static void main (String args[]){
       
        Carro batimovil = new Carro("ibq 123", "Negro", "Chevrolet", 20000 );
        
        batimovil.mostrarDatos();
        
        Carro generallee =new Carro("jhe 225", "Orage", "Dodge" , 500);
        
        generallee.mostrarDatos();
        
        batimovil.calcularTipoCosto();
        generallee.calcularTipoCosto();
        
        
    }


}


