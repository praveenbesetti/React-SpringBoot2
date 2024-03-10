package com.example.demo.Controller;
import com.example.demo.Repository.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Users.Users;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
@RequestMapping("/drive-in-cars")
@CrossOrigin(origins= "*")
public class UserController{

	 @Autowired
	private UserRepository userRepository;
	 
	 @PostMapping
	 public Users newUser(@RequestBody Users newUsers)
	 {
		 userRepository.save(newUsers);
		return newUsers;
	 }
	 
	 @GetMapping
	public List<Users> getAllusers()
	 {
		 return userRepository.findAll();
	 }
	
	 @DeleteMapping("{mobile}")
	 public boolean deleteuser(@PathVariable Long mobile) {
	     userRepository.deleteById(mobile);
	     return true;
	 }
}
