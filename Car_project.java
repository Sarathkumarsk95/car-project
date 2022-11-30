/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car_project;

/**
 *
 * @author Dell
 */
public class Car_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Car Renault=new Car();
        Renault.Car_brand="Renault";
        Renault.Car_model="Rapid";
        Renault.Engine_no="225567";
        Renault.Chase_no="88738";
        Renault.get_details();
        Car Audi=new Car();
        Audi.Car_brand="Audi";
        Audi.Car_model="A5";
        Audi.Engine_no="225777";
        Audi.Chase_no="82238";
        Audi.get_details();
        
        }
}

        
    
    

