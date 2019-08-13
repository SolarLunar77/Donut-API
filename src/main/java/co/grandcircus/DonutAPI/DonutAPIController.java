package co.grandcircus.DonutAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.DonutAPI.entity.DonutsResponse;
import co.grandcircus.DonutAPI.entity.Results;

@Controller
public class DonutAPIController {
	
	@Autowired
	private ApiService apiService;
	
	
	
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");

		DonutsResponse donuts = apiService.getDonuts();
				
		mv.addObject("donuts", donuts.getResults());
		
		return mv;
	}
	

	
	@RequestMapping("/details")
	public ModelAndView details(@RequestParam("id") Long id) {
		ModelAndView mv = new ModelAndView("details");
		
		mv.addObject("donut", apiService.getById(id));
		
		return mv;
	}
	
	
	
}


