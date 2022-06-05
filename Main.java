
public class Main {
    public static void main(String[] args) {
        Creature kadadu = new Bird("Kadadu", 3, "Auuu", 10.2f);
        Creature blackWorm = new Worm("Black Eater",1, "f",-3.4f );
        kadadu.Display();
        blackWorm.Display();
        {
            Object unit = new Worm();
            Worm wrm = (Worm) unit;
            wrm.Display();
            System.out.println(wrm.getName());
        }
        {
            Object himera = new Bird("Himera",10,"Hello",15.2d);
            ((Creature)himera).Display();
            Object WalkingWorm = new Worm("Walker", 2, "dabdab", -2.1d);
            ((Creature)WalkingWorm).Display();
        }
        {
            Object flyBox = new Bird();
            if(flyBox instanceof  Worm goodWorm){
                goodWorm.Display();
            }
            else {System.out.println("\n Convertation is not allow.");}
            Object slipper = new Worm();
            if(slipper instanceof Creature slippery_){
                slippery_.Display();
            }
            else {System.out.println("\n Convertation is not allow.");}
        }



    }

}