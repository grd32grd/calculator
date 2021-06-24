//Imports
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.ArrayList;

//Controller Class
public class calculatorApp extends Application{
    public void start(Stage primaryStage) {

        //Pane initialization.
        Pane aPane = new Pane();
        calculatorView  view = new calculatorView();
        aPane.getChildren().add(view);

        //Stage initialization.
        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane));
        primaryStage.show();

        ArrayList<Double> addends = new ArrayList<>();


        view.zero.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "0");
            }
        });
        view.one.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "1");
            }
        });
        view.two.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "2");
            }
        });
        view.three.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "3");
            }
        });
        view.four.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "4");
            }
        });
        view.five.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "5");
            }
        });
        view.six.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "6");
            }
        });
        view.seven.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "7");
            }
        });
        view.eight.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "8");
            }
        });
        view.nine.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                String current = view.result.getText();
                view.result.setText(current + "9");
            }
        });

        view.clear.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                view.result.clear();
            }
        });
        view.add.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                addends.add(Double.parseDouble(view.result.getText()));
                String addend1 = view.result.getText();
                view.result.clear();
            }
        });
        view.equals.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Double answer = 0.0;
                for (int i = 0; i < addends.size(); i++){
                    answer += addends.get(i);
                answer += Double.parseDouble(view.result.getText());
                view.result.setText(String.valueOf(answer));
                }
            }
        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
