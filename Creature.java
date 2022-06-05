public class Creature {
    private String Name;
    private int Age;
    private String Sound; // звук общения
    public  Creature(String name, int age, String sound){
       this.Name = setName(name);
       this.Age = setAge(age);
       this.Sound = setSound(sound);

    }
    public Creature(){

    }
    private  String setName(String name){
    if(name == null){
        return new Exception().getMessage();
    }
    return name;
}
public String getName(){
        return this.Name;
}
    private int setAge(int age){
    if(age <0 || age >100){
        return Integer.parseInt("null");
    }
    return  age;
}
    private  String setSound(String sound){
    if(sound == null){
        return new Exception().getMessage();
    }
    return sound;
}
public String getSound(){
        return  this.Sound;
}
public void Display(){
        System.out.printf("\nName is %s, age %d, sound %s ",this.Name, this.Age, this.Sound );
}
}
