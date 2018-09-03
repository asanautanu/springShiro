package controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

//	@RequestMapping("/")
//	public String home() {
//		return "index";
//	}
	
	@RequestMapping("/parametro/{param1}")
	public ModelAndView param(@PathVariable("param1") String param, Model model) {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("index");
		modelAndView.addObject("param1", param);
		modelAndView.addObject("edad", "24");
		return modelAndView;
		
//		return new ModelAndView("index", "param", param);
		
	}
	
	
}
