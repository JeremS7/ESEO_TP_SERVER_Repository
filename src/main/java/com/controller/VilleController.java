package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bdd.BDDActions;
import com.bdd.BDDConnect;

@RestController
public class VilleController {
	
	@RequestMapping(value = "/ville", method = RequestMethod.GET)
	public String AppelGet() {
		BDDConnect bdd = new  BDDConnect();
		BDDActions bdda = new BDDActions(bdd.getConn());
		return bdda.FetchCities();


	}
	
	

}
