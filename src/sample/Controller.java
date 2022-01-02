package sample;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller  implements Initializable {

    @FXML
    private Button logoutButton;
    @FXML
    private Button saveButton;
    @FXML
    private AnchorPane scenePane;
    @FXML
    private AnchorPane savePane;

    @FXML
    private ImageView myImage;

    @FXML
    private ImageView myorc;


    @FXML
    private ImageView mycoin;

    @FXML
    private ImageView myaxe;

    @FXML
    private ImageView myshuriken;




    private Stage stage;
    private Scene scene;
    private Parent root;
    Scene sc;


    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
        // translate
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(myImage);
        translate.setDuration(Duration.millis(800));
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setByY(-110);
        translate.setAutoReverse(true);
        translate.play();


        TranslateTransition trans = new TranslateTransition();
        trans.setNode(myorc);
        trans.setDuration(Duration.millis(700));
        trans.setCycleCount(TranslateTransition.INDEFINITE);
        trans.setByY(-150);
        trans.setAutoReverse(true);
        trans.play();


        // rotate
        RotateTransition rotat = new RotateTransition();
        rotat.setNode(mycoin);
        rotat.setDuration(Duration.millis(2000));
        rotat.setCycleCount(TranslateTransition.INDEFINITE);
        rotat.setInterpolator(Interpolator.LINEAR);
        rotat.setByAngle(360);
        rotat.setAxis(Rotate.Y_AXIS);
        rotat.play();


        RotateTransition shuriken = new RotateTransition();
        shuriken.setNode(myshuriken);
        shuriken.setDuration(Duration.millis(2000));
        shuriken.setCycleCount(TranslateTransition.INDEFINITE);
        shuriken.setInterpolator(Interpolator.LINEAR);
        shuriken.setByAngle(360);
        shuriken.setAxis(Rotate.Z_AXIS);
        shuriken.play();

        RotateTransition axe = new RotateTransition();
        axe.setNode(myaxe);
        axe.setDuration(Duration.millis(2000));
        axe.setCycleCount(TranslateTransition.INDEFINITE);
        axe.setInterpolator(Interpolator.LINEAR);
        axe.setByAngle(360);
        axe.setAxis(Rotate.Y_AXIS);
        axe.play();



    }





        public void screen(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void highscore(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("highscore.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void play(ActionEvent event) throws IOException
    {
        //myimage.setImage(myImage);
        Parent root = FXMLLoader.load(getClass().getResource("play.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void exit(ActionEvent event) {


            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You're about to QUIT!");
            alert.setContentText("Are you sure you want to exit? ");

            if(alert.showAndWait().get() == ButtonType.OK){
                stage = (Stage) scenePane.getScene().getWindow();
                System.out.println("You successfully logged out!");
                stage.close();
            }

        }


    public void loading(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("loading.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void pause(ActionEvent event) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("paused.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void save(ActionEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Save Progress");
        alert.setHeaderText("You're about to save your progress");
        alert.setContentText("Are you sure you want to save? ");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage = (Stage) savePane.getScene().getWindow();
            System.out.println("You successfully saved your progress");
           //stage.close();
        }
    }

    //public void initialize(ActionEvent actionEvent)

}
