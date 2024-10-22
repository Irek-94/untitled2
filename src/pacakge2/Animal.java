package pacakge2;

public class Animal {

    String bread;

    public String makeSound () {
    return "Some kind of sound";
    }

    public String getBread(){
        return  this.bread;
    }

    protected String makeSound (String sound) {
        return "Cat make a sound" + sound;
    }

    public void makeSound(String sound,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(sound);
        }
    }

}
