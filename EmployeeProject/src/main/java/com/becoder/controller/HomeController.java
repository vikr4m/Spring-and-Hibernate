package com.becoder.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.becoder.entity.Emp;
import com.becoder.entity.User;
import com.becoder.dao.EmpDao;
import com.becoder.dao.UserDao;

@Controller
public class HomeController {
	
	@Autowired
	private EmpDao empDao;

	@Autowired
	private UserDao userDao;
	
	@RequestMapping(path = "/home")
	public String home(Model m) {
		
		List<Emp> list =  empDao.getAllEmp();
		m.addAttribute("empList",list);
		
		return "home";
	}
	
	@RequestMapping(path = "/add_emp")
	public String addEmp() {
		return "add_emp";
	}
	
	@RequestMapping(path="/createEmp", method = RequestMethod.POST)
	public String createEmp(@ModelAttribute Emp emp, HttpSession session) {
		System.out.println(emp);
		
		int i = empDao.saveEmp(emp);
		session.setAttribute("msg","Registration Successful");
		return "add_emp";
	}
	
	@RequestMapping(path="/editEmp/{id}")
	public String editEmp(@PathVariable int id, Model m) {
		
		Emp emp = empDao.getEmpById(id);
		m.addAttribute("emp",emp);
		
		return "edit_emp";
	}
	
	@RequestMapping(path="/updateEmp", method = RequestMethod.POST)
	public String updateEmp(@ModelAttribute Emp emp,HttpSession session) {
		empDao.update(emp);
		session.setAttribute("msg","Updated Successfully..");
		return "redirect:/home";
	}
	
	@RequestMapping("/deleteEmp/{id}")
	public String deleteEmp(@PathVariable int id,HttpSession session) {
		
		empDao.deleteEmp(id);
		session.setAttribute("msg", "Employee Deleted Successfully..");
		return "redirect:/home";
	}
	
	@RequestMapping(path="/register")
	public String registerPage() {
		
		return "register";
	}
	
	@RequestMapping(path="/login")
	public String loginPage() {
		
		return "login";
	}
	
	@RequestMapping(path="/createUser", method = RequestMethod.POST)
	public String register(@ModelAttribute User user, HttpSession session) {
		System.out.println(user);
		
		userDao.saveUser(user);
		session.setAttribute("msg","User Registered Successfully..");
		
		return "redirect:/register";
	}
	
	@RequestMapping(path="/userlogin", method = RequestMethod.POST)
	public String login(@RequestParam("email") String em, @RequestParam("password") String pwd, HttpSession session ) {
		User user = userDao.loginUser(em,pwd);
		
		if(user != null) {
			session.setAttribute("loginuser", user);
			return "profile";
		}else {
			session.setAttribute("msg","Invalid email or password");
			return "redirect:/login";
		}
		
	}
}
