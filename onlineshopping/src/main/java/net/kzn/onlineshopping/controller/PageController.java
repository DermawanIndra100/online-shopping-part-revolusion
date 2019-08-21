package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/", "/home", "index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp & dispatcherservlet
		mv.addObject("title","Home"); //-> larinya page.jsp
		mv.addObject("categories", categoryDAO.list()); 
		mv.addObject("userClickHome",true); //-> larinya page.jsp
		return mv;
	
	}
	
	@RequestMapping(value = "/about")
	public ModelAndView about(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","About Us");
		mv.addObject("userClickAbout",true);
		return mv;
	}
	
	@RequestMapping(value = "/contact")
	public ModelAndView contact(){
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Contact Us");
		mv.addObject("userClickContact",true);
		return mv;
	}
	
	
	//load category products
			@RequestMapping(value = "/show/all/products" )
			public ModelAndView showAllProducts(){
				ModelAndView mv = new ModelAndView("page");
				mv.addObject("title","All Products");
				
				//passing the list of categories
				mv.addObject("categories", categoryDAO.list());
				
				mv.addObject("userClickAllProducts",true);
				return mv;
			}
			
			@RequestMapping(value = "/show/category/{id}/products" )
			public ModelAndView showCategoryProducts(@PathVariable("id") int id){
				ModelAndView mv = new ModelAndView("page"); 
				
				// categoryDAO to fetch a single category
				Category category = null;
				
				category = categoryDAO.get(id);
				
				mv.addObject("title",category.getName());
				
				//passing the list of categories
				mv.addObject("categories", categoryDAO.list());
				
				//passing the single category object
				mv.addObject("category", category);
				
				mv.addObject("userClickCategoryProducts",true);
				return mv;
			}
		
	
	
//	@RequestMapping(value = {"/", "/home", "index"})
//	public ModelAndView index(){
//		
//		ModelAndView mv = new ModelAndView("page"); // -> larinya ke page.jsp
//		
//		mv.addObject("greeting","Welcome To Spring MVC"); 
//		
//		return mv;
//	
//	}
	
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
