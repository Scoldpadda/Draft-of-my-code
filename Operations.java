import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Operations extends  Cons {


  public Integer Car(ArrayList<Integer> input){
      return input.get(0);
  }
  public ArrayList<Integer> Cdr(ArrayList<Integer> input){
      ArrayList<Integer> result = new ArrayList<>(input);
      result.remove(0);
      return result;
  }
  public ArrayList<Integer> ScaleList(ArrayList<Integer> input,int factor){
      ArrayList<Integer> result = new ArrayList<>();
     for(int i = 0; i<input.size(); i++) {
     result.add((int)input.toArray()[i]*factor);
     }
      return result;
  }
  public   ArrayList<Integer> Scale2(ArrayList<Integer> input, int factor){
      ArrayList<Integer> result = new ArrayList<>();
      Operationable op = new Operationable() {
          @Override
          public ArrayList<Integer> AddingToArrayList(ArrayList<Integer> input_value, ArrayList<Integer> result1) {
              if(input_value.size()<=1){
                  result1.add(input_value.get(0));
                  return result1;
              }
              else
              {result1.add(input_value.get(0));
                  return AddingToArrayList(Cdr(input_value),result1);
              }
          }
      };
      result  = op.AddingToArrayList(input,new ArrayList<Integer>());
      
      return result;
  }



}







