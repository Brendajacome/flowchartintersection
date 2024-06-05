module com.example.flowchartintersection {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.flowchartintersection to javafx.fxml;
    exports com.example.flowchartintersection;
}