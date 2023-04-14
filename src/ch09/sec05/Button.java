package ch09.sec05;

public class Button {
	String label;
	public Button(String label) {
		this.label = label;
	}
	
	private ClickListener cl;
	public void setListener (ClickListener cl) {
		this.cl = cl;
	}
	public static interface ClickListener {
		void onClick();
	}
	public void action() {
		cl.onClick();
	}

}
