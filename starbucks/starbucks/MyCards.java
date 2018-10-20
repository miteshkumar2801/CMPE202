/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

/** My Cards Screen */
public class MyCards extends Screen
{


    // Implementing ScreenFlow through chain of responsibilities and component similar as pinscreen in AppAuth. Change has to be made in AppController
    public MyCards()
    {
    //    mycardspay = new MyCardsPay();
    //    mycardsoptions = new MyCardsOptions();

    }
    // Mitesh_To_DO:
    //Implement display and touch methods
     public String display() {
         String value = "$0.00" ;
         return value ;
     }

    public void touch(int x, int y) {
        //System.out.print("Mitesh :: Touch :: Inmycards\n" + chain);
        if (x ==3 && y == 3) {



        } else if (x == 2 && y == 4) {

        }
    }

   //MITESH public void touch(int x, int y) {
   //MITESH      //System.out.print("Mitesh :: Touch :: Inmycards\n");
   //MITESH      if (x ==3 && y == 3) {
   //MITESH        //  System.out.println("Has to go to myCardsPay:: Mitesh ::" );
   //MITESH         // frame = new Frame(mycardspay) ;
   //MITESH         // frame.setCurrentScreen(mycardspay);
   //MITESH          frame.display() ;
   //MITESH      } else if (x == 2 && y == 4) {
   //MITESH          frame = new Frame(mycardsoptions) ;
   //MITESH          frame.setCurrentScreen(mycardsoptions);
   //MITESH          frame.display() ;
   //MITESH      }
   //MITESH  }

}
