 

public class BuildYourOrder {

    public static Component getOrder()
    {
        //Composite order = new Composite( "Please Collect Your Customized Order :" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));*/
        Composite order = new Composite("Order\n\n");
        CustomBurger customBurger = new CustomBurger( "\n\nBuild Your Own Burger: " ) ;
        Burger bur = new Burger("Different Burger Options");
        String burger[] = {"Hormone & Antibiotic Free Beef","1/3lb.","On A Bun"};
        bur.settingDiffOptions(burger);
        
        
        Cheese c = new Cheese("Different Cheese option");
        String cheese[] = {"Smoked Gouda", "Greek Feta"};
        c.settingDiffOptions(cheese);
        c.applyDecorator(bur);
        
        
        Toppings t = new Toppings("Different Toppings options");
        String topping[] = {"Crushed Peanuts"};
        t.settingDiffOptions(topping);
        t.applyDecorator(c);
        
        
        PremiumToppings p = new PremiumToppings("Different Premium options");
        String pt[] = {"Sunny Side Up Egg*","Marinated Tomatoes"};
        p.settingDiffOptions(pt);
        p.applyDecorator(t);
        
        
    
        
        
        Sauces s = new Sauces("Different Premium sauces");
        String sauce[]={"Habanero Salsa"};
        s.settingDiffOptions(sauce);
        s.applyDecorator(p);
        
        
        PremiumCheese pc = new PremiumCheese("Different PremiumCheese option");
        String premiumCheese[] = {"Fresh Mozzarella"};
        pc.settingDiffOptions(premiumCheese);
        pc.applyDecorator(s);
        
        
        Bun b = new Bun("Different Bun");
        String bun[]={"Gluten-Free Bun"};
        b.settingDiffOptions(bun);
        b.applyDecorator(pc);
        
        Side si = new Side("Different side");
        String side[]={"Shoestring Fries"};
        si.settingDiffOptions(side);
        si.applyDecorator(b);
        
        
        
        //customBurger.setDecorator(s);
        customBurger.setDecorator(si);
        customBurger.addChild(bur); 
        customBurger.addChild(c); 
        customBurger.addChild(pc);
        customBurger.addChild(s);
        customBurger.addChild(t); 
        customBurger.addChild(p); 
        
        customBurger.addChild(b);
        customBurger.addChild(si);
       
        
       
        
        //2nd burger
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger: " ) ;
        Burger bur2 = new Burger("Second burger");
        String burger2[] = {"Organic Bison*","1/2lb.","On A Bun"};
        bur2.settingDiffOptions(burger2);
        
        Cheese c2 = new Cheese("Different Cheese option");
        String cheese2[] = {"Yellow American", "Spicy Jalapeno Jack"};
        c2.settingDiffOptions(cheese2);
        c2.applyDecorator(bur2);
        
        
        Toppings t2 = new Toppings("Different Toppings options");
        String topping2[] = {"Dill Pickel Chips", "Black Olives", "Spicy Pickles"};
        t2.settingDiffOptions(topping2);
        t2.applyDecorator(c2);
        
        
        PremiumToppings p2 = new PremiumToppings("Different Premium options");
        String pt2[] = {"Marinated Tomatoes"};
        p2.settingDiffOptions(pt2);
        p2.applyDecorator(t2);
        
        
        Sauces s2 = new Sauces("Different Premium sauces");
        String sauce2[]={"Mayonnaise","Thai Peanut Sauce"};
        s2.settingDiffOptions(sauce2);
        s2.applyDecorator(p2);
        
        
        PremiumCheese pc2 = new PremiumCheese("Different PremiumCheese option");
        String premiumCheese2[] = {"Danish Blue Cheese"};
        pc2.settingDiffOptions(premiumCheese2);
        pc2.applyDecorator(s2);
      
        
        
        
        Bun b2 = new Bun("Different Bun");
        String bun2[]={"Ciabatta (Vegan)"};
        b2.settingDiffOptions(bun2);
        b2.applyDecorator(pc2);
        
        Side si2 = new Side("Different side");
        String side2[]={"Shoestring Fries"};
        si2.settingDiffOptions(side2);
        si2.applyDecorator(b2);
        
        customBurger2.setDecorator(si2);
        customBurger2.addChild(bur2); 
        customBurger2.addChild(c2); 
        customBurger2.addChild(pc2);
        customBurger2.addChild(s2);
        customBurger2.addChild(t2); 
        customBurger2.addChild(p2); 
        
        customBurger2.addChild(b2);
        customBurger2.addChild(si2);
        order.addChild( customBurger2 );
        
        
        order.addChild( customBurger );
        
        
        return order ;
    }

}

