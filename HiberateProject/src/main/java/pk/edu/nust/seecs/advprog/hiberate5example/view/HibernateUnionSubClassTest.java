/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pk.edu.nust.seecs.advprog.hiberate5example.view;

import pk.edu.nust.seecs.advprog.hiberate5example.bo.EmployeeBo;
import pk.edu.nust.seecs.advprog.hiberate5example.bo.impl.EmployeeBoImpl;
import pk.edu.nust.seecs.advprog.hiberate5example.dao.EmployeeDao;


public class HibernateUnionSubClassTest {
    private EmployeeBo employeeHandler = new EmployeeBoImpl();
    

    public static void main(String[] args) {
        HibernateUnionSubClassTest hbt = new HibernateUnionSubClassTest();
        hbt.doAll();
        EmployeeDao obj = new EmployeeDao();
        obj.printEmployees();

    }
    

    public void doAll(){
        int emp1Id = employeeHandler.addEmployee("abdullah ");
        int emp2Id = employeeHandler.addEmployee("sikander");
        int emp3Id = employeeHandler.addEmployee("ehsan");
        int emp4Id = employeeHandler.addEmployee("ebaad");
        

        employeeHandler.addContractEmployee(emp1Id, 0.3f , "1 year");
        employeeHandler.addContractEmployee(emp2Id, 0.3f , "1 year");
        employeeHandler.addContractEmployee(emp3Id, 0.2f , "1 year");
        employeeHandler.addContractEmployee(emp4Id, 0.6f , "2 years");
        
        employeeHandler.saveEmployees();
    }
}
