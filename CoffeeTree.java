public class CoffeeTree {
private CoffeeObject root;
public float getPrice(){
    return root.Price;

}    CoffeeTree(){
    root = null;
}
private CoffeeObject Insert(CoffeeObject root, CoffeeObject dataToBeInsert){
        if(root == null){
            return new CoffeeObject(dataToBeInsert);
        }
        if(dataToBeInsert.Price <root.Price){
            root.leftBranch = Insert(root.leftBranch,dataToBeInsert);
        }
        else if(dataToBeInsert.Price > root.Price){
            root.RightBranch = Insert(root.RightBranch,dataToBeInsert);
        }
        return root;
}
public void InsertToTree(CoffeeObject coffee){
root = Insert(root,coffee);
}
private  CoffeeObject Search(CoffeeObject root, CoffeeObject dataToBeFind){
if(root.Price == dataToBeFind.Price || root== null) {
    return root;
}
else if(dataToBeFind.Price < root.Price){
return Search(root.leftBranch,dataToBeFind);
}
return Search(root.RightBranch,dataToBeFind);
}
public void SearchCoffee(CoffeeObject coffeeToFind){
        root = Search(root,coffeeToFind);

}
private void PreOrderTraverse(CoffeeObject root){
if(root == null){
    return ;
}System.out.println("Title: " + root.Title + " Price: " + root.Price);
    PreOrderTraverse(root.leftBranch);

    PreOrderTraverse(root.RightBranch);

}
    private void PostOrderTraverse(CoffeeObject root){
        if(root == null){
            return ;
        }
        PostOrderTraverse(root.leftBranch);
        PostOrderTraverse(root.RightBranch);
        System.out.println("Title: " + root.Title + " Price: " + root.Price);
    }
    private void InOrderTraverse(CoffeeObject root){
        if(root == null){
            return ;
        }
        InOrderTraverse(root.leftBranch);
        System.out.println("Title: " + root.Title + " Price: " + root.Price);
        InOrderTraverse(root.RightBranch);

    }
public void InOrder(){ InOrderTraverse(root);}
    public void PreOrder(){PreOrderTraverse(root);};
    public void PostOrder(){PostOrderTraverse(root);};





}







