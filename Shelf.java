import java.util.ArrayList;

public class Shelf extends tile{
    ArrayList<grocery> foods;
    public Shelf(boolean isActive, ArrayList<grocery> foods){
        super(isActive);
        this.foods = foods;
    }
    
}
