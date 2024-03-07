package Trial;

public class A extends ABC{
    private static int idCounter = 0;
    A(){
        id = ++idCounter;
    }

    @Override
    public String toString() {
        return "A{" +
                "id=" + id +
                '}';
    }
}
