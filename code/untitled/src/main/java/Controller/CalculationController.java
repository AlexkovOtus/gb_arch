package Controller;

import org.springframework.stereotype.Controller;


@Controller
public class CalculationController {
    private final CalculationModel calculationModel;
    private final CalculationView calculationView;

    public CalculationController() {
        calculationModel = null;
        calculationView = null;
    }
}
