package com.thebe.rest.controller;

import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.thebe.rest.dto.ModuleDto;
import com.thebe.rest.process.service.ModuleService;

@RestController
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class ModuleController {
	
	@Autowired
	ModuleService moduleService;
	
	@GetMapping("/hci/user")
	@ResponseBody
	public String getModules(@RequestParam(name="userId", required=false) Integer userId) {
		 String result = "";
		
		try {
			List<ModuleDto> modulesdto = moduleService.getModuleByUserId(userId);
			
			JSONObject modulObj = new JSONObject();
			modulObj.put("modules", modulesdto);
			
			result = modulObj.toString();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
		
	}

}
