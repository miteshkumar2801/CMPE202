/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */




/** Key Pad Subject Interface */
public interface IKeyPadSubject
{
    void attach( IKeyPadObserver obj ) ;

    void removeObserver( IKeyPadObserver obj ) ;

    void notifyObservers(int numKeys, String key) ;
}
