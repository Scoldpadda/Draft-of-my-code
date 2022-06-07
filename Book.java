public class Book implements iDisplayInfo,iCopmareRate {

    private double rate_of_subject=0.0d;
    private double antirate_of_subject=0.0d;
    private String Title;

    public Book(){

    }
    public  Book(String title){
        Title = setTitle(title);
        rate_of_subject = 1.5d;
        antirate_of_subject = 0.0d;
    }
    public Book (String title, double rate_of_subject, double antirate_of_subject){
        this(title);
        this.rate_of_subject = setRate_of_subject(rate_of_subject);
        this.antirate_of_subject = setAntirate_of_subject(antirate_of_subject);

    }
    private String setTitle(String title){
        if(title ==null || title.length() <=2){
            return "Incorrect title.";
        }
        return title;
    }
    public  String getTitle(){
        return Title;
    }
    private double setRate_of_subject(double rate_of_subject_){
        if(rate_of_subject_ >=0.1d || rate_of_subject_<=10.0d){
            return rate_of_subject_;
        }
        return 0.0d;

    }
    private double setAntirate_of_subject(double antirate_of_subject_){
        if(antirate_of_subject_ >=-10.0d || antirate_of_subject_<=2.0d){
            return antirate_of_subject_;
        }
        return 0.0d;
    }
    public double getRate_of_subject(){
        return rate_of_subject;
    };
    public double getAntirate_of_subject(){
return  antirate_of_subject;
    };

    public void Print(){
System.out.printf("\n Book name is %s, rate is %f, antirate is %f", Title,rate_of_subject,antirate_of_subject);
    };
    public void Result_of_compare(){
        double result = rate_of_subject - antirate_of_subject;
        if(result >=5){
            System.out.printf("\n Rate is high. (%f). ", result);
        }
        if(result<5 ){
            System.out.printf("\n Rate is low. (%f)", result);
        }
    }

}
