/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Razer Blade
 */
public class ComputerList extends ArrayList<Computer> {
    
    Scanner sc= new Scanner(System.in);
    public int find(String id){
        for(int i = 0; i < this.size(); i++)
            if(id.equals(this.get(i).getId()))
                return i;
        return -1;
    }
    public void add(){
        String id, toCPU, toOS;
        int ram;
        Scanner sc = new Scanner(System.in);
        int pos;
        boolean valid = true;
        do{
            System.out.print("Enter the computer's id: ");
            id = sc.nextLine().toUpperCase();
            pos = find(id);
            valid = id.matches("^C\\d{3}$");
            if (pos>=0) System.out.println("This id existed.");
            if (!valid) System.out.println("Unvalided id.");
        }
        while(pos>=0 || !valid);
        System.out.print("Enter the computer's type of CPU: ");
        toCPU = sc.nextLine().toUpperCase();
        System.out.print("Enter the computer's type of OS: ");
        toOS = sc.nextLine().toUpperCase();
        System.out.print("Enter the computer's ram: ");
        ram = Integer.parseInt(sc.nextLine());
        Computer c = new Computer(id, toCPU, toOS, ram);
        this.add(c);
        System.out.println("New computer has been added.");
    }
    public void update(){
        if(this.isEmpty()){
            System.out.println("Empty List.");
            return;
        }
        String updatedID;
        boolean valid = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the id of updated computer: ");
            updatedID = sc.nextLine().toUpperCase();
            valid = updatedID.matches("^C\\d{3}$");
            if (!valid) System.out.println("Unvalided id.");
        }while(!valid);
        int pos = find(updatedID);
        if(pos<0) System.out.println("This computer does not exist.");
        else{
            String newToCPU, newToOS;
            int newRam;
            System.out.print("Enter the computer's type of CPU: ");
            newToCPU = sc.nextLine().toUpperCase();
            System.out.print("Enter the computer's type of OS: ");
            newToOS = sc.nextLine().toUpperCase();
            System.out.print("Enter the computer's ram: ");
            newRam = Integer.parseInt(sc.nextLine());
            Computer r = new Computer(updatedID, newToCPU, newToOS, newRam);
            this.set(pos, r);
        }
    }
    public void sort(){
        Collections.sort(this);
    }
    public void output(){
        System.out.println();
        if(this.isEmpty()){
            System.out.println("Empty List.");
            return;
        }
        System.out.println(" LIST OF COMPUTERS: ");
        System.out.println("=====================");
        for(int i=0; i < this.size(); i++)
            System.out.println(" " + this.get(i).toString());
        System.out.println(">>>>>>>>>>|<<<<<<<<<<<");
        System.out.println();
    }
}
