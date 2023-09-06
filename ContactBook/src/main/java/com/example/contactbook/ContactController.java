package com.example.contactbook;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class ContactController {

    @FXML
    private HBox box;
    @FXML
    private Label Name, phoneNumber, email;

    public void setData(Contact contact){

        Name.setText(contact.getName());
        email.setText(contact.getEmail());
        phoneNumber.setText(contact.getPhoneNumber());
    }

}
