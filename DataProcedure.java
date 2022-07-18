import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DataProcedure {

   public int SumOddSqrt(Data data) {
       int result = 0;
if(data.data == null || data.data.size()<=0){
    return 0;
}
for(int i :  data.data){
    if(DoFilter(i)){
        result+=i;
    }
}
return Squaring(result);
}
private int Squaring(int numb){
       return numb*numb;
}

private boolean DoFilter(int numb){
       if(numb%2!=0){
           return true;
       }
   else{
       return false;
       }
   }

    private  Data OddFilter(Data data){ // not usage
      Data result = new Data();
        for(int i : data.data){
          if(i%2!=0){
              result.data.add(i);
          }

    }
return result;
    }

    private Integer AccumulateIntegers(int... numbs){
       int result = 0;
       for(int i: numbs){
           result +=i;
       }
       return result;
    }
    private Integer AccumulateArrayList(ArrayList<Integer> value){
        int result = 0;
        for(int i: value){
            result +=i;
        }
        return result;
    }

    private Integer CarData(Data data){
       return  data.data.get(0);
    }

    private Data CdrData(Data data){
       data.data.remove(CarData((data)));
       return data;
    }

    public int AccumulateEvenFibSequence(int value){
       return AccumulateArrayList(EvenFibs(value));
    }

    private  ArrayList<Integer> EvenFibs(int value){
       ArrayList<Integer> fib = new ArrayList<>();
       while(value !=0){
           fib.add(Fib(0,1,value));
           value--;
       }
       ArrayList<Integer> Even = new ArrayList<>();
       for( int i : fib){
           if(!DoFilter(i)){
             Even.add(i);
           }
       }
       return ReverseArrayList(Even);
    }
    public ArrayList<Integer> PrintFibSequence(int value){
       return EvenFibs(value);
    }
    private ArrayList<Integer> ReverseArrayList(ArrayList<Integer> sequence){
        ArrayList<Integer> reversedList = new ArrayList<>();
       for(int i = sequence.size()-1; i>=0; i--){
           reversedList.add(sequence.get(i));
       }
       return reversedList;
   }
    public  int Fib(int a, int b, int count){
       if(count == 0){
           return b;
       }
       else{
           return Fib(a+b,a, count-1);
       }

    }





















}
