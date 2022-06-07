import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
Book abcd = new Book("Azbuka",5.0d,-1.0d);
Book paras = new Book("MulunParas", 1.0d,5.2d);
paras.Print(); paras.Result_of_compare();
abcd.Print();abcd.Result_of_compare();
        {
            Water white = new Water("Montain", 5.0d,2.4d);
            white.Print(); white.Result_of_compare();
        }
        {
            iCopmareRate rumata = new Book("Rumata", 10.7d, 5.1d);
            iDisplayInfo rumata2 = new Book("Rumata", 10.7d, 5.1d);
            iCopmareRate saintWater = new Water("Saint water", 54.1d, 10.6d);
            iDisplayInfo saintWater2 = new Water("Saint water", 54.1d, 10.6d);
            rumata.Result_of_compare();
            rumata2.Print();
            saintWater.Result_of_compare();;
            saintWater2.Print();
            Print();
            ArrayList<String> names = new ArrayList<String>();
            String rumataTitle = ((Book)rumata).getTitle();
            String rumata2Title = ((Book)rumata2).getTitle();
            String saintWaterName = ((Water)saintWater).getName();
            String saintWaterName2 = ((Water)saintWater2).getName();
            names.add(rumataTitle);names.add(rumata2Title);names.add(saintWaterName);names.add(saintWaterName2);
            for(String name : names){
                Print(name);
            }
            PrintLine();
            iDisplayInfo.PrintNamesOfUsingObjects((iDisplayInfo)((Book) rumata),rumata2,(iDisplayInfo)saintWater,saintWater2);
            iDisplayInfo.PrintNamesOfUsingObjects(((Book) rumata).getTitle(),((Book) rumata2).getTitle(),
                    ((Water) saintWater).getName(), ((Water) saintWater2).getName());
        }
        {
            PrintLine();
            int[] array =new int[]{1,2,3,4,5};
            System.out.println(Accumulate(0,array));
            iLambda plus; plus = (x,y)-> x+y;
            iLambda multiply = (x,y) ->x*y;
            iLambda minus = (x,y) ->x-y;
            System.out.println("Plus = " + Accumulate_n( plus,0,array));
            System.out.println("Multiply = " + Accumulate_n(multiply,1,array));
            System.out.println("Minus = " + Accumulate_n(minus,0,array));
        }
        {
            iDisplayInfo don = CreateiDisplayInfo("Don Kihot", false);
            iDisplayInfo ne_don = CreateiDisplayInfo("Ne don Kihot", true);
            don.Print(); ne_don.Print();
            PrintInstanceOfiDispalyInfo(new Book("Tom Soyer",2.5d,1.0d));
            PrintInstanceOfiDispalyInfo(new Water("Bonaqua",15.9d,4.1d));


        }
    }
    private static void PrintInstanceOfiDispalyInfo(iDisplayInfo iDisplay){
        iDisplay.Print();
    }
  private  static  iDisplayInfo CreateiDisplayInfo(String title, boolean choose){
        if(choose){
            return new Book(title);
        }
        return new Water(title);

    }

    private  static int Accumulate_n(iLambda op, int initial, int[] values){
        if(values.length <=0){
            return initial;
        }
        else{
            return op.Operation(values[0],Accumulate_n(op,initial,Cdr(values)));
        }
    }
private static int Accumulate(int initial, int[] values){
      if(values.length <=0){
          return initial;
      }
      else {
          return iLambaOperation(values[0], Accumulate(initial,Cdr(values)));
      }
        }
        private  static int iLambaOperation(int a, int b) {
           return a+b;
        }


private static  int[]  Cdr(int[] array){
        int[] result = Arrays.copyOfRange(array,1,array.length);
        return result;
}
    private static void Print(){
        System.out.println("\n");
    }
    private static void Print(int result){
        System.out.println(result);
    }
    private static void Print(String input){
        System.out.println( input);
    }
    private static void PrintLine(){
        System.out.println("________________________________");
    }



}