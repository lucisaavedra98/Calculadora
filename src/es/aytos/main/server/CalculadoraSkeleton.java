
/**
 * CalculadoraSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.2  Built on : Sep 06, 2010 (09:42:01 CEST)
 */
package es.aytos.main.server;

/**
 * CalculadoraSkeleton java skeleton for the axisService
 */
public class CalculadoraSkeleton {

	/**
	 * Auto generated method signature
	 * 
	 * @param sumar
	 */

	public es.aytos.main.SumarResponse sumar(es.aytos.main.Sumar sumar) {
		es.aytos.main.SumarResponse response = new es.aytos.main.SumarResponse();
		response.set_return(sumar.getArgs0() + sumar.getArgs1());
		return response;
	}

}
