import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Object;

public class ArrayOperations extends  L1st {
    L1st list;

    public int ListRef(int[] value, int n){ // recursive procedure for find the element that index equal n.
        if(n==0){
            return Car(value); // Car items
        }
        else {
            return ListRef(Cdr(value),n-1);
        }
    }
    private int Car( int[] value){ // return first element of array of int
        return value[0];
    }
    private int[] Car_array( int[] value){ // return first element of array of int
        return new int[]{value[0]};
    }
    public int[] Cdr(int[] value){ // delete Car of int array.
        int[] result = new  int[value.length-1];
        System.arraycopy(value,1,result,0,value.length-1 );
        return result;
    }
    public int[] Squaring(int[] input){ // squaring array
        for(int i =0; i<input.length; i++){
            input[i]*=input[i];
        }
        return input;
    }
    public int getLength(int[] input){ // compute length. If predicate is input == null/isEmpty, return exception.
        if(input.length == 0 /* || input == null*/){
            return  0;
        }
        else{
            return  1 + getLength(Cdr(input));
        }
    }
    public int getLengthIterative(int[] input, int count){ // count should be zero.
       if(input.length ==0){
           return count;
       }
       else{
           return getLengthIterative(Cdr(input),count+1);
       }
    }
    public int[] Append(int[] input1, int[] input2){
       int[] result = new int[input1.length + input2.length];
       if(input1.length == 0){
           System.arraycopy(input2,0,result,0,input2.length);
       }
       else{
           System.arraycopy(input1,0,result,0,input1.length);
           System.arraycopy(input2,0,result,input1.length, input2.length);
       }
        return result;
    }


    public int[] OddFilter(int [] input, boolean odd) {
        int[] even = new  int[input.length];
        int j = 0;
        if(odd){
        for(int i =0; i<input.length ; i++){
            if(input[i] %2!=0){
                even[j] = input[i];
                j++;
            }
        }}
        else{
            for(int i =0; i<input.length ; i++){
                if(input[i] %2==0){
                    even[j] = input[i];
                    j++;
                }
            }
        }
        return Arrays.copyOf(even,j);
    }
public  int LastPair(int [] input){ // Exercise 2.17
if(input.length ==1){
    return Car(input);
}
else{
    return LastPair(Cdr(input));
}}
    public int[] Reverse(int[] input){ // Exercise 2.18
        ArrayList<Integer> temple = new ArrayList<Integer>();
        for(int i=input.length-1; i>=0; i--){
            temple.add(input[i]);
        }
        int[] result = new  int[temple.size()];
        for(int i =0; i<result.length; i++){
            result[i] = temple.get(i);
        }
return result;
    }


    public void PrintArray(int[] input){
        for(int i : input){
            System.out.print( i +  " " );
        }
    }

    // Coin Changer
    private int FirstDenomination( int kindOfCoin){
        return
                switch (kindOfCoin) {
            case 1 -> 1;
            case 2 -> 5;
            case 3 -> 10;
            case 4 -> 25;
            case 5 -> 50;
            default -> 0;
        };
    }
    private int CC  (int amount, int kindOfCoins){
        if(amount == 0){return 1;}
        else if(amount <0 || kindOfCoins ==0){ return 0;}
        else{
            return  PrefixPlus(
                    CC(amount,kindOfCoins-1),
                    CC(amount-FirstDenomination(kindOfCoins), kindOfCoins));
        }

    }
    public int CountChange(int amount){
        return CC(amount,5);
    }
    private int PrefixPlus(int... values){
        int result =0;
        for(int i : values){
            result+=i;
        }
        return result;
    }
public  ArrayList<Integer>SameParity(int first, int...numbs){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: numbs){
            if(i%2 == first%2){
                result.add(i);
            }
        }
        return result;
}

}
