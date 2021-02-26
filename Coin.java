import java.util.Random;//to make it random

public class Coin
{
    private final int HEADS = 0;//this is final varible
    private final int TAILS = 1;//this is the final variable
    
    private int face;
   
    //----------------------------------------------
    //Sets up the coin by flipping it initially.
    //----------------------------------------------
    
    public Coin()
    {
        flip();//does this
    }
    
    //---------------------------------------------------
    //Fli[s the coin by randomly choosing a face value.
    //---------------------------------------------------
    public void flip ()
    {
        face = (int) (Math.random() * 2);//math that is done and returned
    }
    
    public boolean isHeads ()
    {
        return (face == HEADS);//return this 
    }
    
    //------------------------------------------------------
    // Returns the current face of the coin as a String.
    //------------------------------------------------------
    
    public String toString()
    {
        String faceName;//the String
        
        if (face == HEADS)//condition
            faceName = "Heads";//eturns this if if 
        else
            faceName = "Tails";//return this if else
            
        return faceName;//returns this
    }
}