
interface Bicycle{
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);

}

interface HornBicycle{
    void blowHornK3g();
    void blowHornmhm();
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("Pee pEE ");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornK3g(){
        System.out.println("kabi khusi kabhi gaam pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hu na po po ");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBreak(1);
        //you can create properties in Interface
        System.out.println(cycleHarry.a);

        // you cannot modify the properties in interface as they are final
        // cycleHarry.a = 454;
        // System.out.println(cycleHarry.a);

        cycleHarry.blowHornK3g();
        cycleHarry.blowHornmhn();
    }
}
