package com.java.interfaces.tabuada;

public class TabuadaMultiplicacao implements Tabuada {
	
	private int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}



	@Override
	public void mostrarTabuada() {

		for(int i = 1; i <= 10; i++){
			System.out.println(num + " x "+ i + " = "+ (num * i));
		}
		
	}

}


