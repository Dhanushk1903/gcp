package com.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Custcontroller {
@GetMapping("/")
public String fun() {
	return "hello world";
	
}

}
