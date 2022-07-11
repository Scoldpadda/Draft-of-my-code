import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

CoffeeTree first =  new CoffeeTree();
CoffeeObject Chibo = new CoffeeObject("Chibo", "Gold", 359.99f);
CoffeeObject Lavazza = new CoffeeObject("Lavazza", "Black-red", 405.99f);
CoffeeObject Jokey = new CoffeeObject("Jokey", "red", 199.99f);
CoffeeObject Bushido = new CoffeeObject("Bushido0", "white", 599.99f) ;
first.InsertToTree(Chibo);
first.InsertToTree(Lavazza);
first.InsertToTree(Jokey);
Print("In order traverse: ");
first.InOrder();
Print("PreOrder traverse: " );
first.PreOrder();
Print("PostOrder traverse: ");
first.PostOrder();
first.InsertToTree(Bushido);
Print("Inserted new Coffee: ");
first.InOrder();






    }
    public static void Print(String message){
        System.out.println();
        System.out.println(message);
    }
}