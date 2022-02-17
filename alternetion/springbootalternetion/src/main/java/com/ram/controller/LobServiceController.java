package com.ram.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ram.exception.LobNotfoundException;
import com.ram.model.Lob;
import com.ram.response.ResponseData;
import com.ram.response.SuccessResponse;
import com.ram.service.LobService;

@RestController
public class LobServiceController
{
	@Autowired
	private LobService lobService;
	
	@RequestMapping(value = "/lobs", method = RequestMethod.POST)
	public ResponseEntity<Object> createLob(@Valid @RequestBody Lob lob)
	{
		try {
			if(lobService.getLob(lob.getPsaf_sys_id())== null)
			{
				throw new LobNotfoundException("Data Not found Lob");
			}
			else {
				lob = lobService.updateLob(lob);
					lobService.updateLob(lob);
					return SuccessResponse.success("Lob is updated successsfully= " + lob.getPsaf_sys_id(), HttpStatus.OK);
			}
			}catch(Exception e) {
				
				lob = lobService.createLob(lob);
				return SuccessResponse.success("Lob is created successfully with Psaf_sys_id = " + lob.getPsaf_sys_id(),HttpStatus.CREATED);
		}
	}
//
//	@RequestMapping(value = "/lobs", method = RequestMethod.PUT)
//	public ResponseEntity<Object> updateLob(@RequestBody Lob lob)
//	{
//		lob = lobService.updateLob(lob);
//		try{
//			lobService.updateLob(lob);
//			return SuccessResponse.success("Lob is updated successsfully= " + lob.getPsaf_sys_id(), HttpStatus.OK);
//		}catch(Exception e){
//			throw new LobNotfoundException("Data Not found Lob");
//		}
//	}

	@RequestMapping(value = "/lobs/{psaf_sys_id}", method = RequestMethod.GET)
	public ResponseEntity<Object> getLob(@PathVariable("psaf_sys_id") int psaf_sys_id)
	{
		boolean isLobExist = lobService.isLobExist(psaf_sys_id);
		if (isLobExist)
		{
			Lob lob = lobService.getLob(psaf_sys_id);
			return ResponseData.generateResponse("Successfully getted Data", HttpStatus.OK,lob);
		}
		else
		{
			throw new LobNotfoundException("Data Not found Lob");
		}
	}

	@RequestMapping(value = "/lobs", method = RequestMethod.GET)
	public ResponseEntity<Object> getLobs()
	{
		try {	
				List<Lob> lobList = lobService.getLobs();
				return ResponseData.generateResponse("Successfully retrieved Data!", HttpStatus.OK,lobList);
		
			}catch(Exception e)
			{
				throw new LobNotfoundException("Data Not found Lob");
			}
	}
	

	@RequestMapping(value = "/lobs/{psaf_sys_id}", method = RequestMethod.DELETE)
	public ResponseEntity<Object> deleteLob(@PathVariable("psaf_sys_id") int psaf_sys_id)
	{
		boolean isLobExist = lobService.isLobExist(psaf_sys_id);
		if (isLobExist)
		{
			lobService.deleteLob(psaf_sys_id);
			return  SuccessResponse.success("Lob is deleted successsfully", HttpStatus.OK);
		}
		else
		{
			throw new LobNotfoundException("Data Not found Lob with Psaf_sys_id = " + psaf_sys_id);
		}
	}
}
