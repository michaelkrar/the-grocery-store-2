public class freshFood extends grocery{
    int ripenessDays;
    double freshOriginalPrice;
    public freshFood(String name, double markupRate, double originalPrice, double hungerRestore, int ripenessDays){
        super(name, markupRate, originalPrice, hungerRestore);
        this.ripenessDays = ripenessDays;
        originalPrice = (Math.exp(0-ripenessDays)*originalPrice);
    }
    public void setDaysRipe(int t){
        ripenessDays = t;
    }
    public int getRipeness(){
        return ripenessDays;
    }

    @Override
    public String toString(){
        return name + " which is " + ripenessDays + " days ripe will be $" + markupRate*freshOriginalPrice + ".";
    }
}