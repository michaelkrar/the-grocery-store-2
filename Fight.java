public class Fight implements Runnable{
    person p1;
    person p2;
    Floor f;
    boolean fightActive;
    int turn;
    public Fight(person p1, person p2, Floor f){
        this.p1 = p1;
        this.p2 = p2;
        this.f = f;
        this.fightActive = true;
        this.turn = 0;
        this.FightInit();
    }
    public void FightInit(){
        new Thread(this).start();   
    }
    public void FightPeriodic(){
        turn++;
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if(this.turn%2==1){
            this.p1.attack(p2);
        }
        else{
            this.p2.attack(p1);
        }
        if(!p1.isAlive||!p2.isAlive){
            fightActive=false;
        }
        System.out.println("p1:" + p1.getHp());
        System.out.println("p2:" + p2.getHp());

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        do {
            this.FightPeriodic();

        }while(fightActive);
        
    }

}