module cl.duoc.dsy1102.timecapsule {
    requires javafx.controls;
    requires javafx.fxml;


    opens cl.duoc.dsy1102.timecapsule to javafx.fxml;
    exports cl.duoc.dsy1102.timecapsule;
    exports cl.duoc.dsy1102.timecapsule.model;
    opens cl.duoc.dsy1102.timecapsule.model to javafx.fxml;
}