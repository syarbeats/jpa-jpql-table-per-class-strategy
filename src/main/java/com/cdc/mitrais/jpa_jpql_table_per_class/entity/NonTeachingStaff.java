package com.cdc.mitrais.jpa_jpql_table_per_class.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
public class NonTeachingStaff extends Staff {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String areaexpertise;
	
	public NonTeachingStaff() {super();}
	
	public NonTeachingStaff(int sid, String sname, String areaexpertise) {
		super(sid, sname);
		this.setAreaexpertise(areaexpertise);
	}

	public String getAreaexpertise() {
		return areaexpertise;
	}

	public void setAreaexpertise(String areaexpertise) {
		this.areaexpertise = areaexpertise;
	}
	
	
}
