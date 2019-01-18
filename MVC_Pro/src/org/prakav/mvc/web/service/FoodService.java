package org.prakav.mvc.web.service;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.prakav.mvc.web.dao.FoodDAO;
import org.prakav.mvc.web.dto.FoodDeliveryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class FoodService {

	// withoutDATASource
	// private Map<String, Double> itemMap = new HashMap<>();

	@Autowired
	private FoodDAO foodDAO;
	private Map<String, Double> itemMap = new TreeMap<>();

	public FoodService() {
		System.out.println("food service");

	}

	@PostConstruct
	public void initResources() {
		itemMap.put("SaahiPanner", 140.0);
		itemMap.put("Gullab Jammun", 130.0);
		itemMap.put("Chicken", 200.0);
		itemMap.put("Egg Biriyani", 100.0);
		itemMap.put("Mushroom", 140.0);
		itemMap.put("Litti Chooka", 80.0);
	}

	@PreDestroy
	public void destroy() {
		itemMap.clear();
	}

	public Double processOrder(FoodDeliveryDTO foodDeliveryDto) {
		System.out.println("calling proccessOrde...");
		System.out.println("Starting validation of food....");

		// validation
		if (!StringUtils.isEmpty(foodDeliveryDto.getFoodName())) {
			if (!StringUtils.isEmpty(foodDeliveryDto.getLocation())) {

				System.out.println("validate dto..");
				String foodName = foodDeliveryDto.getFoodName();
				boolean foodPresent = itemMap.containsKey(foodName);
				if (foodPresent) {

					// save int db
					int quantity = foodDeliveryDto.getQuantity();
					Double price = itemMap.get(foodName);
					double totalPrice = (quantity * price);
					foodDAO.save(foodDeliveryDto);
					return totalPrice;
				}

			}
		} else {
			System.out.println("invalid dto");
		}
		System.out.println("validation is completed....");
		return 0.0;
	}

}
