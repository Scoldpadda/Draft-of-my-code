public class Worm extends  Creature {
    private double level_of_Earth;
    public Worm(String name, int age, String sound, double underEarth ){
        super(name,age,sound);
        this.level_of_Earth  = setUnderEarth(underEarth);
    }
    public Worm(){}
    private double setUnderEarth(double input){
        if(input >0){
            return 0.0f;
        }
        return input;
    }
    public  double getUnderEarth(){
        return this.level_of_Earth;
    }
    @Override
    public void Display() {
        super.Display();
        System.out.printf("live level is %f ", this.level_of_Earth);
    }
}
