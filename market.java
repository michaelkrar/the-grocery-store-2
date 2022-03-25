import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
public class market{
    public static void main(String args[]){
        
        freshFood apple = new freshFood("apple", 1.25, 9, 4);
        freshFood lettuce = new freshFood("lettuce", 1.75, 5, 6);
        frozenFood iceCream = new frozenFood("iceCream", 1.25, 3, -10.3);
        frozenFood peas = new frozenFood("peas", 1.25, 2, -23.2);
        grocery beans = new grocery("beans", 1.50, 23);

        ArrayList<grocery> clearInv = new ArrayList<>(Arrays.asList());
        System.out.println("a");
        employee e1 = new employee(100, "Gerald", 22, 1.43, 11.32, 6, 3, .43, true);
        System.out.println("b");

        shopper s1 = new shopper(100, "Joe", 25, 19.34, clearInv, 2, .41, true);
        System.out.println(s1.getBalance());
        s1.buy(peas);
        System.out.println(s1.getBalance());
        System.out.println("Grocery store.");
        ArrayList<grocery> list = new ArrayList<>();
        list.add(apple);
        list.add(lettuce);
        list.add(iceCream);
        list.add(peas);
        list.add(beans);
        int s = (int)(Math.random()*4 +1);

        System.out.println(list.get(s).toString());
        s1.attack(e1);
        e1.speak("HEY!");
        
        employee e2 = new employee(100, "Gerald", 22, 1.43, 11.32, 6, 3, .85 ,true);
        employee s2 = new employee(100, "Jimmy", 22, 1.43, 11.32, 6, 3, .85 ,true);
        System.out.println("stuck");
        // HashMap<grocery, Integer> stock = new HashMap<>(lettuce,1,iceCream,2);

        // HashMap<grocery, Integer> stock = new HashMap<>(lettuce, iceCream); 
        // Store traderjoes = new Store();

    }
}