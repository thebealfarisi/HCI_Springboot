package com.thebe.rest.process.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.thebe.rest.dto.ModuleDto;
import com.thebe.rest.entity.Module;
import com.thebe.rest.process.service.ModuleService;
import com.thebe.rest.repository.ModuleRepository;

@Service("moduleService")
public class ModuleServiceImpl implements ModuleService {
	
	@Autowired
	ModuleRepository moduleRepository;
	
	@Override
	@Transactional
	public List<ModuleDto> getModuleByUserId(Integer userId) {
		List<ModuleDto> result = new ArrayList<ModuleDto>();
		
		try {
			List<Module> modules = moduleRepository.getModulesByUserId(userId);
			for (Module module : modules) {
				ModuleDto moduleDto = new ModuleDto();
				moduleDto.setModuleName(module.getSectionId().getSectionCardName());
				moduleDto.setModuleOrder(module.getOrderData());
				result.add(moduleDto);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}

}
