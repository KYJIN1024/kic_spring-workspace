package config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class ConfigControllor4 {
	
	/*
	@RequestMapping("/form.do")
	public ModelAndView handleRequest1() {
	
		
		// TODO Auto-generated constructor stub
			ModelAndView modelAndView new ModelAndView();
			modelAndeView.setViewName("form");
			return modelAndView;
		}
	
	@RequestMapping("/form_ok.do" , method=RequestMethod.POST)
	public ModelAndView form_post_ok() {
		System.out.println("form_post_ok() 호출" );
		
		ModelAndView modelAndView new ModelAndView();
		modelAndeView.setViewName("form_ok");
		return modelAndView;
	}
	
	@GetMapping("/form_ok.do")
	//, method=RequestMethod.POST)
	public ModelAndView form_post_ok() {
		System.out.println("form_post_ok() 호출" );
		
		ModelAndView modelAndView new ModelAndView();
		modelAndeView.setViewName("form_ok");
		return modelAndView;
	}
	@PostMapping("/form_ok.do") 
	//@RequestMapping( value="/form_ok.do", method=RequestMethod.POST)
	public ModelAndView form_post_ok() {
		System.out.println("form_post_ok() 호출" );
		
		ModelAndView modelAndView new ModelAndView();
		modelAndeView.setViewName("form_ok");
		return modelAndView;
	}
	*/
	
	@RequestMapping(value="form_ok.do") 
	//@RequestMapping( value="/form_ok.do", method=RequestMethod.POST)
	public String form_post_ok(HttpServletRequest request, Model model ) {
		
		model.addAttribute( "data1", request.getParameter("data1") );
		return "form_ok.jsp";
	}	
}
