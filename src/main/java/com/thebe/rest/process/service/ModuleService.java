package com.thebe.rest.process.service;

import java.util.List;

import com.thebe.rest.dto.ModuleDto;

public interface ModuleService {

	public List<ModuleDto> getModuleByUserId(Integer userId);
	
}
