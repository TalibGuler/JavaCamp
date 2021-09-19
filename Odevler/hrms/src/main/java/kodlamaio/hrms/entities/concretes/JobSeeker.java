package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="job_seekers")
public class JobSeeker  {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) //tek tek arttırılması gerektiği için
	@Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_identity")
	private String nationalityIdentity;
	
	@Column(name="birth_year")
	private int birthYear;
	
	@Column(name="is_activated")
	private boolean isActivated;
}
