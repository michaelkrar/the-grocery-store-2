import java.util.ArrayList;

public class employee extends person {
    double hourlyPay;
    int position;
    public employee(String name, int age, double balance, double hourlyPay, int position){
        super(name, age, balance);
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
    
    
    // public void sell(){

    // }
    
}
