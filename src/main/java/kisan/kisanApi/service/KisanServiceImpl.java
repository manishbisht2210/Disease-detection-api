package kisan.kisanApi.service;

import java.util.List;
import java.util.Optional;

import kisan.kisanApi.exception.DiseaseNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kisan.kisanApi.constants.ExceptionConstants;
import kisan.kisanApi.models.DiseaseInfo;
import kisan.kisanApi.repository.KisanRepository;

@Service
public class KisanServiceImpl {

	@Autowired
	KisanRepository kisanRepository;
	
	Logger LOGGER=LoggerFactory.getLogger(KisanServiceImpl.class);
	
	public DiseaseInfo getDiseaseDetails(String identifier) throws DiseaseNotFoundException {
		LOGGER.info("Fetching record from database");
		Optional<DiseaseInfo> diseaseInfo= kisanRepository.findByDisease(identifier);
		if(diseaseInfo.isPresent()) {
			LOGGER.info("Record Found");
			return diseaseInfo.get();
		}
		else {
			LOGGER.info("Record not Found");
			throw new DiseaseNotFoundException(ExceptionConstants.RECORD_NOT_FOUND);
		}
	}
	
	public void insertRecords(List<DiseaseInfo> diseaseInfos) {
		LOGGER.info("Persisting records in database");
		kisanRepository.saveAll(diseaseInfos);		
	}
	
	public DiseaseInfo getDiseaseDetailsById(int id) throws DiseaseNotFoundException {
		LOGGER.info("Fetching record from database");
		Optional<DiseaseInfo> diseaseInfo= kisanRepository.findById(id);
		if(diseaseInfo.isPresent()) {
			LOGGER.info("Record Found");
			return diseaseInfo.get();
		}
		else {
			LOGGER.info("Record not Found");
			throw new DiseaseNotFoundException(ExceptionConstants.RECORD_NOT_FOUND);
		}
	}
	
}
