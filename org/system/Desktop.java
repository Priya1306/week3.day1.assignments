package org.system;

public class Desktop extends Computer{
	public void desktopSize() {
		System.out.println("The size of the desktop is 16 inches");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
