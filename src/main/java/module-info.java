module com.mycompany.loan_control {
    requires transitive javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;   
    requires javafx.media;
    requires java.sql;
    requires javafx.base;
    requires java.base;
    requires org.aspectj.runtime;
    requires org.hibernate.orm.core;
    requires org.hibernate.commons.annotations;
    requires transitive java.persistence;
    requires java.dotenv;
    requires java.fluent.validator;
    requires transitive com.google.guice;
    requires javax.inject;

    opens com.mycompany.loan_control.entities to org.hibernate.orm.core;
    exports com.mycompany.loan_control;
    exports com.mycompany.loan_control.controllers.books;
    exports com.mycompany.loan_control.controllers.user;
    exports com.mycompany.loan_control.controllers.menuadmin;
    exports com.mycompany.loan_control.controllers.menuuser;
    exports com.mycompany.loan_control.controllers.home;
    exports com.mycompany.loan_control.dbContext;
    exports com.mycompany.loan_control.entities;
    exports com.mycompany.loan_control.entities.request;
    exports com.mycompany.loan_control.entities.response;
    exports com.mycompany.loan_control.services;
    exports com.mycompany.loan_control.utils;
    exports com.mycompany.loan_control.utils.components;
    exports com.mycompany.loan_control.data;
    exports com.mycompany.loan_control.data.jpa;
    exports com.mycompany.loan_control.interfaces.repository;
    exports com.mycompany.loan_control.interfaces.impl;
    exports com.mycompany.loan_control.validations.books; 
}
