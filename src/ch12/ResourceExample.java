package ch12;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ResourceExample {
	public ResourceExample() {
		JFrame f = new JFrame("Image");
		ImageIcon icon = new ImageIcon(this.getClass().getResource("a.jpg"));
		f.add(new JLabel(icon));
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new ResourceExample();
		Class c = ResourceExample.class;
		System.out.println(c.getResource("a.jpg"));
	}
}
