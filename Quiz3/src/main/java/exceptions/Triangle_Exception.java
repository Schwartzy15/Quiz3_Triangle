package exceptions;

import base.Triangle;

public class Triangle_Exception extends Exception {
	private Triangle t;
	public Triangle_Exception(Triangle t){
		this.t = t;
	}
	public Triangle getTriangle(){
		return t;
	}
}
