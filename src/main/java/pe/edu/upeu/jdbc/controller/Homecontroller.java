package pe.edu.upeu.jdbc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Homecontroller {
@RequestMapping
public String index() {
	return "index";
}
}
