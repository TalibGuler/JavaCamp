package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity // Classın ne olduğunu belirtir.
@Table(name = "job_titles") // veritabanında hangi tabloya karşılık geldiğini gösterir.
public class JobTitle {

	@Id
	@GeneratedValue // id bir bir artacak şekilde olması için.
	@Column(name = "id")
	private int id;

	@Column(name = "title")
	private String title;

	public JobTitle(int id, String title) {
		super();
		this.id = id;
		this.title = title;
	}

	public JobTitle() {
	
	}
}
