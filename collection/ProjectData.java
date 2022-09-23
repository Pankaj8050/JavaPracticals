package collection;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

class Data{
	private int rollNo;
	private String name;
	private Date dob;
	private LocalDate doj;
	private String projectName;
	
	public Data(int rollNo, String name, Date dob, LocalDate doj, String projectName) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.projectName = projectName;
	}
	

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return " [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", projectName="
				+ projectName + "]";
	}
	
	
	
	
}

