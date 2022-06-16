import javax.lang.model.util.ElementKindVisitor14;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        Cons cons = new Cons(new L1st(1,2), new L1st(3,4));
        cons.Print();
        {
            Cons x = new Cons(new L1st(1,2), new L1st(3,4));

        }
        {
            L1st seq = new L1st(8,7,6,4,3);System.out.println("\n________");
            L1st.Car(L1st.Cdr(L1st.Cdr(L1st.Cdr(seq)))).Print();

        }
        {
            L1st square = new L1st(1, 2, 3, 4, 5);
            ArrayOperations operations = new ArrayOperations(); // instance for operating
            operations.Squaring(square.getNumbs());
            square.Print();
            int findElement = operations.ListRef(square.getNumbs(), 4);
            int findElement2 = operations.ListRef(square.getNumbs(), 2);
            System.out.println("Using ListRef: " + findElement);
            System.out.println("Using ListRef: " + findElement2);
            System.out.println("Using squaring ");
            operations.PrintArray(operations.Squaring(square.getNumbs()));
            int gotLength = operations.getLength(square.getNumbs());
            System.out.println( "Get length: "+ gotLength);
            System.out.println( "Get length iterative: "+ operations.getLengthIterative(square.getNumbs(),0));
        }
        {
            L1st input1= new L1st(1,2,3,4,5);
            L1st input2 = new L1st(1,2,3,4,5,6,7,8,9);
            ArrayOperations operate = new ArrayOperations();
            System.out.println("\n Append: ");
           /*operate.PrintArray(operate.Append(operate.Squaring(input1.getNumbs()),inputFiltered)); */
            operate.PrintArray(operate.Append(input1.getNumbs(),input2.getNumbs()));
            System.out.println("Odd filter: ");
            operate.PrintArray(operate.OddFilter(input2.getNumbs(),true)); // odd
            System.out.println();
            operate.PrintArray(operate.OddFilter(input2.getNumbs(),false)); // even

            }
        {
            int[] input = new int[]{10,20,30,40,50,60,70,80,90}; System.out.println();
            ArrayOperations operator = new ArrayOperations();System.out.println("Print last element in array: "); // 2.17
            System.out.println( operator.LastPair(input)); System.out.println("Reverse: "); // 2.18
            operator.PrintArray(operator.Reverse(input));
            System.out.println("\n" + operator.CountChange(100));
        }
        {
            int[] r = new   int[]{1,2,3,4,5,6,7};
            int first = 2;
            ArrayOperations operator  =new ArrayOperations();
          var sameParity=   operator.SameParity(1,2,4,5,6,7,8,9);
          ArrayList<Integer> sameParity2 = operator.SameParity(2,4,5,6,7,8,9,10);
          System.out.println("\nSameParity"); // 2.19
            sameParity.stream().forEach(System.out::print);System.out.println("\nSameParity2: ");
            sameParity2.stream().forEach(System.out::print);
        }
    }



    }

