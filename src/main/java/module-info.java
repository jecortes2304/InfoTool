module com.cortestudios.infotool {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.cortestudios.infotool to javafx.fxml;
    exports com.cortestudios.infotool;
}