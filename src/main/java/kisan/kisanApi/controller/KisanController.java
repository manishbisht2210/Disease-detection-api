package kisan.kisanApi.controller;

import java.util.List;

import kisan.kisanApi.exception.DiseaseNotFoundException;
import kisan.kisanApi.service.KisanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import kisan.kisanApi.models.DiseaseInfo;

@RestController
public class KisanController {
	
	@Autowired
	public KisanServiceImpl kisanServiceImpl;

	/*@GetMapping("diseases/{identifier}")
	@ResponseStatus(code=HttpStatus.OK)
	public DiseaseInfo getDiseaseInfo(@PathVariable(name="identifier") String identifier) throws DiseaseNotFoundException {
				
		return kisanServiceImpl.getDiseaseDetails(identifier);
	}*/
	
	@PostMapping("diseases")
	@ResponseStatus(code=HttpStatus.CREATED)
	public String saveData(@RequestBody List<DiseaseInfo> diseaseInfos) {
		kisanServiceImpl.insertRecords(diseaseInfos);
		return "Success";
	}
	
	@GetMapping("diseases/{id}")
	@ResponseStatus(code=HttpStatus.OK)
	public DiseaseInfo getDiseaseInfoById(@PathVariable(name="id") int id) throws DiseaseNotFoundException {
		return kisanServiceImpl.getDiseaseDetailsById(id);
	}
	
}
