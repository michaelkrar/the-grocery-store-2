public class freshFood extends grocery{
    int ripenessDays;
    public freshFood(int ripenessDays){
        super(markupRate, originalPrice);
        this.ripenessDays = ripenessDays;
    }
}