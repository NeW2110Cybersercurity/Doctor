/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import controller.Manager;
import java.util.ArrayList;
import model.Doctor;
import view.Menu;

public class Main {

    public static void main(String[] args) {
        ArrayList<Doctor> ld = new ArrayList<>();
        //loop until user want to exit
        while (true) {
            int choice = Menu.menu();
            switch (choice) {
                case 1:
                    Manager.addDoctor(ld);
                    break;
                case 2:
                    Manager.updateDoctor(ld);
                    break;
                case 3:
                    Manager.deleteDoctor(ld);
                    break;
                case 4:
                    Manager.searchDoctor(ld);
                    break;
                case 5:
                    return;
//            }

            }
        }
    }
}
