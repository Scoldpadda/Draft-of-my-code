public class Dog {
    MoveHandler moveHandler;
    private boolean currentStatement;

    public Dog(MoveHandler action) {
        this.moveHandler = action;
        currentStatement = true;
    }
    public  void Tired(){
        if(currentStatement){
            moveHandler.Sleep();
            currentStatement = false;
        }
        else{
            System.out.println("Dog slept.");
            currentStatement = true;
        }
    }
public void Play(){
        if(currentStatement){
            moveHandler.Run();
            currentStatement = false;
        }
        else{
            System.out.println("Dog ran.");
            currentStatement = true;
        }
}
    public void GiveFood() {
        if (currentStatement) {
            moveHandler.Eat();
            currentStatement = false;
        }
        else
        {
            System.out.println("Dog ate.");
            currentStatement = true;
        }


    }
}
