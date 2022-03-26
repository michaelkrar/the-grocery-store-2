public class TemporalControl implements Runnable {
    int rawTimeSec;
    int second;
    int minute;
    int hour;
    int day;
    int year;
    int month;
    public TemporalControl(){
        this.rawTimeSec=0;
        this.timeInit();
    }
    public void timeInit(){
        
        new Thread(this).start();
    }
    public void timePeriodic(){
        try
            {
                Thread.sleep(1000);
            }
        catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
        rawTimeSec++;
        timeUniter();
        // System.out.println(rawTimeSec);
        // System.out.println("Time: " + hour + ":" + minute + ":" + second);
        // System.out.println("Day: " + month + "/" + day + "/" + year);
    }
    public void timeUniter(){
        int dsec = rawTimeSec;
        year = dsec/(365*24*60*60);
        dsec = dsec%(365*24*60*60);
        day = dsec/(24*60*60);
        dsec = dsec%(24*60*60);
        hour = dsec/(60*60);
        dsec = dsec/(60*60);
        minute = dsec/(60);
        dsec = dsec/(60);
        second = dsec;
    }
    public void run(){
        while(true){
            this.timePeriodic();
            // System.out.println("time is running smoothly");
        }
    }

    
}
