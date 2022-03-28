import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Store implements Runnable {
    String name;
    ArrayList<employee> emps;
    HashMap<grocery, Integer> stock;
    int dimensionX;
    int dimensionY;
    tile[][] storeField;
    boolean inBusiness;
    public Store(String name, ArrayList<employee> emps, HashMap<grocery, Integer> stock, boolean inBusiness){
        this.name = name;
        this.emps = emps;
        this.stock = stock;
        this.inBusiness = inBusiness;
        dimensionX = 10; 
        dimensionY = 10;
        this.storeField = new tile[10][10];
        this.storeInit();
    }
    public void storeInit(){
        new Thread(this).start();  
    }
    public void storePeriodic(){
        // System.out.println("store");
    }
    
    @Override
    public void run() {
        do {
            this.storePeriodic();
            // System.out.println("success");
        }while(inBusiness);
        
    }
}
