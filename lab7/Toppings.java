 


/**
 * Write a description of class Toppings here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Toppings extends LeafDecorator
{
   private String description;
   private Cheese cTop;
   private String[] varities;
    
    public Toppings ( String d)
    {
        super(d,0.0);
    }
    
    public double getPrice()
    {
        double money = cTop.getPrice();

        return money += 0.0;
    }
    
    public void settingDiffOptions(String[] varity)
    {
        varities = varity;
    }

    public void applyDecorator(Cheese c)
    {
        cTop = c;
    }
    
    public void getDescription()
    {
        int i=0;
        for(String type:varities)
        {
            System.out.print( type);
            if(i < varities.length-1 )
            {
                System.out.print(" + ");
            }
            i++;
        }
        System.out.println("");
    }
    
    
}
