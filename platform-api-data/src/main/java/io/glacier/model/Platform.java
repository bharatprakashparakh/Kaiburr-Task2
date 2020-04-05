package io.glacier.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="Details about the Platform")
@Document(collection = "Platform")
public class Platform {

	//id field is primary key
	@Id
	@ApiModelProperty(notes="The unique ID of platform")
	private int id;
	@ApiModelProperty(notes="The name of the platform")
	private String name;
	@ApiModelProperty(notes="The language to be used in the platform")
	private String language;
	@ApiModelProperty(notes="The framework to setup in platform")
	private String framework;
	
	Platform(){
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getFramework() {
		return framework;
	}
	public void setFramework(String framework) {
		this.framework = framework;
	}
	public Platform(int id, String name, String language, String framework) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.framework = framework;
	}
	
	
	
}
