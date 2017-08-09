/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PE;

/**
 *
 * @author Razer Blade
 */
public class ComputerListUse {
    public static void main(String[] args) {
        Menu menu = new Menu(3);
        menu.add("Add new computer");
        menu.add("Update computer based on ID");
        menu.add("Print the list in ascending order of IDs");
        int choice;
        ComputerList list = new ComputerList();
        do {
            System.out.println("COMPUTER MANAGER");
            choice = menu.getChoice();
            switch(choice){
               case 1: list.add(); break;
               case 2: list.update();break;
               case 3: list.sort(); list.output();break;
            }        
        }while (choice>=1 && choice<=3);
    }
}
