//Imports
import javafx.collections.FXCollections;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


//View Class
public class calculatorView extends Pane {
    Button zero, period, equals, one, two, three, add, four, five, six, subtract, seven, eight, nine, multiply, clear, sign, percent, divide;
    TextField result;

    public void update(){

    }

    public calculatorView() {
        zero = new Button("0");
        zero.setPrefSize(105,50);
        zero.relocate(5,305);

        period = new Button(".");
        period.setPrefSize(50,50);
        period.relocate(115,305);

        equals = new Button("=");
        equals.setPrefSize(50,50);
        equals.relocate(170,305);

        one = new Button("1");
        one.setPrefSize(50,50);
        one.relocate(5,250);

        two = new Button("2");
        two.setPrefSize(50,50);
        two.relocate(60,250);

        three = new Button("3");
        three.setPrefSize(50,50);
        three.relocate(115,250);

        add = new Button("+");
        add.setPrefSize(50,50);
        add.relocate(170,250);

        four = new Button("4");
        four.setPrefSize(50,50);
        four.relocate(5,195);

        five = new Button("5");
        five.setPrefSize(50,50);
        five.relocate(60,195);

        six = new Button("6");
        six.setPrefSize(50,50);
        six.relocate(115,195);

        subtract = new Button("-");
        subtract.setPrefSize(50,50);
        subtract.relocate(170,195);

        seven = new Button("7");
        seven.setPrefSize(50,50);
        seven.relocate(5,140);

        eight = new Button("8");
        eight.setPrefSize(50,50);
        eight.relocate(60,140);

        nine = new Button("9");
        nine.setPrefSize(50,50);
        nine.relocate(115,140);

        multiply = new Button("x");
        multiply.setPrefSize(50,50);
        multiply.relocate(170,140);

        clear = new Button("C");
        clear.setPrefSize(50,50);
        clear.relocate(5,85);

        sign = new Button("+/-");
        sign.setPrefSize(50,50);
        sign.relocate(60,85);

        percent = new Button("%");
        percent.setPrefSize(50,50);
        percent.relocate(115,85);

        divide = new Button("÷");
        divide.setPrefSize(50,50);
        divide.relocate(170,85);

        result = new TextField();
        result.setPrefSize(215,75);
        result.relocate(5,5);

        getChildren().addAll(zero, period, equals, one, two, three, add, four, five, six, subtract, seven, eight, nine, multiply, clear, sign, percent, divide, result);
        setPrefSize(225, 360);




    }


}
