import java.util.ArrayList;

public class person {
    String name;
    int age;
    double balance;
    ArrayList<grocery> inventory;
    public person(String name, int age, double balance){
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
    
    // public void sell(){

    // }
    
}
