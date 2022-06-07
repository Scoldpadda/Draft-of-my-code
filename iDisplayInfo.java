public interface iDisplayInfo {
    void Print();
    default  void PrintNothing(){
        System.out.println("This method do nothing.");
    }
    static void PrintNamesOfUsingObjects(iDisplayInfo...objectsList){
        for(iDisplayInfo obj : objectsList){
            System.out.println(obj);
        }
    }
    static void PrintNamesOfUsingObjects(String...objectsList){
        for(String obj : objectsList){
            System.out.println(obj);
        }
    }

}
