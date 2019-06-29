package com.iiht.projmgmt.model;

import java.io.Serializable;
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
@Table(name="task")
@XmlRootElement
public class Task implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "task_id", updatable = false, nullable = false)
	public long taskId;
	
	@Column(name="parent_id")
	public long parentId;
	
	@Column(name="project_id")
	public long projectId;

	@Column(name="task")
	public String task;
	
	@Column(name="start_date")
	@Temporal(TemporalType.DATE)
	public Date startDate;	

	@Column(name="end_date")
	@Temporal(TemporalType.DATE)
	public Date endDate;	
	
	@Column(name="priority")
	public int priority;

	@Column(name="status")
	public int status;
	
}
