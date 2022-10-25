package Chapter_09;

public class Stock {
  private   String symbol;
  private   String name;
  private   double currentPrice;
  private double previousClosingPrice;
  Stock(String symbol,String name){
      this.symbol=symbol;
      this.name=name;
  }

double getChangePercent(){
   return  (getCurrentPrice()-getPreviousClosingPrice())/100;
}
double getCurrentPrice(){
      return currentPrice;
}
double getPreviousClosingPrice(){
      return previousClosingPrice;
}

void setCurrentPrice(double currentPrice){
      this.currentPrice=currentPrice;
}
void setPreviousClosingPrice(double previousClosingPrice){
      this.previousClosingPrice=previousClosingPrice;
}

    public static void main(String[] args) {
        Stock s1=new Stock("ORCL","Oracle");
        s1.setPreviousClosingPrice(34.5);
        s1.setCurrentPrice(34.35);
        System.out.println("the price chanching percentage is "+s1.getChangePercent());

  }
}
