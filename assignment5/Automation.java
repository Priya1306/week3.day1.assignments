package assignment5;

public class Automation extends MultipleLanguage{

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("JAVA");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("SELENIUM");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("RUBY");
	}
	public static void main(String[] args) {
		Automation a =new Automation();
		a.Java();
		a.Selenium();
		a.python();
		a.ruby();
	}
}
