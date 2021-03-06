package week1;


 
public class Student {
	private int id;
    private String name;
    private String city;

 
    public Student(int id, String city, String name) {
        this.name = name;
        this.id = id;
        this.city = city;
        
    }
 
    // getters and setters
 
    public String toString() {
        return String.format(city + " " + name);
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}