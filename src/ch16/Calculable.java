package ch16;

@FunctionalInterface //메서드 하나만 넣는다면 굳이 필요없다. 하지만 메서드 두개이상일 때 에러 알려주는용
public interface Calculable {
	void calcuable(int x, int y);
}
