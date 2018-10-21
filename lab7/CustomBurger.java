 

import java.util.ArrayList;

public class CustomBurger extends Composite
{
    private LeafDecorator bd;
    private String description;
    private ArrayList<Component> bgcomponents = new ArrayList<Component>()  ;
    
    public CustomBurger ( String d )
    {
        super(d) ;
        description = d;
    }

    public void setDecorator(LeafDecorator bud)
    {
        bd = bud;
    }
    
    
    public void getDescription() {
        System.out.print( description+" " );
        double total = bd.getPrice();
        System.out.printf("%.2f\n",total);
        for (Component obj  : bgcomponents)
        {
            obj.getDescription();
        }
        
    }

    public void addChild(Component c) {
        bgcomponents.add( c ) ;
    }
     
    public void removeChild(Component c) {
        bgcomponents.remove(c) ;
    }
     
    public Component getChild(int i) {
        return bgcomponents.get( i ) ;
    }
}
