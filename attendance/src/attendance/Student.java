package attendance;

public class Student implements Attendee{
	private boolean inClass;
	private String first;
	private String last;
	
	public Student(String firstName, String lastName) {
		inClass = false;
		first = firstName;
		last = lastName;
	}
	
	public boolean isPresent() {
		return inClass;
	}
	
	public void setPresent(boolean present) {
		if(this.inClass) {
			System.out.println(getFirstName() + " is already present in class.");
		}
		else {
			this.inClass = true;
			System.out.println(getFirstName() + " successfully marked present.");
		}
	}
	
	public String getFirstName() {
		return this.first;
	}
	
	public String getLastName() {
		return this.last;
	}
	
	public boolean mathces(String first, String last) {
		return (first == this.first) && (last == this.last);
	}
	
	public boolean matches(String last) {
		return last == this.last;
	}
	
	public String getReportString() {
		String result = "";
		
		if(getLastName().length() > 17) {
			for(int i = 0; i < 17; i++) {
				result += getLastName().substring(i,i+1);
			}
			
			result += "...";
		}
		else {
			result += getLastName();
			
			while(result.length() < 20) {
				result += " ";
			}
		}
		
		if(getFirstName().length() > 17) {
			for(int i = 0; i < 17; i++) {
				result += getFirstName().substring(i,i+1);
			}
			
			result += "...";
		}
		else {
			result += getFirstName();
			
			while(result.length() < 40) {
				result += " ";
			}
		}
		
		if(inClass) {
			result += "PRESENT";
		}
		else {
			result += "ABSENT";
		}
		
		return result;
	}
}
