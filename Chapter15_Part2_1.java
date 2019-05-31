/********************************************************************************************************************
 ********************************************************************************************************************
 *****                                    Chapter 15, Part 2: Problem 1                                         *****
 *****__________________________________________________________________________________________________________*****
 *****              1. Write a program which counts every time the mouse is pressed and outputs,                *****
 *****                                        via System.out.println,                                           *****
 *****                    the <x,y> coordinate and the count (e.g., 1st click at 51.0,85.0).                    *****
 ********************************************************************************************************************
 ********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class Chapter15_Part2_1 extends Application {

    // CLASS VARIABLE(s) declaration(s)
    private Pane pane;
    private int clickCounter = 0;
    private double xCor = 0;
    private double yCor = 0;


    public static void main(String[] args) {
        launch(args);
    }


    public void start(Stage primaryStage){
        // Initializing the Pane
        pane = new Pane();

        // Creating the Scene
        Scene scene = new Scene(pane, 500, 500);

        // MouseClicked EventHandler
        scene.setOnMouseClicked(e -> {
            clickCounter++;
            xCor = e.getX();
            yCor = e.getY();

            System.out.println("Click #: " + clickCounter + " at " + xCor + ", " + yCor);
        });

        // Setting the Title of the Stage, Setting the Scene to the Stage and Showing the Stage
        primaryStage.setTitle("Chapter 15, Part 2: Problem 1: Mouse Clicks - Number and Coordinates");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
