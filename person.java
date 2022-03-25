import java.util.ArrayList;

public class person {
    String name;
    int age;
    double balance;
    int hp;
    ArrayList<grocery> inventory;
    public person(int hp, String name, int age, double balance){
        this.hp = hp;
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
    public int getHp(){
        return hp;
    }
    public void setHp(int h){
        hp = h;
    }
    public void attack(person p){
        System.out.println("Personal punch!");
        int dmg = (int)(Math.random()*7+4);
        p.setHp(hp-dmg);
    }
    
    // public void sell(){

    // }
    
}
