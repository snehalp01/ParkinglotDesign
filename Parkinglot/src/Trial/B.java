package Trial;

public class B extends  ABC{
    private static int idCounter = 0;
    B(){
        id = ++idCounter;
    }

    @Override
    public String toString() {
        return "B{" +
                "id=" + id +
                '}';
    }
}
