package cl.duoc.dsy1102.timecapsule;

import javafx.scene.control.*;

import cl.duoc.dsy1102.timecapsule.model.MensajeFuturo;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML private TextField campoAutor;
    @FXML private TextField campoTexto;
    @FXML private ComboBox<Integer> campoPlazo;
    @FXML private ComboBox<Integer> campoPorcentaje;
    @FXML private Label estadoRegistro;

    @FXML private TableView<MensajeFuturo> tablaMensajes;
    @FXML private TableColumn<MensajeFuturo, String> colAutor;
    @FXML private TableColumn<MensajeFuturo, String> colTexto;
    @FXML private TableColumn<MensajeFuturo, String> colPlazo;
    @FXML private TableColumn<MensajeFuturo, String> colPorcentaje;

    private final ObservableList<MensajeFuturo> mensajes =
            FXCollections.observableArrayList();

    @FXML private void initialize() {

        campoPlazo.getItems().setAll(1, 5, 10);
        campoPlazo.setValue(5);
        campoPorcentaje.getItems().setAll(10,50,100);
        campoPorcentaje.setValue(50);

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

    @FXML private void agregarMensaje() {
        String autor = campoAutor.getText().trim();
        String texto = campoTexto.getText().trim();

        if (autor.isBlank() || texto.isBlank()) {
            estadoRegistro.setText("Debes completar el autor y el mensaje.");
            return;
        }

        MensajeFuturo nuevo = new MensajeFuturo( autor, texto, campoPlazo.getValue(), campoPorcentaje.getValue());
        mensajes.add(nuevo);
    }
}
