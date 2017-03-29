package command;

import model.employee;
import org.springframework.context.annotation.Scope;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pmtu on 3/29/2017.
 */
@Scope("session")
public class employeeCommand implements Serializable{

    private List<employee> employees=new ArrayList<employee>();

    public employeeCommand() {
    }

    public List<employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<employee> employees) {
        this.employees = employees;
    }
}
