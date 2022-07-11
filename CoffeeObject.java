public class CoffeeObject {
    public  String Title;
    public  String ColorOfPackage;
    public   float Price;
    CoffeeObject leftBranch;
    CoffeeObject RightBranch;


    public CoffeeObject(String title, String colorOfPackage, float price){
        this.Title = title; this.ColorOfPackage = colorOfPackage;
        this.Price = price;
    }

public CoffeeObject(CoffeeObject data){
this.Title = data.Title;
this.ColorOfPackage = data.ColorOfPackage;
this.Price= data.Price;
}
    public CoffeeObject(){}
}
