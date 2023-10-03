/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controller.Manager;
import java.util.ArrayList;
import model.Contact;
import view.Menu;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Contact> lc = new ArrayList<>();
        lc.add(new Contact(1, "Andrei Pahm", "Star", "Viet Nam", "1234567890", "Andrei", "Pahm"));
        lc.add(new Contact(2, "ThaoChi Desu", "Star", "Japan", "1234567890", "ThaoChi", "Desu"));
        lc.add(new Contact(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        //loop until user want to exit
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.createContact(lc);
                    break;
                case 2:
                    Manager.printAllContact(lc);
                    break;
                case 3:
                    Manager.deleteContactd(lc);
                    break;
                case 4:
                    return;
            }
        }
    }
}
