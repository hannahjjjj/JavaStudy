package ch06.sec11.exam02;

import java.io.IOException;

public class EarthExample {
	public static void main(String[] args) throws IOException {
		System.out.println("지구의 반지름: "+Earth.EARTH_RADIUS+"km");
		System.out.println("지구의 표면적: "+Earth.EARTH_SURFACE_AREA+"km");
	}
}
