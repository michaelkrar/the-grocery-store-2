public class Util {
    public static int die(int j){
        int i = (int)(Math.random()*j+1);
        return i;
    }
    public static int ZeroDie(int j){
        int i = (int)(Math.random()*(j+1));
        return i;
    }
}
