package calculadoraMementable;

import calculadora.Calculadora;

public class CalculadoraMementable extends Calculadora{
	
public MementoCalculadora createMememnto(){
	return new MementoCalculadora(this.total);	
	}

public void restoreMemento(MementoCalculadora memento){
	this.total=memento.getTotalMemento();
}

}
