package org.prakav.mvc.web.Controller;

import org.prakav.mvc.web.dto.FoodDeliveryDTO;
import org.prakav.mvc.web.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class FoodController {

	
	@Autowired
	private FoodService foodService;

	public FoodController() {
		System.out.println(" food controller running..." + this.getClass().getSimpleName());
	}

	@RequestMapping("/Food.do")

	public ModelAndView FoodDelivery(FoodDeliveryDTO foodDeliverydto) {
		System.out.println("Enter display method");
		System.out.println(foodDeliverydto);

		ModelAndView modelAndView = new ModelAndView();
		if(!StringUtils.isEmpty(foodDeliverydto.getFoodName())&& !StringUtils.isEmpty(foodDeliverydto.getLocation()))
				{
		modelAndView.setViewName("/Food");
		double totalPrice = foodService.processOrder(foodDeliverydto);
		if (totalPrice > 0) {
			System.out.println("created......");
			modelAndView.addObject("fdto", foodDeliverydto);
			modelAndView.addObject("totalPrice", totalPrice);
			modelAndView.setViewName("/Success.jsp");
			return modelAndView;

	} 
		
	}
			System.out.println("food not ordered try to fill all details");
			modelAndView.addObject("failureMessage","food selection is unsuccesseful, please enter the valid detail");
			modelAndView.setViewName("/Food.jsp");
		return modelAndView;
	
	}
}