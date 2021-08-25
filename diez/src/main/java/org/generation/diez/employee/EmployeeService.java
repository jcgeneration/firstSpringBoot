package org.generation.diez.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    //Comentado hasta vincular a la BD
//    @Autowired

    public final ArrayList<Employee> lista = new ArrayList<Employee>();
    public EmployeeService() {
        lista.add(new Employee("Juan", "Perez", "jperez@hotmail.com",
                25, "PEDJ960101231","Domicilio Conocido",150.0
                ,"RRHH"));
        lista.add(new Employee("Carmen", "Perez", "carmen.lizarde@hotmail.com",
                45, "LIPC9873435312","Su Casa",200.0
                ,"Clientes"));
    }//constructor
    public List<Employee> getEmployees(){
        return lista;
    }//getEmployees
    public Employee getEmployee(Long employeeId){
         return lista.get( employeeId.intValue()-1);
    }//getEmployee
    public void deleteEmployee(Long employeeId){
            if (employeeId<= lista.size()) {
                lista.remove(employeeId.intValue()-1);
            }//if
    }//deleteEmployee

    public void addEmployee(Employee employee) {
        lista.add(employee);
    }// addEmployee

    public void updateEmployee(Long employeeId, String lastName, int age, String rfc) {
        if (employeeId<= lista.size()) {
            Employee tmpEmp = lista.get(employeeId.intValue()-1);
            if (lastName != null) tmpEmp.setLastName(lastName);
            if (age > 0) tmpEmp.setAge(age);
            if (rfc != null) tmpEmp.setRfc(rfc);
        }//if
    }// updateEmployee

}//class EmployeeService
