package assignment5;

public abstract class MultipleLanguage implements Language, TestTool{
	public void python() {
		System.out.println("The language used is python");
	}
	public abstract void ruby();
}
