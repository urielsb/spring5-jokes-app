package guru.springframework.joke.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.joke.services.JockerServices;

@Controller
public class JockeController {

	private final JockerServices jockerServices;

	public JockeController(JockerServices jockerServices) {
		super();
		this.jockerServices = jockerServices;
	}
	
	@RequestMapping({"/", ""})
	public String showJocke(Model model) {
		model.addAttribute("joke", jockerServices.getJocke());
		return "chucknorris";
	}
	
}
