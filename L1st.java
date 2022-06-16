import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.lang.Object;

public class L1st {

private final int[] numbs;
    public L1st(int... values){
this.numbs = TransitArray(values);
    }

    private int[] TransitArray(int... values){
        int[] array = new int[values.length];
        array = values;
        return array;
        }
private static  L1st _Car(L1st list){
        return new L1st(list.numbs[0]);
}
public static L1st Car(L1st list){
        return _Car(list);
}
private   static  L1st _Cdr(L1st list){
      int[] result = new  int[list.numbs.length -1];
      System.arraycopy(list.numbs,1,result,0,list.numbs.length-1);
      return  new L1st(result);
}

public static L1st Cdr(L1st list){
        return _Cdr(list);
}
public  int[] getNumbs(){
        return this.numbs;
}
   public  void Print() {
        System.out.println();
        for(int input : numbs){
            System.out.print(input + " ");
        }
        }

    }




