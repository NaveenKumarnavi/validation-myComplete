package com.ram.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.model.Lob;
import com.ram.repository.LobRepository;
import com.ram.service.LobService;

@Service
public class LobServiceImpl implements LobService
{

	@Autowired
	private LobRepository lobRepository;

	@Override
	public Lob createLob(Lob lob)
	{
		return lobRepository.createLob(lob);
	}

	@Override
	public Lob updateLob(Lob lob)
	{
		return lobRepository.updateLob(lob);
	}
	
	@Override
	public Lob getLob(int psaf_sys_id)
	{
		return lobRepository.getLob(psaf_sys_id);
	}

	@Override
	public List<Lob> getLobs()
	{
		return lobRepository.getLobs();
	}

	@Override
	public void deleteLob(int psaf_sys_id)
	{
		lobRepository.deleteLob(psaf_sys_id);
	}

	@Override
	public boolean isLobExist(int psaf_sys_id)
	{
		return lobRepository.isLobExist(psaf_sys_id);
	}

	
	
}
