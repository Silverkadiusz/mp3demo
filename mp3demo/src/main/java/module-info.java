module mp3demo {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.fxml;
    requires jid3lib;

    exports main to javafx.graphics;
    opens controller to javafx.fxml;
    opens mp3 to javafx.base;
}