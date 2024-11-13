public class M16 extends Gun implements Shootable{
    @Override
    public String shoot(){
        return "Trigger the M16!";
    }

    @Override
    public String howToShoot() {
        return "Use M16 load the 25-bullet clip and aim at the target!";
    }
}
