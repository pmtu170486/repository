package controller;

import command.employeeCommand;
import model.employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pmtu on 3/29/2017.
 */
@Controller
public class homeController {

    @RequestMapping(value = "/list")
    public ModelAndView list(@ModelAttribute("items")employeeCommand command)
    {
        ModelAndView mav=new ModelAndView("test");
        List<employee> list=new ArrayList<employee>();
        list.add(new employee("nva","tp hcm"));
        list.add(new employee("nvb","long an"));
        command.setEmployees(list);
        mav.addObject("command",command);
        return  mav;
    }
    @RequestMapping(value = "/view")
    public ModelAndView view(@ModelAttribute("items")employeeCommand command)
    {
        ModelAndView mav=new ModelAndView("welcome");
        List<employee> list=command.getEmployees();
        mav.addObject("listResult",list);
        return  mav;
    }
}
