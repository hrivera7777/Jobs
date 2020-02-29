
public class Socks extends Clothing{
    
    public Socks (int itemID, String description, char colorCode,
                  double price){
                    
     super(itemID, description, colorCode,price); 
                 
                   
    }
    
     public  void setColorCode(char colorCode){
       this.colorCode = colorCode;
    }
    
    public char getColorCode(){
        return colorCode;
    }
    
    
    
}