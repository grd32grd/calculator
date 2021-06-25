//Imports
import javafx.collections.FXCollections;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.*;


//View Class
public class calculatorView extends Pane {
    Button zero, period, equals, one, two, three, add, four, five, six, subtract, seven, eight, nine, multiply, clear, sign, percent, divide;
    TextField result;

    Font resultFont = Font.font("Calibri", FontWeight.EXTRA_BOLD, 22);
    Font buttonFont = Font.font("Calibri", FontWeight.BOLD, 16);

    String fontStyle =  "-fx-text-fill: white;";
    String backStyle = "-fx-background-color: black;";



    public void update(){

    }

    public calculatorView() {
        zero = new Button("0");
        zero.setPrefSize(105,50);
        zero.relocate(5,305);
        zero.setFont(buttonFont);
        zero.setStyle(backStyle + fontStyle);

        period = new Button(".");
        period.setPrefSize(50,50);
        period.relocate(115,305);
        period.setFont(buttonFont);
        period.setStyle(backStyle + fontStyle);

        equals = new Button("=");
        equals.setPrefSize(50,50);
        equals.relocate(170,305);
        equals.setFont(buttonFont);
        equals.setStyle(backStyle + fontStyle);

        one = new Button("1");
        one.setPrefSize(50,50);
        one.relocate(5,250);
        one.setFont(buttonFont);
        one.setStyle(backStyle + fontStyle);

        two = new Button("2");
        two.setPrefSize(50,50);
        two.relocate(60,250);
        two.setFont(buttonFont);
        two.setStyle(backStyle + fontStyle);

        three = new Button("3");
        three.setPrefSize(50,50);
        three.relocate(115,250);
        three.setFont(buttonFont);
        three.setStyle(backStyle + fontStyle);

        add = new Button("+");
        add.setPrefSize(50,50);
        add.relocate(170,250);
        add.setFont(buttonFont);
        add.setStyle(backStyle + fontStyle);

        four = new Button("4");
        four.setPrefSize(50,50);
        four.relocate(5,195);
        four.setFont(buttonFont);
        four.setStyle(backStyle + fontStyle);

        five = new Button("5");
        five.setPrefSize(50,50);
        five.relocate(60,195);
        five.setFont(buttonFont);
        five.setStyle(backStyle + fontStyle);

        six = new Button("6");
        six.setPrefSize(50,50);
        six.relocate(115,195);
        six.setFont(buttonFont);
        six.setStyle(backStyle + fontStyle);

        subtract = new Button("-");
        subtract.setPrefSize(50,50);
        subtract.relocate(170,195);
        subtract.setFont(buttonFont);
        subtract.setStyle(backStyle + fontStyle);

        seven = new Button("7");
        seven.setPrefSize(50,50);
        seven.relocate(5,140);
        seven.setFont(buttonFont);
        seven.setStyle(backStyle + fontStyle);

        eight = new Button("8");
        eight.setPrefSize(50,50);
        eight.relocate(60,140);
        eight.setFont(buttonFont);
        eight.setStyle(backStyle + fontStyle);

        nine = new Button("9");
        nine.setPrefSize(50,50);
        nine.relocate(115,140);
        nine.setFont(buttonFont);
        nine.setStyle(backStyle + fontStyle);

        multiply = new Button("x");
        multiply.setPrefSize(50,50);
        multiply.relocate(170,140);
        multiply.setFont(buttonFont);
        multiply.setStyle(backStyle + fontStyle);

        clear = new Button("C");
        clear.setPrefSize(50,50);
        clear.relocate(5,85);
        clear.setFont(buttonFont);
        clear.setStyle(backStyle + fontStyle);

        sign = new Button("+/-");
        sign.setPrefSize(50,50);
        sign.relocate(60,85);
        sign.setFont(buttonFont);
        sign.setStyle(backStyle + fontStyle);

        percent = new Button("%");
        percent.setPrefSize(50,50);
        percent.relocate(115,85);
        percent.setFont(buttonFont);
        percent.setStyle(backStyle + fontStyle);

        divide = new Button("÷");
        divide.setPrefSize(50,50);
        divide.relocate(170,85);
        divide.setFont(buttonFont);
        divide.setStyle(backStyle + fontStyle);

        result = new TextField();
        result.setPrefSize(215,75);
        result.relocate(5,5);
        result.setFont(resultFont);
        result.setStyle(backStyle + fontStyle);

        getChildren().addAll(zero, period, equals, one, two, three, add, four, five, six, subtract, seven, eight, nine, multiply, clear, sign, percent, divide, result);
        setPrefSize(225, 360);




    }


}
