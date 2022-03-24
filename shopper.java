import java.util.ArrayList;

public class shopper {
    String name;
    int age;
    double balance;
    ArrayList<grocery> inventory;
    public shopper(String name, int age, double balance,ArrayList<grocery> inventory){
        this.name = name;
        this.age = age;
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double b){
        balance = b;
    }
    public void buy(grocery grocery){
        double r = balance-grocery.getFinalPrice();
        this.setBalance(r);
    }
    // public void sell(){

    // }
    
}
