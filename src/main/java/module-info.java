module com.xalagor.greenfield {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.xalagor.greenfield to javafx.fxml;
    exports com.xalagor.greenfield;
}