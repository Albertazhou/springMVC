package can.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//注解：控制器
@Controller

public class HelloController {
	
	@RequestMapping("/hello")
	public ModelAndView hello(HttpServletRequest req,HttpServletResponse rep) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("msg", "hello mvc"); //封装要显示到视图的数据
		mv.setViewName("hello"); //视图名	
		return mv;
	}

}
