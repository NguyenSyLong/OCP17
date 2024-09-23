package OCP17.Chapter7.Interface;

public class Main {
    public static void main(String[] args) {
        Snake a = new Snake();
        System.out.println(a.getTemperature());
    }
}



interface Tool{    //1
    void operate(); //2
}

abstract class PowerTool implements Tool{ } //3

//class PowerSaw implements PowerTool{       @Override      public void operate(){ } }
//
//class SteamPowerSaw{     abstract int absMethod(int param) throws Exception; }
