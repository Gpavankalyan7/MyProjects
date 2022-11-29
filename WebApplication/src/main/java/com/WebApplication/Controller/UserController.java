package com.WebApplication.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.WebApplication.Model.User;
import com.WebApplication.Repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@RequestMapping(value="/")
	public String home()
	{
		return "reg";
	}
	
	@RequestMapping(value="/reg",method=RequestMethod.POST)
	public String reg(@RequestParam Integer id,String name,@RequestParam String email,@RequestParam String passward,User user,Model model)
	{
		model.addAttribute(name);
		model.addAttribute(email);
		model.addAttribute(passward);
		User user1=userRepo.save(user);
		
		return "msg";
	}
}
