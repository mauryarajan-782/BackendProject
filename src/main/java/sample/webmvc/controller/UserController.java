package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import sample.webmvc.service.UserService;


@Controller
public class UserController {
	
	private UserService userService;

//	@RequestParam Can read Query Parameter
	@GetMapping("/")
	public String greet(@RequestParam(name = "user", defaultValue = "GuestUser") String user, Model model) {
		System.out.println("UserController.greet: "+user);
		
		model.addAttribute("user", user);
		
		return "welcome";
	}
	
	
	
	@GetMapping("/login")
	public String login(){
		System.out.println("UserController.login()");
		return "login";
	}
	
	
	@GetMapping("/path/{id}")
	public String pathVariable(@PathVariable(name = "id") int id){
		System.out.println("UserController.pathVariable : "+id);
		return "welcome";
	}
	
	

	@PostMapping("/login")
	public String userlogin(@RequestParam(name = "username") String username,@RequestParam(name = "password") String password, Model model){
		
		System.out.println("UserController.userLogin : " +username);
		System.out.println("UserController.userLogin : " + password);
		
		model.addAttribute("username", username);
		model.addAttribute("password", password);
		
		return "profile";
	}
	
}
