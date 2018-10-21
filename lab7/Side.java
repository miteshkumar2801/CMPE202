 


/**
 * Write a description of class Side here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Side extends LeafDecorator
{   
    String description;
    private String[] varieties;
    private Bun btop;
    public Side(String d){//BurgerComponent burger,String[] options) {
       super(d,0.0);//.burger = burger;
       //setOptions(options);
    }
     public void settingDiffOptions(String[] varity)
    {
        varieties = varity;
    }

    public double getPrice() {
         double costForSide = btop.getPrice();
         
         if(varieties.length>0)
         {
             costForSide +=  varieties.length*3.00;
            }
         
         /*for(String type: varieties)
         {
             if(type.equals("No Side"))
             {
                 costForSide += 0.00;
                
                }
              else if (!type.equals("No Side"))
              {
                  costForSide += (varieties.length<=0)?0.00:(varieties.length)*3.00;
                }
            }*/
        

        return costForSide; 
    }
    public void applyDecorator(Bun b)
    {
        btop = b;
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
