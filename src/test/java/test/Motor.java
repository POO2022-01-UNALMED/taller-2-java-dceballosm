package test;
import java.util.Arrays;

public class Motor {
	int numeroCilindros;
	String tipo;
	int registro;
	
	void cambiarRegistro(int registro){
		this.registro = registro;
	}
	
	void asignarTipo(String tipo) {
		String tipos[] = {"electrico","gasolina"};
		if (Arrays.asList(tipos).contains(tipo) == true) {
			this.tipo = tipo;
		}
	}

}
