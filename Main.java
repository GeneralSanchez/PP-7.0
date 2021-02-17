class Main
 {
  public static void main(String[] args) 
  {
    MonetaryCoin Dollar = new MonetaryCoin (1);
    System.out.println (Dollar.toString());
    System.out.println (Dollar.getValue());
    System.out.println("-----------------");

    MonetaryCoin Five = new MonetaryCoin (5);
    System.out.println (Five.toString());
    System.out.println (Five.getValue());
    System.out.println("-----------------");

    MonetaryCoin Ten = new MonetaryCoin (10);
    System.out.println (Ten.toString());
    System.out.println (Ten.getValue());
    System.out.println("-----------------");

    MonetaryCoin Hundread = new MonetaryCoin (100);
    System.out.println (Hundread.toString());
    System.out.println (Hundread.getValue());
    System.out.println("-----------------");

    MonetaryCoin fivecent = new MonetaryCoin (.05);
    System.out.println (fivecent.toString());
    System.out.println (fivecent.getValue());
    System.out.println("-----------------");

    MonetaryCoin onecent = new MonetaryCoin (.01);
    System.out.println (onecent.toString());
    System.out.println (onecent.getValue());
    System.out.println("-----------------");

    MonetaryCoin tencent = new MonetaryCoin (.10);
    System.out.println (tencent.toString());
    System.out.println (tencent.getValue());
    System.out.println("-----------------");

    MonetaryCoin quacent = new MonetaryCoin (.25);
    System.out.println (quacent.toString());
    System.out.println (quacent.getValue());
    System.out.println("-----------------");

  }
}