
package org.generation.diez.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="api/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }//constructor

    @GetMapping
    public List<Employee> getEmployees() {
            return employeeService.getEmployees();
    } // getEmployees

    // api/employee/1
    @GetMapping(path = "{employeeId}")
    public Employee getEmployee(@PathVariable ("employeeId")
            Long employeeId ) {
        return employeeService.getEmployee(employeeId);
    } // getEmployee

    // api/employee/1
    @DeleteMapping(path = "{employeeId}")
    public void deleteEmployee(@PathVariable ("employeeId")
                                        Long employeeId ) {
        employeeService.deleteEmployee(employeeId);
    } // deleteEmployee

    @PostMapping
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    } //addEmployee

    @PutMapping (path = "{employeeId}")
    public void updateEmployee (@PathVariable ("employeeId")Long employeeId,
                                   @RequestParam(required=false) String lastName,
                               @RequestParam(required=false) int age,
                               @RequestParam(required=false) String rfc) {
        employeeService.updateEmployee(employeeId, lastName, age, rfc);
    } //updateEmployee

}//class EmployeeController
