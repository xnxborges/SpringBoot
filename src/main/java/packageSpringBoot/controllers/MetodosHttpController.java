package packageSpringBoot.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {

	 @GetMapping
	 public String get() {
		 return "Requisição Get";
	 }
	 
	 @PostMapping
	 public String post() {
		 return "Requisição Post";
	 }
	 
	 @PatchMapping
	 public String patch() {
		 return "Requisição patch";
	 }
	 
	 @PutMapping
	 public String put() {
		 return "Requisição put";
	 }
	 
	 @DeleteMapping
	 public String delete() {
		 return "Requisição delete";
	 }
}
