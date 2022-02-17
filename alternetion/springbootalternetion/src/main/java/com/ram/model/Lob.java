package com.ram.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table
public class Lob
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int psaf_sys_id;
	
	@NotBlank(message = "psaf_prod_code empty")
	@Size(max = 12, message = "PSAF_PROD_CODE should have at least 12 characters")
	private String psaf_prod_code;
	
	@NotBlank(message = "psaf_comp_code empty")
	@Size(max = 12, message = "PSAF_COMP_CODE should have at least 12 characters")
	private String psaf_comp_code;
	
	@Column(name = "psaf_sch_code", nullable = false)
	@NotNull(message = "The PSAF_SCH_CODE is required.")
	@Size(max = 12, message = "PSAF_SCH_CODE should have at least 12 characters")
	private String psaf_sch_code;
	
	@NotBlank(message = "psaf_tran_type empty")
	@Size(max = 1, message = "PSAF_TRAN_TYPE is a 1 Character")
	private String psaf_tran_type;
	
	@NotBlank(message = "psaf_end_type empty")
	@Size(max = 1, message = "PSAF_END_TYPE should have at least 1 characters")
	private String psaf_end_type;
	
	@Column(name = "psaf_code", nullable = false)
	@NotNull(message = "The PSAF_CODE is required.")
	@Size(max = 12, message = "PSAF_CODE should have at least 12 characters")
	private String psaf_code;
	
	@Column(name = "psaf_lvl", nullable = false)
	@NotNull(message = "The PSAF_LVL is required.")
	@Size(max = 1, message = "PSAF_LVL to declar  1 characters")
	private String psaf_lvl;
	
	@Column(name = "psaf_type", nullable = false)
	@NotNull(message = "The PSAF_TYPE is required.")
	@Size(max = 5, message = "PSAF_TYPE should have at least 5 characters")
	private String psaf_type;
	
	@NotBlank(message = "PSAF_DFLT_YN is empty")
	@Column(name = "psaf_dflt_yn", nullable = false)
	@Pattern(regexp = "^[YN]$", message = "Must be either Y or N")
	private String psaf_dflt_yn;
	
	@NotBlank(message = "psaf_desc empty")
	private String psaf_desc;
	
	@NotBlank(message = "psaf_desc_bl empty")
	private String psaf_desc_bl;
	
	@NotBlank(message = "psaf_short_desc empty")
	private String psaf_short_desc;
	
	@NotBlank(message = "psaf_short_desc_bl empty")
	private String psaf_short_desc_bl;
	
	@NotBlank(message = "psaf_long_desc empty")
	private String psaf_long_desc;
	
	@NotBlank(message = "psaf_long_desc_bl empty")
	private String psaf_long_desc_bl;
	
	@NotNull(message = "The PSAF_VALUE is required.")
  	@Min(value = 1, message = "The  PSAF_VALUE must be greater than 0")
  	@Max(value = 99, message = "The  PSAF_VALUE must be greater than 99")
	private Long psaf_value;
	
	@NotNull(message = "The PSAF_EFF_FM_DT is required.")
	private Date psaf_eff_fm_dt;
	
	@NotNull(message = "The PSAF_EFF_TO_DT is required.")
	private Date psaf_eff_to_dt;
	
	@NotNull(message = "The PSAF_CVR_CPDE is required.")
	@Size(max = 12, message = "PSAF_CVR_CPDE should have at least 12 characters")
	private String psaf_cvr_code;
	
	@NotNull(message = "The PSAF_ROUND_OFF is required.")
  	@Min(value = 1, message = "The  PSAF_ROUND_OFF must be greater than 0")
  	@Max(value = 9, message = "The  PSAF_ROUND_OFF must be greater than 9")
	private Long psaf_round_off;

	
	
	public int getPsaf_sys_id() {
		return psaf_sys_id;
	}



	public void setPsaf_sys_id(int psaf_sys_id) {
		this.psaf_sys_id = psaf_sys_id;
	}



	public String getPsaf_prod_code() {
		return psaf_prod_code;
	}



	public void setPsaf_prod_code(String psaf_prod_code) {
		this.psaf_prod_code = psaf_prod_code;
	}

	public String getPsaf_comp_code() {
		return psaf_comp_code;
	}



	public void setPsaf_comp_code(String psaf_comp_code) {
		this.psaf_comp_code = psaf_comp_code;
	}



	public String getPsaf_sch_code() {
		return psaf_sch_code;
	}



	public void setPsaf_sch_code(String psaf_sch_code) {
		this.psaf_sch_code = psaf_sch_code;
	}



	public String getPsaf_tran_type() {
		return psaf_tran_type;
	}



	public void setPsaf_tran_type(String psaf_tran_type) {
		this.psaf_tran_type = psaf_tran_type;
	}



	public String getPsaf_end_type() {
		return psaf_end_type;
	}



	public void setPsaf_end_type(String psaf_end_type) {
		this.psaf_end_type = psaf_end_type;
	}



	public String getPsaf_code() {
		return psaf_code;
	}



	public void setPsaf_code(String psaf_code) {
		this.psaf_code = psaf_code;
	}

	public String getPsaf_lvl() {
		return psaf_lvl;
	}

	public void setPsaf_lvl(String psaf_lvl) {
		this.psaf_lvl = psaf_lvl;
	}

	public String getPsaf_type() {
		return psaf_type;
	}

	public void setPsaf_type(String psaf_type) {
		this.psaf_type = psaf_type;
	}

	public String getPsaf_dflt_yn() {
		return psaf_dflt_yn;
	}

	public void setPsaf_dflt_yn(String psaf_dflt_yn) {
		this.psaf_dflt_yn = psaf_dflt_yn;
	}

	public String getPsaf_desc() {
		return psaf_desc;
	}

	public void setPsaf_desc(String psaf_desc) {
		this.psaf_desc = psaf_desc;
	}

	public String getPsaf_desc_bl() {
		return psaf_desc_bl;
	}

	public void setPsaf_desc_bl(String psaf_desc_bl) {
		this.psaf_desc_bl = psaf_desc_bl;
	}

	public String getPsaf_short_desc() {
		return psaf_short_desc;
	}

	public void setPsaf_short_desc(String psaf_short_desc) {
		this.psaf_short_desc = psaf_short_desc;
	}

	public String getPsaf_short_desc_bl() {
		return psaf_short_desc_bl;
	}
	
	public void setPsaf_short_desc_bl(String psaf_short_desc_bl) {
		this.psaf_short_desc_bl = psaf_short_desc_bl;
	}

	public String getPsaf_long_desc() {
		return psaf_long_desc;
	}

	public void setPsaf_long_desc(String psaf_long_desc) {
		this.psaf_long_desc = psaf_long_desc;
	}



	public String getPsaf_long_desc_bl() {
		return psaf_long_desc_bl;
	}

	public void setPsaf_long_desc_bl(String psaf_long_desc_bl) {
		this.psaf_long_desc_bl = psaf_long_desc_bl;
	}

	public Long getPsaf_value() {
		return psaf_value;
	}

	public void setPsaf_value(Long psaf_value) {
		this.psaf_value = psaf_value;
	}

	public Date getPsaf_eff_fm_dt() {
		return psaf_eff_fm_dt;
	}

	public void setPsaf_eff_fm_dt(Date psaf_eff_fm_dt) {
		this.psaf_eff_fm_dt = psaf_eff_fm_dt;
	}

	public Date getPsaf_eff_to_dt() {
		return psaf_eff_to_dt;
	}

	public void setPsaf_eff_to_dt(Date psaf_eff_to_dt) {
		this.psaf_eff_to_dt = psaf_eff_to_dt;
	}

	public String getPsaf_cvr_code() {
		return psaf_cvr_code;
	}

	public void setPsaf_cvr_code(String psaf_cvr_code) {
		this.psaf_cvr_code = psaf_cvr_code;
	}

	public Long getPsaf_round_off() {
		return psaf_round_off;
	}

	public void setPsaf_round_off(Long psaf_round_off) {
		this.psaf_round_off = psaf_round_off;
	}
	
	@Override
	public String toString()
	{
	return "Lob [psaf_sys_id=" + psaf_sys_id + ", psaf_prod_code=" + psaf_prod_code + ", psaf_comp_code=" + psaf_comp_code +","
			+ " psaf_sch_code=" + psaf_sch_code + ", psaf_tran_type=" + psaf_tran_type +", psaf_end_type=" + psaf_end_type +","
			+" psaf_code=" + psaf_code +", psaf_lvl=" + psaf_lvl + ", psaf_type=" + psaf_type + ", psaf_dflt_yn=" + psaf_dflt_yn +","
					+ " psaf_desc=" + psaf_desc + ", psaf_desc_bl=" + psaf_desc_bl +", psaf_short_desc=" + psaf_short_desc +
					",psaf_short_desc_bl=" + psaf_short_desc_bl + ",psaf_long_desc=" + psaf_long_desc + ", psaf_long_desc_bl=" + psaf_long_desc_bl + ", psaf_value=" + psaf_value +","
							+ " psaf_eff_fm_dt=" + psaf_eff_fm_dt + ", psaf_eff_to_dt=" + psaf_eff_to_dt +", psaf_cvr_code=" + psaf_cvr_code +
							",psaf_round_off=" + psaf_round_off+ "]";
	}
}
	
	
