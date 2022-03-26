import java.util.ArrayList;

public class Floor extends tile{
    ArrayList<person> floorPeople;
    public Floor(boolean isActive, ArrayList<person> floorPeople){
        super(isActive);
        this.floorPeople = floorPeople;
    }
    @Override
    public void tilePeriodic(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Overpopulation logic
        if(floorPeople.size()>10){
            if(Util.die(10)==1){
                int i = Util.die(floorPeople.size());
                floorPeople.get(i).setHp(-100);
                this.floorPeople.remove(i);

            }
            
        }
        System.out.println("There are currently " + floorPeople.size() + " people on the tile.");
    }
}
