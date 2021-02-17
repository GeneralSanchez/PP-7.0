import java.util.Random;

public class Coin
{
    private final int HEADS = 0;
    private final int TAILS = 1;
    
    private int face;
   
    //----------------------------------------------
    //Sets up the coin by flipping it initially.
    //----------------------------------------------
    
    public Coin()
    {
        flip();
    }
    
    //---------------------------------------------------
    //Fli[s the coin by randomly choosing a face value.
    //---------------------------------------------------
    public void flip ()
    {
        face = (int) (Math.random() * 2);
    }
    
    public boolean isHeads ()
    {
        return (face == HEADS);
    }
    
    //------------------------------------------------------
    // Returns the current face of the coin as a String.
    //------------------------------------------------------
    
    public String toString()
    {
        String faceName;
        
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
            
        return faceName;
    }
}