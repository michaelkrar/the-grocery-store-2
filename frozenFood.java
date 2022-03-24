public class frozenFood extends grocery{
    double tempCelsius;
    public frozenFood(double markupRate, double originalPrice, double tempCelsius){
    super(markupRate, originalPrice);
    this.tempCelsius = tempCelsius;
    }
        public void setTemp(double t){
            tempCelsius = t;
        }
        public double getTemp(){
            return tempCelsius
        }
    }