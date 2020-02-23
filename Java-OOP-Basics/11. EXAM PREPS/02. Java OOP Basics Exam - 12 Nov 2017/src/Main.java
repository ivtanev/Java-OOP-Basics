import controller.HealthManager;
import view.IOManager;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IOManager.getInstance().run(HealthManager.getInstance());
    }
}
