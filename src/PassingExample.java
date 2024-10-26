public class PassingExample {
    public static void main(String[] args) {

        String name = "Leo Mwanzia";// this is the object in the heap memory
        greet(name); //value is passed
    }
 
    static void greet(String jina) {
        System.out.println(jina);
        
    }
}
