package cl.duoc.dsy1102.timecapsule;



import cl.duoc.dsy1102.timecapsule.model.MensajeFuturo;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML private TableView<MensajeFuturo> tablaMensajes;
    @FXML private TableColumn<MensajeFuturo, String> colAutor;
    @FXML private TableColumn<MensajeFuturo, String> colTexto;
    @FXML private TableColumn<MensajeFuturo, String> colPlazo;
    @FXML private TableColumn<MensajeFuturo, String> colPorcentaje;

    private final ObservableList<MensajeFuturo> mensajes =
            FXCollections.observableArrayList();

    @FXML private void initialize() {
        colAutor.setCellValueFactory(c ->
                new ReadOnlyStringWrapper(c.getValue().getAutor())
        );
        colTexto.setCellValueFactory(c ->
                new ReadOnlyStringWrapper(c.getValue().getTexto())
        );
        colPlazo.setCellValueFactory(c ->
                new ReadOnlyStringWrapper(
                        c.getValue().getPlazoAnios() + " años")
        );
        colPorcentaje.setCellValueFactory(c ->
                new ReadOnlyStringWrapper(
                        c.getValue().getColPorcentaje() + " %")
        );
        tablaMensajes.setItems(mensajes);

        mensajes.add(new MensajeFuturo(
                "Valentina", "Nunca dejes de perseguir tus sueños.", 5, 50
        ));
        mensajes.add(new MensajeFuturo(
                "Carlos", "Recuerda de dónde comenzaste.", 10, 50
        ));
    }
}
