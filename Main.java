public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog(new MoveHandler());
        rex.Tired();
        rex.Tired();
        rex.GiveFood();rex.GiveFood();
        rex.Play();
        rex.Play();
        Dog lazyBoy = new Dog(new MoveHandler(){
@Override
            public void Run(){
                System.out.println("lazyBoy very lazy. He don`t run.");

            }@Override
            public void Sleep() {
                System.out.println("lazyBoy didn`t get up. He is sleeping whole day.");
            }@Override
            public void Eat(){
                System.out.println("lazyBoy love food. Give him eat.");
            }
        });
        lazyBoy.GiveFood(); lazyBoy.GiveFood();lazyBoy.GiveFood();
        lazyBoy.Play(); lazyBoy.Tired(); // bool statement switching.




    }
}