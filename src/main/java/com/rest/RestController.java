//package com.rest;
//
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@org.springframework.web.bind.annotation.RestController
//@RequestMapping("/users")
//public class RestController {
//	//@GetMapping
//	//public String getUsers() {
//		//return "get request sent successfully";
//	//}
//	@GetMapping
//	public String getUser(@RequestParam(value="id")int id,@RequestParam(value="limit")int limit) {
//		return ("get request sent successfully for id "+id+" and limit is "+limit);
//	} 
//
//	//@GetMapping(path = "/{userid}")
//	//public String getUser(@PathVariable String userid) {
//	//	return "get by id request sent successfully for "+userid;
////	}
//
//	@PostMapping
//	public String createUsers() {
//		return "insert request sent successfully";
//	}
//
//	@PutMapping
//	public String updateUsers() {
//		return "update request sent successfully";
//	}
//
//	@DeleteMapping
//	public String deleteUsers() {
//		return "get delete request sent successfully";
//	}
//
//	@DeleteMapping(path = "/{userid}")
//	public String deleteUser(@PathVariable String userid) {
//		return "delete by id request was sent for "+userid;
//	}
//}