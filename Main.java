public class Main {
    public static void main(String[] args) {
Banks green = new Banks(BankRate.CLOSE, "Green");
green.PrintBankInfo();
Banks yellow = new Banks(BankRate.IDEAL, "Yellow");
yellow.PrintBankInfo();
BankRate[] getTypes = BankRate.values();
for(BankRate read : getTypes){
    System.out.println(read);
}
System.out.println(BankRate.DEFAULT.ordinal());
System.out.println("\n" + PsyStatement.DEPRESSION.getCode());

    }
}