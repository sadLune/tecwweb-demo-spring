package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TarefasController {
	@RequestMapping("/")
	public String execute() {
		System.out.println("L�gica do MVC");
		return "info";
	}
}