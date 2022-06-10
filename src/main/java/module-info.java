module com.example.workedchat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.workedchat to javafx.fxml;
    exports com.example.workedchat;
}