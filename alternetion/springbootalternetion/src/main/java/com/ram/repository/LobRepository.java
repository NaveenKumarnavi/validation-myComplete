package com.ram.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ram.mapper.LobRowMapper;
import com.ram.model.Lob;


@Repository
public class LobRepository
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public Lob createLob(Lob lob)
	{
		String sql = "INSERT INTO new_table " + "(psaf_prod_code, psaf_comp_code,psaf_sch_code,psaf_tran_type,psaf_end_type,psaf_code,"
				+ "psaf_lvl,psaf_type,psaf_dflt_yn,psaf_desc,psaf_desc_bl,psaf_short_desc,psaf_short_desc_bl,psaf_long_desc,psaf_long_desc_bl,"
				+ "psaf_value,psaf_eff_fm_dt,psaf_eff_to_dt,psaf_cvr_code,psaf_round_off) VALUES (?, ?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		KeyHolder holder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator()
		{
			@Override
			public PreparedStatement createPreparedStatement(Connection connection)
					throws SQLException
			{
				PreparedStatement ps = connection.prepareStatement(sql,
						Statement.RETURN_GENERATED_KEYS);
				ps.setString(1, lob.getPsaf_prod_code());
				ps.setString(2, lob.getPsaf_comp_code());
				ps.setString(3, lob.getPsaf_sch_code());
				ps.setString(4, lob.getPsaf_tran_type());
				ps.setString(5, lob.getPsaf_end_type());
				ps.setString(6, lob.getPsaf_code());
				ps.setString(7, lob.getPsaf_lvl());
				ps.setString(8, lob.getPsaf_type());
				ps.setString(9, lob.getPsaf_dflt_yn());
				ps.setString(10, lob.getPsaf_desc());
				ps.setString(11, lob.getPsaf_desc_bl());
				ps.setString(12, lob.getPsaf_short_desc());
				ps.setString(13, lob.getPsaf_short_desc_bl());
				ps.setString(14, lob.getPsaf_long_desc());
				ps.setString(15, lob.getPsaf_long_desc_bl());
				ps.setLong(16, lob.getPsaf_value());
				ps.setDate(17, lob.getPsaf_eff_fm_dt());
				ps.setDate(18, lob.getPsaf_eff_to_dt());
				ps.setString(19, lob.getPsaf_cvr_code());
				ps.setLong(20, lob.getPsaf_round_off());

				return ps;
			}
		}, holder);

		int generatedLobPsaf_sys_id = holder.getKey().intValue();
		lob.setPsaf_sys_id(generatedLobPsaf_sys_id);
		return lob;
	}

	@Transactional
	public Lob updateLob(Lob lob)
	{
		String sql = "UPDATE new_table SET "+"psaf_prod_code=?, psaf_comp_code=?, psaf_sch_code=?, psaf_tran_type=?, psaf_end_type=?, psaf_code=?,"
				+ "psaf_lvl=?, psaf_type=?, psaf_dflt_yn=?, psaf_desc=?, psaf_desc_bl=?, psaf_short_desc=?, psaf_short_desc_bl=?, psaf_long_desc=?, psaf_long_desc_bl=?,"
				+ "psaf_value=?, psaf_eff_fm_dt=?, psaf_eff_to_dt=?, psaf_cvr_code=?, psaf_round_off=?  WHERE psaf_sys_id=?";
		jdbcTemplate.update(sql, lob.getPsaf_prod_code(), lob.getPsaf_comp_code(), lob.getPsaf_sch_code(), lob.getPsaf_tran_type(), lob.getPsaf_end_type(), lob.getPsaf_code(),
				lob.getPsaf_lvl(), lob.getPsaf_type(), lob.getPsaf_dflt_yn(), lob.getPsaf_desc(), lob.getPsaf_desc_bl(), lob.getPsaf_short_desc(), lob.getPsaf_short_desc_bl(), lob.getPsaf_long_desc(), lob.getPsaf_long_desc_bl()
				, lob.getPsaf_value(), lob.getPsaf_eff_fm_dt(), lob.getPsaf_eff_to_dt(), lob.getPsaf_cvr_code(), lob.getPsaf_round_off(),lob.getPsaf_sys_id());
		return lob;
	}

	@Transactional(readOnly = true)
	public Lob getLob(int psaf_sys_id)
	{
		String sql = "SELECT * FROM new_table WHERE Psaf_sys_id = ?";
		Lob lob = jdbcTemplate.queryForObject(sql, new Object[] { psaf_sys_id },
				new LobRowMapper());
		return lob;
	}

	@Transactional(readOnly = true)
	public List<Lob> getLobs()
	{
		return jdbcTemplate.query("select * from new_table", new LobRowMapper());
	}

	@Transactional
	public void deleteLob(int psaf_sys_id)
	{
		String sql = "DELETE FROM new_table WHERE psaf_sys_id=?";
		jdbcTemplate.update(sql, psaf_sys_id);
	}

	public boolean isLobExist(int psaf_sys_id)
	{
		String sql = "SELECT COUNT(*) FROM new_table where psaf_sys_id=?";

		int count = jdbcTemplate.queryForObject(sql, new Object[] { psaf_sys_id }, Integer.class);
		if (count >= 1)
		{
			return true;
		}
		return false;
	}


}
