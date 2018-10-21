 


/**
 * Write a description of class PremiumCheese here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PremiumCheese extends LeafDecorator
{
    private String[] varieties; 
    private String description;
    private Sauces stop;
    public PremiumCheese(String d){//(BurgerComponent burger,String[] options) {
       super(d,0.0);//.burger = burger;
      // setOptions(options);
    }
    
    public void settingDiffOptions(String[] varity)
    {
        varieties=varity;
    }


    public double getPrice() {

        double costForPCheese =stop.getPrice();
        costForPCheese+=(varieties.length)*1.50;

        return costForPCheese;// + burger.cost();
    }
    
      public void applyDecorator(Sauces s)
    {
        stop = s;
    }
    
    public void getDescription()
    {
        int i=0;
        for(String type:varieties)
        {
            System.out.print( type);
            if(i < varieties.length-1 )
            {
                System.out.print(" + ");
            }
            i++;
        }
        System.out.println("");
    }
    
}
