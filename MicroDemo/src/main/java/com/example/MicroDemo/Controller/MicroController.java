package com.example.MicroDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroDemo.Model.Address;
import com.example.MicroDemo.Model.Response;
import com.example.MicroDemo.Model.User;
import com.example.MicroDemo.Repository.UserRepo;


@RestController
@RequestMapping(path="/users")
public class MicroController {
	
		@Autowired
		private  UserRepo userRepo;
		
//		@PostMapping("/addUser")
//		public  String saveUser(@RequestBody User user) {
//			userRepo.save(user);
//			return "User added successfully.";	
//		}
		
		@PostMapping("/addUser")
		public ResponseEntity<Response> addUser(@RequestParam int userId,@RequestParam String name,@RequestParam String phoneNo,@RequestParam String email,
				@RequestParam String addressLine,@RequestParam String city,@RequestParam String state,@RequestParam String zipCode){
			
				Address a = new Address(addressLine,city,state,zipCode);
				User u = new User(userId,name,phoneNo,email,a);
				
				userRepo.save(u);
				
				Response r= new Response(101,"User "+name+" saved succussfully",null);
				return new ResponseEntity<Response>(r,HttpStatus.ACCEPTED);
			
		}
//		@GetMapping("/findAllUser")
//		public  List<User> getUser() {
//			return userRepo.findAll();
//		}	
		@GetMapping("/all")
		public ResponseEntity<List<User>> getAllUsers(){
			List<User> l = userRepo.findAll();
			return new ResponseEntity<>(l,HttpStatus.OK);
		}
		
//		@PutMapping()
//		public ResponseEntity<>
	
//		@DeleteMapping("/delete/{id}")
//		public String deleteUser(@PathVariable int id) {
//			userRepo.deleteById(id);
//			return "Deleted Successfully";
//		}
}
