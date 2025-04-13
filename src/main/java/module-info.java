module com.novalearn {
    // JavaFX
    requires javafx.controls;
    requires javafx.fxml;

    // JPA / Hibernate
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires jakarta.validation;

    // Open FXML controller packages for reflection
    opens com.novalearn.controller.user to javafx.fxml;
    opens com.novalearn.controller.quiz to javafx.fxml;
    opens com.novalearn.controller.question to javafx.fxml;
    opens com.novalearn.controller.submission to javafx.fxml;

    // Open entities for Hibernate
    opens com.novalearn.entity to org.hibernate.orm.core;

    // Export application package if you need to reference from outside
    exports com.novalearn.application;
    exports com.novalearn.entity;
}
