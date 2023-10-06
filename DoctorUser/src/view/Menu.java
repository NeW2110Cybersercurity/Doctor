/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import common.Validate;
import controller.Manager;
import java.util.ArrayList;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class Menu {

    public static int menu() {
        ArrayList<Doctor> ld = new ArrayList<>();
        System.out.println("1. Add doctor");
        System.out.println("2. Update doctor");
        System.out.println("3. Delete doctor");
        System.out.println("4. Search doctor");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validate.checkInputIntLimit(1, 5);
        return choice;
//        while (true) {
//            choice = Menu.menu();
//            switch (choice) {
//                case 1:
//                    Manager.addDoctor(ld);
//                    break;
//                case 2:
//                    Manager.updateDoctor(ld);
//                    break;
//                case 3:
//                    Manager.deleteDoctor(ld);
//                    break;
//                case 4:
//                    Manager.searchDoctor(ld);
//                    break;
//                case 5:
//                    break;
//            }
//            return choice;
//        }
//    }
    }
}
