package kg.iaau.edu.com.controller;

import kg.iaau.edu.com.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    StudentDao studentDao;

    @RequestMapping("/")
    public String showHome()
    {
        return "index";
    }

    @RequestMapping("/aboutus")
    public String showStudent()
    {
        return "about";
    }

}
