public class App {
    static boolean iwillReview = true;
    static boolean iwillNotFail = true;
    public static void main(String[] args) throws Exception {
        App myApp = new App();

        //precondition
        assert iwillReview == true: "Tamad yarn";
        
        myApp.Study();
        //postcondition
        assert iwillNotFail == true: "Deserve bumagsak haha";

    System.out.println(iwillReview);
    System.out.println(iwillNotFail);
}

    void Study(){
        iwillReview = false;
        iwillNotFail = false;

    }
}
