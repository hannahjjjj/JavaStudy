package ch16.sec02;

import lombok.Setter;

@Setter
public class Button {

	@FunctionalInterface
	public static interface ClickListener{
		void onClick();
	}
	private ClickListener cl;
	
	public void click() {
		this.cl.onClick();
	}

}
