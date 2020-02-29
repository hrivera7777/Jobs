
public abstract class Clothing{
    
    //fields 
    
    
    private int itemID =0; // default id for all
    protected String description = "-descrtiption required-";
    public char colorCode = 'U'; // u is Unset
    private double price = 0.0; 
    
    // constructor 
    
    public Clothing (int itemID, String description, char colorCode,
    double price){
        this.itemID= itemID;
        this.description = description;
        this.colorCode = colorCode;
        this.price = price;
        
    
    }
    
    public abstract char getColorCode();
    
    public abstract void setColorCode(char colorCode);
    
    public int getItemID(){
        return itemID;
    }
    
    public void setItemID (int itemID){
        this.itemID = itemID;
    }
    
    public void setDescription (String description){
        this.description = description;
    }
    
    
    
    public void setPrice(double price){
    
        this.price = price;
            
    }
    
    public double getPrice (){
        return price;
    }
    
    public void display (){
        System.out.println("Shirt iD: " + getItemID());
        System.out.println("Shirt description: "+ description );
        System.out.println("Shirt price: "+ getPrice());
        //System.out.println("Color code: " + getColorCode());
        
    }
    
    
}