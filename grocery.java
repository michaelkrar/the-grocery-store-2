public class grocery{
    double markupRate;
    double originalPrice;
    public groceries(markupRate,originalPrice){
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
}