package com.example.tetrisgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BackgroundImage bgimg = new BackgroundImage(
                new Image("C:\\College NMIMS\\Sem VI\\Java Programming\\Miniproject\\TetrisGame\\src\\Images\\Main.jpg", 1080, 1920, false, true),
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(1.0, 1.0, true, true, false, false)
        );
        Background bg = new Background(bgimg);
        GridPane root =new GridPane();
        root.setBackground(bg);

        Button btn=new Button("Lets Begin");


        btn.setStyle("-fx-background-color: " +
                "        linear-gradient(#f0ff35, #a9ff00), " +
                "        radial-gradient(center 50% -40%, radius 200%, #b8ee36 45%, #80c800 50%); " +
                "    -fx-background-radius: 6, 5; " +
                "    -fx-background-insets: 0, 1; " +
                "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.4) , 5, 0.0 , 0 , 1 ); " +
                "    -fx-text-fill: #395306;"
        );
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Tetris tetris = new Tetris();
                Main main = new Main();
                try {
                    tetris.start(new Stage());
                    primaryStage.close();

                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            }
        });

        Stop[] stops = new Stop[] {
                new Stop(0, Color.RED),
                new Stop(1, Color.YELLOW),
                new Stop(2,Color.GREEN),
                new Stop(1, Color.BLUE),
                new Stop(1, Color.SKYBLUE),
                new Stop(1, Color.NAVY),

        };
        LinearGradient gradient =
                new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops);

        InnerShadow is = new InnerShadow();
        is.setOffsetX(4.0f);
        is.setOffsetY(4.0f);

        Text t = new Text();
        t.setEffect(is);
        t.setX(20);
        t.setY(100);
        t.setText("TETRIS");
        t.setFill(gradient);
        t.setFont(Font.font(null, FontWeight.BOLD, 80));

//        t.setTranslateX(300);
//        t.setTranslateY(300);



        btn.setAlignment(Pos.CENTER);
        GridPane.setHalignment(btn, HPos.CENTER);
//
//        GridPane.setColumnSpan(t, 3);
        root.add(t,0,0);
        root.add(btn,0,1);

        root.setAlignment(Pos.CENTER);
//        root.setGridLinesVisible(true);



        Scene scene = new Scene(root, 700,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
}