import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Cons extends  L1st{
ArrayList<L1st> sequences = new ArrayList<L1st>();
    public Cons( L1st...lists){
AddingToSequence(lists);
    }

    private void AddingToSequence(L1st...lists){
        sequences.addAll(Arrays.asList(lists));
    }
    public void Print(){
        for(L1st input : sequences){
          input.Print();
        }
    }




}
