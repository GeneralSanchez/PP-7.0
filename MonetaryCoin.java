public class MonetaryCoin extends Coin
{
  private Double value;

//This is the constructor that is going to be used
  public MonetaryCoin (double value)
  {
    this.value = value;
  }
  //this is for getting the value
  public double getValue()
  {
    return this.value;
  }
  
}