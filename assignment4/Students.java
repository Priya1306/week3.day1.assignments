package assignment4;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println(id+" "+name);
	}
	public void getStudentInfo(String email, long phonenumber) {
		System.out.println(email+" "+phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s=new Students();
		s.getStudentInfo(100);
		s.getStudentInfo(101, "Anand");
		s.getStudentInfo("abc@gmail.com", 9009008080L);
	}

}
