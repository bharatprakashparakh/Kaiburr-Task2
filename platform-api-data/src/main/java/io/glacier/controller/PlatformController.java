package io.glacier.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.glacier.exception.ServiceException;
import io.glacier.model.*;
import io.glacier.repository.PlatformRepository;
import io.glacier.service.PlatformService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.glacier.exception.*;

@RestController
@RequestMapping("/platforms")
public class PlatformController {
    
	@Autowired
	private PlatformService platformservice;
   
    //Find All Platforms present in database
	 @GetMapping("/")
	 @ApiOperation(value="Get All the Platforms", notes="Provides details of all the platforms from the list",
     response=Platform.class)
    public List<Platform> getAllPlatforms()
    {
    	return platformservice.getAllPlatforms();
    }
    
	 
    //Find Platform with unique id mentioned in url	
    @GetMapping("/{id}")
    @ApiOperation(value="Find a Platform By id", notes="Provide an id to look up specific platform from list",
                    response=Platform.class)
    		
    				

    public Platform getPlatform(@ApiParam(value="ID value for the platform you need to retrieve",required=true) @PathVariable int id) throws ServiceException
	{
	
    return platformservice.getPlatform(id);

	}
    
     //Find all platforms with name mentioned in url
   
    @GetMapping("/{name}")
    @ApiOperation(value="Find Platforms By Name", notes="Provide a name to look up specific platform from list",
    response=Platform.class)
    public List<Platform> getPlatformByName(@PathVariable String name) throws ServiceException
	{
	
    
	     return platformservice.getPlatformByName(name);
    	
	} 
	     
	
    //Create a platform in a database with data provided together with url as JSON.
    @PostMapping("/")
    @ApiOperation(value="Add a new  platform", notes="Provide the details of platform to be added",
    response=Platform.class)
    public String addPlatform(@ApiParam(value="Details of the platform you want to create",required=true) @RequestBody Platform platform)
    {
    	return platformservice.addPlatform(platform);
    }
    
    
    //Delete a platform from database having id equal to id present in url.
    @DeleteMapping("/{id}")
    @ApiOperation(value="Remove a created platform", notes="Provide the id of the platform to be deleted",
    response=Platform.class)
    public String deletePlatform(@ApiParam(value="ID value for the platform you want to delete",required=true) @PathVariable int id)
  	{
  	
       return platformservice.deletePlatform(id);
  	}
     
    //Update a platform in a database having id equal to id provided in url.The data to be updated is also present in url as JSON.
    @PutMapping("/{id}")
    @ApiOperation(value="Update a platform", notes="Provide the id of the platform to be updated and new details to be updated",
    response=Platform.class)
    public String updatePlatform(@ApiParam(value="New Details of the platform for updation",required=true) @RequestBody Platform platform,@PathVariable int id)
	{
	   return  platformservice.updatePlatform(platform, id);
		
	}


}
