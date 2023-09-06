package com.example.contactbook;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private VBox contactsLayout;
    private List<Contact> contacts;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        contacts = new ArrayList<>(contacts());

        try {

            for (Contact contact : contacts){

                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(getClass().getResource("Contact.fxml"));
                HBox cardBox = fxmlLoader.load();
                ContactController contactController = fxmlLoader.getController();
                contactController.setData(contact);
                contactsLayout.getChildren().add(cardBox);
            }

        }catch (Exception e){
            e.printStackTrace();
        }


    }

    private List<Contact> contacts(){
        contacts = new ArrayList<>();

        Contact contact = new Contact();
        contact.setName("Andreea Andrea");
        contact.setPhoneNumber("+49**********");
        contact.setEmail("andreeaAndreea@gmail.com");
        contacts.add(contact);

        contact = new Contact();
        contact.setName("Alexis Hagstorm");
        contact.setPhoneNumber("+49**********");
        contact.setEmail("alexisHagstorm@gmail.com");
        contacts.add(contact);

        contact = new Contact();
        contact.setName("Diana Victoria");
        contact.setPhoneNumber("+49**********");
        contact.setEmail("dianaVictoria1234@gmail.com");
        contacts.add(contact);

        contact = new Contact();
        contact.setName("Audrey James");
        contact.setPhoneNumber("+49**********");
        contact.setEmail("audreyJames@gmail.com");
        contacts.add(contact);

        contact = new Contact();
        contact.setName("Patrick Star");
        contact.setPhoneNumber("+49**********");
        contact.setEmail("patrickStar1234@gmail.com");
        contacts.add(contact);

        return contacts;
    }
}
