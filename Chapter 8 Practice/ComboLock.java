public class ComboLock
{
    private int secret1;
    private int secret2;
    private int secret3;
    private int current = 0;
    boolean match1;
    boolean match2;
    boolean match3;
    
    public ComboLock( int secret1, int secret2, int secret3 ) 
    {
        secret1 = secret1;
        secret2 = secret2;
        secret3 = secret3;
    }
    public void reset() 
    {
        current = 0;
    }
    public void turnLeft( int ticks ) 
    {
        if ( ticks + current < 39)
        {
            current += ticks;
        }
        else
        {
            current = (ticks + current) - 39;
        }
        if ( current == secret2 )
        {
            match2 = true;
        }
    }
    public void turnRight( int ticks ) 
    {
        if ( current - ticks > 0)
        {
            current -= ticks;
        }
        else 
        {
            ticks -= current;
            current = 40 - ticks;
        }
        if ( current == secret1 )
        {
            match1 = true;
        }
        else if (current == secret3 && match1 == true && match2 == true)
        {
            match3= true;
        }
            
    }
    public boolean open() 
    {
        if( match3 == true)
        {
            return true;
        }
        return false;
   }
}