import greeter.Greeter;
public class GreeterTest {
    public static void main(String[] args) {
        Greeter greeter = new Greeter("World");
        System.out.println(greeter.sayHello());
        changeName(greeter,"Hari");
        System.out.println(greeter.sayHello());
        changeObject(greeter);
        System.out.println(greeter.sayHello());
    }
    protected static void changeName(Greeter greeter,String name) {
        greeter.setName(name);
    }
    protected static void changeObject(Greeter greeter) {
        greeter = new Greeter("new");
        System.out.println("inside changeObject() " + greeter.sayHello());
    }
}
