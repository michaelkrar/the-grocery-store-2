
import java.util.ArrayList;

public class person implements Runnable {
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
        this.personInit();
        
    }
    public String getName_(){
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
        System.out.println(this.getName_() + " says " + "'" + spk + "'");
    }

    public void checkPulse(){
        if(hp<=0){
            isAlive = false;
        }
        else{
            isAlive=true;
        }
    }
    public void personInit(){
        
       new Thread(this).start();        
    }
    public void personPeriodic(){
        
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        timeUnit++;
            checkPulse();
            // System.out.println(timeUnit);
            System.out.println("test1" + timeUnit);
            this.speak("Hello");
        
    }
        public void run(){
            do {
                this.personPeriodic();
                System.out.println("success");
            }while(isAlive);
            
            
            
        }
    


    // public void sell(){

    // }
    
}