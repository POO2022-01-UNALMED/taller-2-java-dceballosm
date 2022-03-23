package test;
import java.util.Arrays;
public class Asiento {
	String color;
	int precio;
	int registro;
	
	void cambiarColor(String color) {
		String colors[] = {"verde","rojo","amarillo","negro","blanco"};
		if (Arrays.asList(colors).contains(color) == true) {
			this.color = color;
		} 
	}
}
