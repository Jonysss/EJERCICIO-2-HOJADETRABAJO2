/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciaejercicio2;

/**
 *
 * @author Usuario
 */
public class DatabasePro extends Employee{
    private String databaseTool;
    
    public DatabasePro (String name, int age, double salary){
    super(name,age,salary);
}

    public DatabasePro(String databaseTool, String name, int age, double salary) {
        super(name, age, salary);
        this.databaseTool = databaseTool;
    }

    public String getDatabaseTool() {
        return databaseTool;
    }
 public void printData () {
            System.out.println("Name: "+getName()+
                    "\nage:  "+ getAge()+
                     "\nsalary: "+ getSalary()+
                    "\nDatabaseTool: "+ getDatabaseTool());
}      
    
}


