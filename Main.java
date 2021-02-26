class Main
 {
  public static void main(String[] args) 
  {
    System.out.println ("Andy Sanchez, PP 7.0");

    MonetaryCoin Dollar = new MonetaryCoin (1);//this is the declaration
    System.out.println ("You flipped: "+Dollar.toString());//calls the toString
    System.out.println ("Coin Value: $"+Dollar.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin Five = new MonetaryCoin (5);//this is the declaration
    System.out.println ("You flipped: "+Five.toString());//calls the toString
    System.out.println ("Coin Value: $"+Five.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin Ten = new MonetaryCoin (10);//this is the declaration
    System.out.println ("You flipped: "+Ten.toString());//calls the toString
    System.out.println ("Coin Value: $"+Ten.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin Hundread = new MonetaryCoin (100);//this is the declaration
    System.out.println ("You flipped: "+Hundread.toString());//calls the toString
    System.out.println ("Coin Value: $"+Hundread.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin fivecent = new MonetaryCoin (.05);//this is the declaration
    System.out.println ("You flipped: "+fivecent.toString());//calls the toString
    System.out.println ("Coin Value: $"+fivecent.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin onecent = new MonetaryCoin (.01);//this is the declaration
    System.out.println ("You flipped: "+onecent.toString());//calls the toString
    System.out.println ("Coin Value: $"+onecent.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin tencent = new MonetaryCoin (.10);//this is the declaration
    System.out.println ("You flipped: "+tencent.toString());//calls the toString
    System.out.println ("Coin Value: $"+tencent.getValue());//calls to get value
    System.out.println("-----------------");//for space

    MonetaryCoin quacent = new MonetaryCoin (.25);//this is the declaration
    System.out.println ("You flipped: "+quacent.toString());//calls the toString
    System.out.println ("Coin Value: $"+quacent.getValue());//calls to get value
    System.out.println("-----------------");//for space

  }
}