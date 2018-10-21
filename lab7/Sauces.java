 


public class Sauces extends LeafDecorator
{
   private String description;
   private PremiumToppings pttop;
   private String[] varities;
    
    public Sauces ( String d)
    {
        super(d,0.0);
    }
    
    public double getPrice()
    {
        double money = pttop.getPrice();
        if(varities.length > 1)
        {
            return money + (varities.length - 1) * 0.50;
        }
        else
        {
            return money + 0.0;
        }
    }
    
    public void settingDiffOptions(String[] varity)
    {
        varities = varity;
    }

    public void applyDecorator(PremiumToppings p)
    {
        pttop = p;
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
