
public class Shirt extends Clothing{
    private char fit = 'U' ;// u is unset, other codes 's','m', or 'l'
    
    public Shirt (int itemID, String description, char colorCode,
                  double price, char fit){
                    
     super(itemID, description, colorCode,price); 
     this.fit = fit;              
                   
    }
    
    public char getFit(){
        return fit;
    
    }
    
    public void setFit (char fit){
        this.fit = fit;
    }
    
    
    //this method overrides display in the clothing supercalss
    
    public void display (){
        System.out.println("Shirt iD: " + getItemID());
        System.out.println("Shirt description: "+ description );
        System.out.println("Shirt price: "+ getPrice());
        System.out.println("Color code: " + getColorCode());
        System.out.println("Fit: "+ getFit());
        
    }
    // this method overrides the methods in the superclass
    
    public void setColorCode(char colorCode){
        
        if (fit!= 'u'){
            
            this.colorCode = colorCode;
            
        }
        
        
    }
   
    public char getColorCode(){
        return colorCode;
    }
    
}