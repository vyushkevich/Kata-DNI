package factoria5.katadni;

import factoria5.katadni.Controller.DniController;
import factoria5.katadni.Model.DniCalculator;
import factoria5.katadni.View.ConsoleView;

public class App {
    public static void main(String[] args) {
        DniCalculator model = new DniCalculator();
        ConsoleView view = new ConsoleView();
        DniController controller = new DniController(model, view);

        controller.run();
    }
}
