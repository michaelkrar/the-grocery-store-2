import java.util.ArrayList;

public class shopper extends person {
    ArrayList<grocery> inventory;
    public shopper(int hp, String name, int age, double balance,ArrayList<grocery> inventory, int lvl, double xp, boolean isAlive, double hunger){
        super(hp, name, age, balance, lvl, xp, isAlive, hunger);
        this.inventory = inventory;
    }
    public void buy(grocery grocery){
        double r = balance-grocery.getFinalPrice();
        this.setBalance(r);
        inventory.add(grocery);
    }
    @Override
    public void attack(person p){
        System.out.println("Shopping cart smash!");
        int dmg = (int)(Math.random()*19+9);
        p.setHp(hp-dmg);
    }

    public void eat(grocery g){
        if(inventory.contains(g)){
            inventory.remove(g);
            hunger=hunger+g.getHungerRestore();            
        }
    }
    public void hungryEat(){
        if(this.hunger<4){
        if(this.inventory.size()>0){
            this.eat(this.inventory.get(Util.ZeroDie(this.inventory.size()-1)));
        }
    }
    }
    
    
    // public void sell(){

    // }
    
}
