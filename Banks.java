public class Banks {
    BankRate Rate;
    private  String Title_Bank;
    public Banks(BankRate rate, String title_bank){
        this.Rate = setBankRate(rate);
        this.Title_Bank = title_bank;
    }
    private BankRate setBankRate(BankRate rate){
        if(rate == null ){
           return  BankRate.DEFAULT;
        }
        return rate;
    }
    public void PrintBankInfo(){
        System.out.printf("\n Bank: %S, Rate: %S",Title_Bank,Rate );
    }

}
