import dto.StudentDTO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.time.LocalDate;

public class AppInitializer extends Application {
    public static void main(String args[]) {
        launch(args);

        /*StudentDTO s1 = new StudentDTO();

        s1.setStudentID("S001");
        s1.setName("Nethu");
        s1.setAddress("Galle");
        s1.setContactNo("0775408818");
        s1.setDOB(LocalDate.parse("2002-07-28"));
        s1.setGender("Female");

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(s1);

        transaction.commit();
        session.close();*/
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("view/LoginForm.fxml"))));
        primaryStage.setTitle("Hostel Management System");
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
