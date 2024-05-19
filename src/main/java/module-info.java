module com.mycompany.proyectobootstrap5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyectobootstrap5 to javafx.fxml;
    exports com.mycompany.proyectobootstrap5;
    requires org.kordamp.bootstrapfx.core;
}
