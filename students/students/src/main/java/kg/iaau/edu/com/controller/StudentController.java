package kg.iaau.edu.com.controller;

import com.sun.org.apache.regexp.internal.RE;
import kg.iaau.edu.com.dao.StudentDao;
import kg.iaau.edu.com.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

    @Autowired
    StudentDao studentDao;

    @RequestMapping("/students")
    public String showHome(ModelMap model)
    {
        model.addAttribute("students", studentDao.getStudents());

        return "students";
    }

    @RequestMapping("/getStudent")
    public String showStudent(ModelMap model, @RequestParam("id") int id)
    {
        model.addAttribute("student", studentDao.getStudent(id));

        return "student";
    }

    @RequestMapping("/addStudent")
    public String addStudent()
    {
        return "createStudent";
    }

    @RequestMapping(value = "/createStudent", method = RequestMethod.POST)
    public String createStudent(Student student)
    {

        studentDao.create(student);

        return "redirect:students";
    }
}
