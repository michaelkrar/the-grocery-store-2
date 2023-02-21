public class grocery{
    String name;
    double markupRate;
    double originalPrice;
    double hungerRestore;
    public grocery(String name, double markupRate, double originalPrice, double hungerRestore){
        this.name = name;
        this.markupRate = markupRate;
        this.originalPrice = originalPrice;
        this.hungerRestore= hungerRestore;
    }
    public void SetName(String m){
        name = m;
    } //change
    public String getName(){
        return name;
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
    public double getFinalPrice(){
        return originalPrice*markupRate;
    }
    public double getHungerRestore(){
        return hungerRestore;
    }
    public void setHungerRestore(double r){
        hungerRestore= r;
    }
    

    @Override
    public String toString(){
        return name + " will be $" + markupRate*originalPrice + ".";
    }
}