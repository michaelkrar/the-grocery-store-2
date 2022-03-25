import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthFormattedTextFieldUI;

public class Store {
    String name;
    ArrayList<employee> emps;
    HashMap<grocery, Integer> stock;
    int dimensionX;
    int dimensionY;
    Object[][] storeField;
    public Store(String name, ArrayList<employee> emps, HashMap<grocery, Integer> stock){
        this.name = name;
        this.emps = emps;
        this.stock = stock;
        dimensionX = 10;
        dimensionY = 10;
        storeField = new Object[10][10];
    }
}
