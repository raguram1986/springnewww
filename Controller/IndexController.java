package com.example.studentmanagement.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.studentmanagement.Domain.Course;
import com.example.studentmanagement.Domain.StudenDAO;
import com.example.studentmanagement.Domain.Student;
import com.example.studentmanagement.Repository.StudentRepository;
import com.example.studentmanagement.Service.CourseService;
import com.example.studentmanagement.Service.StudentService;


@Controller
@RequestMapping("/")
public class IndexController {
	
	 @Autowired
	 private CourseService service;
	 @Autowired
	 private StudentService services;
	 
	 

	 
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index()
    {
       return "index";
    }
	

	@RequestMapping(value = "/course", method = RequestMethod.GET)
 	public String viewHomePage(Model model) 
	{
		     List<Course> listcourse = service.listAll();
		     model.addAttribute("listcourse", listcourse);
		     System.out.print("Get / ");	
		     return "course";
	 }
	
    @RequestMapping(value = "/student", method = RequestMethod.GET)
	 public String viewStudentPage(Model model) 
	{
				List<StudenDAO> li= new ArrayList<>();
				for(Object[] o : StudentRepository.findStudent()){
					StudenDAO student =new StudenDAO();
				student.setId(Long.parseLong(String.valueOf(o[0])));
				student.setStname((String) o[1]);
				student.setCoursename((String) o[2]);
				li.add(student);
				model.addAttribute("liststudent", li);




}
				return "student";


	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	   //  System.out.print(oauthUser.getUsername());
	 }
 
 
}
