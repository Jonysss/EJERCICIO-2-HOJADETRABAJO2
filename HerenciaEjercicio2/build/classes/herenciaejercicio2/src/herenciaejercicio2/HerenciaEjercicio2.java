/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciaejercicio2;

/**
 *
 * @author Usuario
 */
public class HerenciaEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     Employee employee = new Employee("OSVALDO SEQUEN",13,81000); 
      employee.printData();   
        
     Programmer programmer = new Programmer("HTML","Joel ",13,24000); 
      programmer.printData();
        
       DatabasePro databasepro = new DatabasePro("Datassss","Estuardo ",15,5661); 
      databasepro.printData();
      
    }
    
}
