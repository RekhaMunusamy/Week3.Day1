package week3.day1;

public class Ass1Desktop extends Ass1ComputerParent  {
	public void desktopSize() {
		System.out.println("DesktopSize-DesktopSizeClass");

	}
	public static void main(String[] args)
	{
		Ass1Desktop obj = new Ass1Desktop();
		obj.desktopSize();
		obj.computerModel();
	}

}
