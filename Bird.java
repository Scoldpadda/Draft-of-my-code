public class Bird extends  Creature {
    private double level_of_Earth;
    public Bird(String name, int age, String sound,double flight_altitude_){
        super(name,age,sound);
        this.level_of_Earth = setFlight_altitude(flight_altitude_);
    }
    public Bird(){}
    private double setFlight_altitude(double input){
        if(input <0){
            return 0.0f;
        }
        return input;
    }
    public  double getFlight_altitude(){
        return this.level_of_Earth;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.printf(", live level is %f ", this.level_of_Earth);
    }
}
