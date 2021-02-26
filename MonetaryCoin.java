public class MonetaryCoin extends Coin
{
  private Double value;//makes it double to get quarters

//This is the constructor that is going to be used
  public MonetaryCoin (double value)
  {
    this.value = value;//the setter
  }
  //this is for getting the value
  public double getValue()
  {
    return value;//returns this
  }
  
}