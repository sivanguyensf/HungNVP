/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PE;

import java.util.Scanner;
/**
 *
 * @author Razer Blade
 */
public class Computer implements Comparable<Computer>{
    String id="", toCPU="", toOS="";
    int ram=0;
    public Computer() {
        this.id=""; this.toCPU=""; this.toOS=""; this.ram=0;
    }
    public Computer(String id, String toCPU, String toOS, int ram){
        this.id = id;
        this.toCPU = toCPU;
        this.toOS = toOS;
        this.ram = ram;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getToCPU() {
        return toCPU;
    }

    public void setToCPU(String toCPU) {
        this.toCPU = toCPU;
    }

    public String getToOS() {
        return toOS;
    }

    public void setToOS(String toOS) {
        this.toOS = toOS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    public String toString(){
        return id + " - " + toCPU + " - " + toOS + " - " + ram;
    }
    @Override
    public int compareTo(Computer cmpComputer){
        if(this.getId().compareTo(cmpComputer.getId())>0)
            return 1;
        else 
            if(this.getId().compareTo(cmpComputer.getId())<0)
                return -1;
            else
                return 0;
    }
    
}
