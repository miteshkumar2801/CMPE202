 


import java.text.DecimalFormat;

public abstract class LeafDecorator extends Leaf implements PriceDecorator
{
    private String description ;
    private double price ;

    public LeafDecorator ( String d, double p )
    {
        super(d,p);
    }
    
    public void getDescription()
    {
        
    }

    public void addChild(Component c) {
      
    }

    public void removeChild(Component c) {
      
    }

    public Component getChild(int i) {
        return null;
    }
    
    public abstract double getPrice();
    
}
