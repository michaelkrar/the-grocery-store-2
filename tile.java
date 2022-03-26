import java.util.ArrayList;

public class tile implements Runnable{
    boolean isActive;
    public tile(boolean isActive){
        this.isActive = isActive;
        tileInit();
    }
    public void tileInit(){
        new Thread(this).start();
    }
    public void tilePeriodic(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
     
    }
    public void run(){
        do {
            this.tilePeriodic();
            System.out.println("success");
        }while(isActive);
    }
}
