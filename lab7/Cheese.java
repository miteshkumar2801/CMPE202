 

import java.lang.String;

public class Cheese extends LeafDecorator
{
    private String description;
    private Burger bg;
    private String[] varities;
    
    public Cheese ( String d )
    {
        super(d,0.0);
    }
    
    public void settingDiffOptions(String[] varity)
    {
        varities = varity;
    }
    
    public double getPrice()
    {
        double money = bg.getPrice();
        
        if(varities.length > 1)
            money += 1.00*(varities.length -1);
        else
            money+=0.0;
            
       return money;
    }
    
    

    public void applyDecorator(Burger b)
    {
        bg = b;
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
