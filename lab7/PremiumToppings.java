 


public class PremiumToppings extends LeafDecorator
{
   private String description;
   private Toppings top;
   private String[] varities;   
    
    public PremiumToppings ( String d)
    {
        super(d,0.0);
    }
    
    public double getPrice()
    {
        double money = top.getPrice();
        
        for(String type:varities)
        {
            //if(varities.length > 0)
            //{
                //return (
                //money += (varities.length * 1.00);
                if(type.equals("Marinated Tomatoes"))
                {
                    money += 3.00;
                } else
                {
                     money +=1;
                }
            //}
            //else
            //{
              //  return money += 0.0;
            //}
        }
    return money;
}
    
    public void settingDiffOptions(String varity[])
    {
        varities = varity;
    }

    public void applyDecorator(Toppings t)
    {
         top= t;
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
        System.out.println(" ");
    }
}
