package kisan.kisanApi.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import kisan.kisanApi.models.DiseaseInfo;

@Repository
public interface KisanRepository extends MongoRepository<DiseaseInfo, Integer>{
	
	Optional<DiseaseInfo> findByDisease(String disease);

}
