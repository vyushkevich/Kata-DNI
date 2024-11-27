package factoria5.katadni.Controller;

import model.DniCalculator;
import view.ConsoleView;

public class DniController {
    private final DniCalculator model;
    private final ConsoleView view;

    public DniController(DniCalculator model, ConsoleView view) {
        this.model = model;
        this.view = view;
    }

    public void run() {
        while (true) {
            String input = view.promptDni();

            if (!model.isValidDni(input)) {
                view.showInvalidInputMessage();
                continue;
            }

            int dniNumber = Integer.parseInt(input);
            char dniLetter = model.calculateDniLetter(dniNumber);
            view.showDniResult(dniNumber, dniLetter);
            break;
        }
    }
}
