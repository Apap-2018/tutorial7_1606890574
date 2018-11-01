package com.apap.tutorial7.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.apap.tutorial7.rest.Setting;

@RestController 
@RequestMapping("/airport")
public class AirportController {
	
    @GetMapping(value="/{namaKota}")
    public Object getAirport(@PathVariable("namaKota") String namaKota) throws Exception {
    	RestTemplate restTemplate = new RestTemplate();
    	String path = Setting.airportUrl + "?apikey=LKMM9TU1DZuztnXZW6Gkuj8wN0tZVQmz&term=" + namaKota + "&country=ID";
    	Object obj = restTemplate.getForObject(path, Object.class);
    	return obj;
    	
    }
}
