package es.aytos.example;

import es.aytos.main.client.CalculadoraStub;
import es.aytos.main.client.CalculadoraStub.DividirResponse;
import es.aytos.main.client.CalculadoraStub.MultiplicarResponse;
import es.aytos.main.client.CalculadoraStub.RestaResponse;
import es.aytos.main.client.CalculadoraStub.SumarResponse;

public class Main {
	public static void main(String[] args) throws Exception {
		CalculadoraStub stub = new CalculadoraStub();
		
		CalculadoraStub.Sumar operacion = new CalculadoraStub.Sumar();
		CalculadoraStub.Resta operacion2 = new CalculadoraStub.Resta();
		CalculadoraStub.Multiplicar operacion3 = new CalculadoraStub.Multiplicar();
		CalculadoraStub.Dividir operacion4 = new CalculadoraStub.Dividir();
		
		SumarResponse response = null;
		RestaResponse response2 =  null;
		MultiplicarResponse response3 = null;
		DividirResponse response4 = null;
		
		
		// Establecemos los parámetros de la operación
		operacion.setArgs0(10);
		operacion.setArgs1(20);
		operacion2.setArgs0(1);
		operacion2.setArgs1(1);
		operacion3.setArgs0(2);
		operacion3.setArgs1(2);
		operacion4.setArgs0(2);
		operacion4.setArgs1(2);
		
		// Invocamos el WS
		response = stub.sumar(operacion);
		response2 = stub.resta(operacion2);
		response3 = stub.multiplicar(operacion3);
		response4 = stub.dividir(operacion4);
		
		// Mostramos el resultado
		System.out.println(response.get_return());
		System.out.println(response2.get_return());
		System.out.println(response3.get_return());
		System.out.println(response4.get_return());
	}
}