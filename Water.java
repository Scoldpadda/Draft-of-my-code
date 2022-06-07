public class Water implements  iCopmareRate,iDisplayInfo {

    private String Name;
    private double rate_of_water;
    private double antirate_of_water;
    public  Water(){}
    public  Water(String title){
        this.Name = setName(title);
    }
    public  Water(String name, double rate_of_water_, double antirate_of_water){
        this.Name = setName(name);
        this.rate_of_water = setRate_of_water(rate_of_water_);
        this.antirate_of_water = setAntirate_of_water(antirate_of_water);
    }
    private  String setName(String name){
        if (name.length()<=2 || name == null){
            return "Incorrect name.";
        }
        return name;
    }
    public  String getName  (){
        return  this.Name;
    }
    private double setRate_of_water(double rate_of_water){
        if(rate_of_water >=0.1d || rate_of_water<=10.0d){
            return rate_of_water;
        }
        return 0.0d;

    }
    private double setAntirate_of_water(double antirate_of_water){
        if(antirate_of_water >=-10.0d || antirate_of_water<=2.0d){
            return antirate_of_water;
        }
        return 0.0d;
    }
    @Override
    public double getRate_of_subject() {
        return rate_of_water;
    }

    @Override
    public double getAntirate_of_subject() {
        return antirate_of_water;
    }

    @Override
    public void Result_of_compare() {
            double result = rate_of_water - antirate_of_water;
            if(result >=5){
                System.out.printf("\n Rate is high. (%f). ", result);
            }
            if(result<5 ){
                System.out.printf("\n Rate is low. (%f)", result);
            }
    }

    @Override
    public void Print() {
            System.out.printf("\n Water name is %s, rate is %f, antirate is %f",
                    Name,rate_of_water,antirate_of_water);
    }
}
