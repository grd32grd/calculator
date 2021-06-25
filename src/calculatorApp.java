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

    Double answer = 0.0;
    String operation;
    ArrayList<Double> numbers = new ArrayList<>();


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
        view.period.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (!view.result.getText().contains(".")){
                    String current = view.result.getText();
                    view.result.setText(current + ".");
                }
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
                operation = "add";
                numbers.add(Double.parseDouble(view.result.getText()));
                view.result.clear();
            }
        });
        view.subtract.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                operation = "subtract";
                numbers.add(Double.parseDouble(view.result.getText()));
                view.result.clear();
            }
        });
        view.multiply.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                operation = "multiply";
                numbers.add(Double.parseDouble(view.result.getText()));
                view.result.clear();
            }
        });
        view.divide.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                operation = "divide";
                numbers.add(Double.parseDouble(view.result.getText()));
                view.result.clear();
            }
        });

        view.sign.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (view.result.getText().contains("-")){
                    view.result.setText(view.result.getText().substring(1));
                }
                else {
                    view.result.setText("-" + view.result.getText());
                }
            }
        });
        view.percent.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                view.result.setText(String.valueOf(Double.parseDouble(view.result.getText())/100));
            }
        });

        view.equals.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (operation == "add") {
                    numbers.add(Double.parseDouble(view.result.getText()));
                    for (int i = 0; i < numbers.size(); i++) {
                        answer += numbers.get(i);
                    }

                    view.result.setText(String.valueOf(answer));
                    answer = 0.0;
                    numbers.clear();
                }

                else if (operation == "subtract") {
                    answer = numbers.get(0);
                    numbers.add(Double.parseDouble(view.result.getText()));
                    for (int i = 1; i < numbers.size(); i++) {
                        answer -= numbers.get(i);
                    }

                    view.result.setText(String.valueOf(answer));
                    answer = 0.0;
                    numbers.clear();
                }

                else if (operation == "multiply") {
                    answer = numbers.get(0);
                    numbers.add(Double.parseDouble(view.result.getText()));
                    for (int i = 1; i < numbers.size(); i++) {
                        answer *= numbers.get(i);
                    }

                    view.result.setText(String.valueOf(answer));
                    answer = 0.0;
                    numbers.clear();
                }

                else if (operation == "divide") {
                    answer = numbers.get(0);
                    numbers.add(Double.parseDouble(view.result.getText()));
                    for (int i = 1; i < numbers.size(); i++) {
                        answer /= numbers.get(i);
                    }

                    view.result.setText(String.valueOf(answer));
                    answer = 0.0;
                    numbers.clear();
                }
            }
        });


    }


    public static void main(String[] args) {
        launch(args);
    }
}
