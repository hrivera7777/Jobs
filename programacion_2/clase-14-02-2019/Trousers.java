
public class Trousers extends Clothing{
    private char fit = 'U' ;// u is unset, other codes 's','m', or 'l'
    private char gender = 'u'; // u is unset, other codes 'M' male,'f',famele
    public Trousers (int itemID, String description, char colorCode,
                  double price, char fit, char gender){
                    
     super(itemID, description, colorCode,price); 
     this.fit = fit; 
     this.gender = gender;
                   
    }
    
    public  void setColorCode(char colorCode){
       this.colorCode = colorCode;
    }
    
    public char getColorCode(){
        return colorCode;
    }
    
    
    public char  getFit(){
        return fit;
    
    }
    public char getGender(){
        return gender;
    }
    
    
}
   