/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

package starbucks ;

/**
 * Main App Controller Class
 */
public class AppController implements IApp {

    private IScreen mycards ;
    //Mitesh_0.1
    private IScreen mycardspay ;
    private IScreen mycardsmoreoptions ;
    private IScreen store ;
    private IScreen rewards ;
    private IScreen payments ;
    private IMenuCommand displayMyCards ;
    private IMenuCommand displayMyCardsPay ;
    private IMenuCommand displayPayments ;
    private IMenuCommand displayRewards ;
    private IMenuCommand doStore ;

    private IFrame frame ;

    public AppController() {
        mycards = new MyCards() ;
        //Mitesh_0.1
        mycardspay = new MyCardsPay();
        mycardsmoreoptions = new MyCardsMoreOptions();
        store = new Store() ;
        rewards = new Rewards() ;
        payments = new Payments() ;
        frame = new Frame( mycards ) ;


        //COR pattern for screenflow:

//        mycards.addSubComponent(mycardspay);
// mycards.addSubComponent(mycardsmoreoptions);

        // setup command pattern
        displayMyCards  = new MenuCommand() ;
        //Mitesh_0.1
        displayMyCardsPay = new MenuCommand();
        displayPayments = new MenuCommand() ;
        displayRewards  = new MenuCommand() ;
        doStore         = new MenuCommand() ;
        displayMyCards.setReceiver(
          new IMenuReceiver() {

              /** Command Action */
              public void doAction() {
                  //System.out.println("Mitesh::" + frame);
                  frame.setCurrentScreen( mycards ) ;
              }
        }
        ) ;

       displayMyCardsPay.setReceiver(
         new IMenuReceiver() {
             /** Command Action */
             public void doAction() {
                 frame.setCurrentScreen( mycardspay ) ;
             }
       }
       ) ;

        displayPayments.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( payments ) ;
              }
        }
        ) ;
        displayRewards.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( rewards ) ;
              }
        }
        ) ;
        doStore.setReceiver(
          new IMenuReceiver() {
              /** Command Action */
              public void doAction() {
                  frame.setCurrentScreen( store ) ;
              }
        }
        ) ;
        frame.setMenuItem ( "A", displayMyCards ) ;
        frame.setMenuItem ( "B", displayPayments ) ;
        frame.setMenuItem ( "C", displayRewards ) ;
        frame.setMenuItem ( "D", doStore ) ;
    }


    /**
      * Switch to Landscape Mode
      */
    public void landscape() {
        frame.landscape() ;
    }

    /**
     * Switch to Portait Mode
     */
    public void portrait() {
        frame.portrait() ;
    }

    /**
     * Send In Touch Events
     * @param x X Coord
     * @param y Y Coord
     */
    public void touch(int x, int y) {
        // setcurrent screen to Pay
        frame.touch(x, y) ;
    }

    /**
     * Display Current Screen
     */
    public void display() {
        frame.display() ;
    }

    /**
     * Execute Menu Bar Command
     * @param c Menu Bar Option (A, B, C, D or E)
     */
    public void execute( String c ) {
        frame.cmd( c ) ;
    }

    /**
     * Navigate to Previous Screen
     */
    public void prev() {
        frame.previousScreen() ;
    }

    /**
     * Navigate to Next Screen
     */
    public void next() {
        frame.nextScreen() ;
    }

    /**
     * Get Current Screen Name
     * @return Screen Name
     */
    public String screen() {
        return frame.screen() ;
    }

    /**
     * Get Current Screen Contents
     * @return Current Screen Contents
     */
    public String screenContents() {
        return frame.contents() ;
    }

}
