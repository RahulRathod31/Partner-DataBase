package net.details.springboot.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import net.details.springboot.model.Partner;
import net.details.springboot.repository.PartnerRepository;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v2/")
public class PartnerController {
	
	
	
	@Autowired
	private PartnerRepository partnerRepository;
	
	// get all partners
	@GetMapping("/partner")
	public List<Partner> getAllPartner(){
		return partnerRepository.findAll();
	}
	
	
	
	// create employee rest api
	@PostMapping("/partner")
	public Partner createPartner(@RequestBody Partner Partner) {
		return partnerRepository.save(Partner);
	}
	
	
}
