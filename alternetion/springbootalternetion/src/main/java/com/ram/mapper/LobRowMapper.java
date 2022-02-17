package com.ram.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.ram.model.Lob;



public class LobRowMapper implements RowMapper<Lob>
{

	public Lob mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Lob lob = new Lob();
		lob.setPsaf_sys_id(rs.getInt("psaf_sys_id"));
		lob.setPsaf_prod_code(rs.getString("psaf_prod_code"));
		lob.setPsaf_comp_code(rs.getString("psaf_comp_code"));
		lob.setPsaf_sch_code(rs.getString("psaf_sch_code"));
		lob.setPsaf_tran_type(rs.getString("psaf_tran_type"));
		lob.setPsaf_end_type(rs.getString("psaf_end_type"));
		lob.setPsaf_code(rs.getString("psaf_code"));
		lob.setPsaf_lvl(rs.getString("psaf_lvl"));
		lob.setPsaf_type(rs.getString("psaf_type"));
		lob.setPsaf_dflt_yn(rs.getString("psaf_dflt_yn"));
		lob.setPsaf_desc(rs.getString("psaf_desc"));
		lob.setPsaf_desc_bl(rs.getString("psaf_desc_bl"));
		lob.setPsaf_short_desc(rs.getString("psaf_short_desc"));
		lob.setPsaf_short_desc_bl(rs.getString("psaf_short_desc_bl"));
		lob.setPsaf_long_desc(rs.getString("psaf_long_desc"));
		lob.setPsaf_long_desc_bl(rs.getString("psaf_long_desc_bl"));
		lob.setPsaf_value(rs.getLong("psaf_value"));
		lob.setPsaf_eff_fm_dt(rs.getDate("psaf_eff_fm_dt"));
		lob.setPsaf_eff_to_dt(rs.getDate("psaf_eff_to_dt"));
		lob.setPsaf_cvr_code(rs.getString("psaf_cvr_code"));
		lob.setPsaf_round_off(rs.getLong("psaf_round_off"));

		return lob;
	}

}
