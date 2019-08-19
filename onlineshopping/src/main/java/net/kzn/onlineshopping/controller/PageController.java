package net.kzn.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
	@RequestMapping(value = {"/", "/home", "index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
		
		mv.addObject("greeting","Welcome To Spring MVC"); 
		
		return mv;
	
	}
	
	//URL : http://localhost:8080/onlineshopping/test?greeting=Hi%20Indra
//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam("greeting")String greeting){ // parameternya greeting
//		
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke dispatcher-servlet.xml -> page.jsp
//		mv.addObject("greeting",greeting); // -> nama parameternya greeting
//		return mv;
//	
//	}
	
	//URL : http://localhost:8080/onlineshopping/test
//	@RequestMapping(value = {"/test"})
//	public ModelAndView test(@RequestParam(value="greeting", required=false)
//	String greeting){ // kata2 greeting divalue parameternya greeting diURL (?greeting) 
//		if(greeting == null){
//			greeting = "Hello there"; // kalo cuma ini http://localhost:8080/onlineshopping/test
//		}
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//		mv.addObject("greeting",greeting); // -> nama parameternya greeting
//		return mv;
//	
//	}
	
	
	// URL : http://localhost:8080/onlineshopping/aha/hell
//		@RequestMapping(value = {"/aha/{greeting}"})
//		public ModelAndView aha(@PathVariable("greeting") // lebih mudah nambahin kata-kata setelah link variabelnya 
//		String greeting){ // 
//			if(greeting == null){
//				greeting = "Hello there";
//			}
//			ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//			mv.addObject("greeting",greeting); // -> nama parameternya greeting
//			return mv;
//	
//		}
	
	
}
