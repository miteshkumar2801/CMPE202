 

import java.util.ArrayList;

public class Composite implements Component {

    private ArrayList<Component> bgcomponents = new ArrayList<Component>()  ;
    private String description ;
    
    public Composite ( String d )
    {
        description = d ;
    }

    public void getDescription() {
        System.out.println( description );
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
 
