import Cat.*;
import Dog.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pet myCat = new Pet();

        myCat.hiss();
        System.out.println(myCat.eyeColor);
        System.out.println(myCat.height);
        System.out.println();

        Pitsky myDog = new Pitsky();

        myDog.bark();
        System.out.println(myDog.eyeColor);
        System.out.println(myDog.height);

    }
}
