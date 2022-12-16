package org.mql.spring.web.controllers;


import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.mql.compute.Compute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputingController {

	
	public ComputingController() {

	}
	
	@RequestMapping("/compute")
	public HashMap<String, Double> SearchProductByName(@RequestParam String number){
		HashMap<String, Double> res =new HashMap<String, Double>();
		res.put("result", Compute.computeExp(Double.parseDouble(number)));
		return res;
	}
	
}
