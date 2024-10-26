package jdbc.bean;

public class StudentBean 
{
	private int rno;         
	private String name ; 
	private String std  ; 
	private String marks;
	
	public StudentBean() 
	{
	}

	public StudentBean(int rno, String name, String std, String marks) {
		super();
		this.rno = rno;
		this.name = name;
		this.std = std;
		this.marks = marks;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}
}
