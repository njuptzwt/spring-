package com.imook.spring;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloMvc{
@RequestMapping("/mvc")
public String HelloController()
{
	return "home";
}
}