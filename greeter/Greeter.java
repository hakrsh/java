package greeter;

public class Greeter {
    private String name;
    /*
     * Constructs a Greeter class
     * @param name the name of the person or entity
     */
    public Greeter(String name) {
        this.name = name;
    }
    /*
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /*
     * Greet with "Hello" message
     * @return a message containing "Hello"
     */
    public String sayHello() {
        return "Hello " + name + "!";
    }
}