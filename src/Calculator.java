
/**
 @Since 21.12.2022
 @Author Umut Baran Çiçek - 20160808025
 */


public class Calculator {


    public static void main(String[] args) {

        CalculatorView theView = new CalculatorView();

        CalculatorModel theModel = new CalculatorModel();


        CalculatorController theController = new CalculatorController(theView,theModel);
        theView.setVisible(true);

    }
}

