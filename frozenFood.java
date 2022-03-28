public class frozenFood extends grocery{
    double tempCelsius;
    public frozenFood(String name, double markupRate, double originalPrice, double hungerRestore, double tempCelsius){
    super(name, markupRate, originalPrice, hungerRestore);
    this.tempCelsius = tempCelsius;
    }
        public void setTemp(double t){
            tempCelsius = t;
        }
        public double getTemp(){
            return tempCelsius;
        }
        
        @Override
        public String toString(){
            return name + " which is " + tempCelsius + " degrees celsius " + "will be $" + markupRate*originalPrice + ".";
        }
    }