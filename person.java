import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class person {
    String name;
    int age;
    double balance;
    int hp;
    ArrayList<grocery> inventory;
    int lvl;
    double xp;
    boolean isAlive;
    int timeUnit = 0;
    public person(int hp, String name, int age, double balance, int lvl, double xp, boolean isAlive){
        this.hp = hp;
        this.name = name;
        this.age = age;
        this.balance = balance;
        this.lvl = lvl;
        this.xp = xp;
        this.isAlive = isAlive;
        while(true){
                    this.personPeriodic();
        }
    }
    public String getName(){
        return name;
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
    public void speak(String spk){
        System.out.println(this.getName() + " says " + "'" + spk + "'");
    }

    public boolean checkPulse(){
        return isAlive;
    }
    public void personPeriodic(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        timeUnit++;
            if(hp<=0){
                isAlive = false;
            }
            // System.out.println(timeUnit);
            System.out.println("test" + timeUnit);
        }
    


    // public void sell(){

    // }
    
}