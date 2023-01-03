package com.demo.citizen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CitizenController {

	@RequestMapping("/test")
	public String Handler()
	{
		return "Hello";
		
	}
}
