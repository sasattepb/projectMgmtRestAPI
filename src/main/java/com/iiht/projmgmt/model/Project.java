package com.iiht.projmgmt.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "project")
@XmlRootElement
public class Project implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_id", updatable = false, nullable = false)
	public long projectId;

	@Column(name = "project")
	public String project;

	@Column(name = "start_date")
	@Temporal(TemporalType.DATE)
	public Date startDate;

	@Column(name = "end_date")
	@Temporal(TemporalType.DATE)
	public Date endDate;

	@Column(name = "priority")
	public int priority;

}
