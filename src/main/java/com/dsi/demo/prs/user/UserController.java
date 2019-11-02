package com.dsi.demo.prs.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@RequestMapping(path="/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping()
	public @ResponseBody Iterable<User> GetAll() {
		return userRepository.findAll();
	}
}
