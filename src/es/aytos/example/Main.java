package es.aytos.example;

import es.aytos.main.client.CalculadoraStub;
import es.aytos.main.client.CalculadoraStub.Sumar;
import es.aytos.main.client.CalculadoraStub.SumarResponse;

public class Main {
	public static void main(String[] args) throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		Sumar operacion = new Sumar();
		SumarResponse response = null;
		// Establecemos los parámetros de la operación
		operacion.setArgs0(100);
		operacion.setArgs1(200);
		// Invocamos el WS
		response = stub.sumar(operacion);
		// Mostramos el resultado
		System.out.println(response.get_return());
	}
}