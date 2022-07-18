import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Data data1=  new Data(1,2,3,4,5);
        Data data2 = new Data(9,10,12);
        data1.PrintData();
        data2.PrintData();
        DataProcedure proc = new DataProcedure();
        Print("Odd : ");
        Data dataForTestOdd = new Data(13,3,1,3,9,1); // 30
        Print(proc.SumOddSqrt(dataForTestOdd));
        Print("Value for Fibonacci sequence: ");
        Print(proc.PrintFibSequence(9));
        Print("His Even numbs accumulation: ");
       Print(proc.AccumulateEvenFibSequence(9));



    }





    static void Print(String message){
        System.out.println();
        System.out.print(message);

    }
    static void Print(int value){
        System.out.println();
        System.out.print(value);
    }
    static  void Print(ArrayList<Integer> value){
        System.out.println();
        for(  int i: value){
            System.out.print(i + " ");
        }
    }}