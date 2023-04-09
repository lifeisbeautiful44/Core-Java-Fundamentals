
public class Passeneger {

	private String firstName;
	private String lastName;
	private int id;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "The passenger information is about: " + this.firstName + " " + this.lastName;
				}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.id;
				}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
	 Passeneger passeneger = (Passeneger) obj;
//	 System.out.println("passwneger");
//	 System.out.println(passeneger);
//	 System.out.println(passeneger);
	 if(passeneger.getId() == this.id && this.firstName.equals(passeneger.getFirstName()) && this.lastName.equals(passeneger.getLastName() ))
			 {
		 
		 return true;
			 }
	 else 
		 return false;
			 
	}

}
