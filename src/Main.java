public class Main {
    public static void main(String[] args) {
        Gun[] guns = new Gun[2];
        guns[0] = new M16();
        guns[1] = new M60();
        for(Gun gun: guns) {
            System.out.println(gun.shoot());
            if(gun instanceof M16) {
                Shootable shootable = (M16) gun;
                System.out.println(shootable.howToShoot());
            }
        }
    }
}