package kisan.kisanApi.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class DiseaseInfo {
	
	@Id
	private int id;	
	@Field
	private String disease;
	@Field
	private List<String> symptoms;
	@Field
	private List<String> remedies;
	
	public DiseaseInfo(String disease, List<String> symptoms, List<String> remedies) {
		super();
		this.disease = disease;
		this.symptoms = symptoms;
		this.remedies = remedies;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public List<String> getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}
	public List<String> getRemedies() {
		return remedies;
	}
	public void setRemedies(List<String> remedies) {
		this.remedies = remedies;
	}
	
	@Override
	public String toString() {
		return "DiseaseInfo [disease=" + disease + ", symptoms=" + symptoms + ", remedies=" + remedies + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

}
