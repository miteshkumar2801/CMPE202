 
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a description of class Bun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
   
public class Bun extends LeafDecorator
{
    private String description;
    private String[] varities;
    private PremiumCheese pctop;
    
      public Bun(String d){

              super(d,0.0);
    }
    public void settingDiffOptions(String[] varity)
    {
        varities = varity;
    }
     public double getPrice()
    {
        double money = pctop.getPrice();
        for(String type:varities)
        {
            if(type.equals("Gluten-Free Bun") || type.equals("Hawaiian Bun"))
            {
                money += 1.00;
            }
            else if(type.equals("Pretzel Bun"))
            {
                    money += 0.50;
            }
        }
        return money;
    }
    
    
    public void applyDecorator(PremiumCheese pc)
    {
        pctop = pc;
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
