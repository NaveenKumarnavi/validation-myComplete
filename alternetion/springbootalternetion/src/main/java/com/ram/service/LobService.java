package com.ram.service;

import java.util.List;

import com.ram.model.Lob;

public interface LobService 
{

	Lob createLob(Lob lob);

	boolean isLobExist(int psaf_sys_id);

	Lob getLob(int psaf_sys_id);

	List<Lob> getLobs();

	void deleteLob(int psaf_sys_id);

	Lob updateLob(Lob lob);

	
	}
