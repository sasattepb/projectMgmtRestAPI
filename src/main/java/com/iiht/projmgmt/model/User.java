package com.iiht.projmgmt.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="users")
@XmlRootElement
public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="user_id")
	public long userId;
	
	@Column(name="first_name")
	public String firstName;
	
	@Column(name="last_name")
	public String lastName;
	
	@Column(name="employee_id")
	public long employeeId;

	@Column(name="project_id")
	public long projectId;

	@Column(name="task_id")
	public long taskId;
	
}
