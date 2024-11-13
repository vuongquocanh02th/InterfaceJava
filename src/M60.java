public class M60 extends Gun implements Shootable{
    @Override
    public String shoot(){
        return "Trigger the M60";
    }

    @Override
    public String howToShoot() {
        return "Use M60 load the heavy clip and aim at the target!";
    }
}
