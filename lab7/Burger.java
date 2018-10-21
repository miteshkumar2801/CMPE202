 


/**
 * Write a description of class Burger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Burger extends LeafDecorator
{
    private String description;
    private String[] varities;
    
    public Burger ( String d)
    {
       super(d,0.0);
    }
    
    public void settingDiffOptions(String[] varity)
    {
        varities = varity;
    }
    
    public double getPrice()
    {
        double cost = 0.0;
        
        for(String opt:varities){
            if(opt.equals("1/3lb."))
            {
                cost += 9.00;
            }
            else if(opt.equals("1/2lb."))
            {
                cost += 12;
            }
            else if(opt.equals("1lb."))
            {
                cost += 18.00;
            } 
            else if (opt.equals("In a Bowl"))
            {
                cost += 1.00;
            } 
            else if (opt.equals("Organic Bison*") || opt.equals("Ahi Tuna*")) 
            {
                cost += 4.00;
            }
            
        
        }
        
        return cost;
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
