public class grocery{
    String name;
    double markupRate;
    double originalPrice;
    public grocery(String name, double markupRate, double originalPrice){
        this.name = name;
        this.markupRate = markupRate;
        this.originalPrice = originalPrice;
    }
    public void SetMarkup(double m){
        markupRate = m;
    }
    public double getMarkup(){
        return markupRate;
    }
    public void SetOriginalPrice(double p){
        originalPrice = p;
    }
    public double getOriginalPrice(){
        return originalPrice;
    }

    @Override
    public String toString(){
        return name + " will be $" + markupRate*originalPrice + ".";
    }
}