/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejercicio2;

/**
 *
 * @author Usuario
 */
public class Programmer extends Employee{
    
    private String lenguage;
    public Programmer (String name, int age, double salary){
    super(name,age,salary);
  
 
    }

    public Programmer(String lenguage, String name, int age, double salary) {
        super(name, age, salary);
        this.lenguage = lenguage;
    }

    public String getLenguage() {
        return lenguage;
    }
    
  public void printData () {
            System.out.println("Name: "+getName()+
                    "\nage:  "+ getAge()+
                     "\nsalary: "+ getSalary()+
                    "\nLenguaje: "+ getLenguage());
}   
    
}
