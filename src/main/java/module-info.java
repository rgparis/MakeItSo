module xxxx.xxx.makeitso {
    requires javafx.controls;
    requires javafx.fxml;


    opens xxxx.xxx.makeitso to javafx.fxml;
    exports xxxx.xxx.makeitso;
}