package pl.edu.agh.ki.mwo.model;
import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="students")
public class Student implements java.io.Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Column
	private String name;
	
	@Column
	private String surname;
	
	@Column
	private String pesel;

	@ManyToOne(targetEntity=SchoolClass.class,fetch = FetchType.LAZY)
	@JoinColumn(name="class_id", referencedColumnName = "id")
	private SchoolClass schoolClass;
	
	// @OneToMany(fetch = FetchType.LAZY)
	// @JoinColumn(name="class_id", referencedColumnName = "id")
	// private SchoolClass schoolClass;
	public SchoolClass getSchoolClass() {
		return this.schoolClass;
	}

	public void setSchoolClass(SchoolClass schoolClass) {
		this.schoolClass = schoolClass;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Student() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPesel() {
		return pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}


	
}
