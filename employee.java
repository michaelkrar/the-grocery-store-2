import java.util.ArrayList;

public class employee extends person {
    double hourlyPay;
    int position;
    public employee(int hp, String name, int age, double balance, double hourlyPay, int position, int lvl, double xp, boolean isAlive){
        super(hp, name, age, balance, lvl, xp, isAlive);
        this.hourlyPay = hourlyPay;
        this.position = position;
    }
    public void setPay(double p){
        hourlyPay = p;
    }
    public double getPay(){
        return hourlyPay;
    }

    public void setPosition(int p){
        position = p;
    }
    public int getPosition(){
        return position;
    }
    @Override
    public void attack(person p){
        System.out.println("Minimum wage kick!");
        int dmg = (int)(Math.random()*15+11);
        p.setHp(hp-dmg);
    }
    
    // public void sell(){

    // }
    
}