package Cat;
public class App {
    public static void main(String[] args) throws Exception {

        // Create object from pet class
        Pet myCat = new Pet();

        myCat.hiss();
        System.out.println(myCat.eyeColor);
        System.out.println(myCat.height);
    }
}
