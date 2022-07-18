import java.util.ArrayList;

public class Data {

    ArrayList<Integer> data = new ArrayList<>();
     public  Data (int...numbs){
         for(int i : numbs){
             this.data.add(i);
         }
     }
     public  void PrintData(){
         System.out.println();
         for(int i : data){
             System.out.print(i + " ");
         }
     }

}
