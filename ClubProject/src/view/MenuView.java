/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import model.ClubManager;

/**
 *
 * @author Umaporn
 */
public class MenuView {

    public static void menu() {
        ClubManager cm = new ClubManager();
        int menuId;
        do {
            System.out.println("<<Main Menu>>");
            System.out.println("1. New Club ");
            System.out.println("2. Membership Subscribe ");
            System.out.println("3. Edit Membership Information");
            System.out.println("4. Membership Unsubscribe ");
            System.out.println("5. List Members ");
            System.out.println("6. Exit ");

            
            System.out.print("Enter your menu [1-6]: ");
            Scanner sc = new Scanner(System.in);
            menuId = sc.nextInt();
            switch (menuId) {
                case 1:
                    cm.newClub();
                    break;
                case 2:
                    cm.subscribe();
                    break;

                case 3:
                    cm.editInfo();
                    break;
                case 4:
                    cm.unsubscribe();
                    break;
                case 5:
                    cm.listMembers();
                    break;
                case 6:
                    System.out.println("Good Bye!");
            }
        } while (menuId != 6);
    }

    public static void main(String[] args) {
        menu();
    }
}
