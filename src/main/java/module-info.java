module com.example.programgroup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.programgroup to javafx.fxml;
    exports com.example.programgroup;
}