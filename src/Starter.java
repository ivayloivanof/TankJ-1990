import engine.Engine;
import exception.CreateTankException;

public class Starter {
    public static void main(String[] args) {
        try {
            Engine engine = new Engine();
            engine.init(2, 20);
            engine.run();
        } catch (CreateTankException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
