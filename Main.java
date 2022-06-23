import  java.util.Collection;
import java.util.ArrayList;

public class Main { // mapping over list
    public static void main(String[] args) {
        {
            Cons cons  = new Cons(1,2,3,4);
            Operations operate = new Operations(); System.out.println("Car: ");
            System.out.println(operate.Car(cons.getItems()));
            operate.PrintItems(cons); System.out.println("Cdr: ");
           operate.PrintItems(operate.Cdr(cons.getItems()));
           var scale = operate.ScaleList(cons.getItems(),10);
            System.out.println("Scale: ");
           operate.PrintItems(scale);System.out.println("Scale222: ");
          var t= operate.Scale2(cons.getItems(),10);
            operate.PrintItems(t);


        }


    }
}