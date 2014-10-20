package factoryMethod.naturalNumber;

import upm.jbb.IO;

public class FactoryMethodMain {

	public static void main(String[] args) {
		NaturalNumberManager manager = new NaturalNumberManager();
		
        manager.setCreator(new NaturalNumberEsCreator());
        NaturalNumber naturalNumber = manager.createNaturalNumber(3);
        IO.out.println(naturalNumber.getTextValue());
        
        manager.setCreator(new NaturalNumberEnCreator());
        naturalNumber = manager.createNaturalNumber(4);
        IO.out.println(naturalNumber.getTextValue());
        
        manager.setCreator(new NaturalNumberFrCreator());
        naturalNumber = manager.createNaturalNumber(5);
        IO.out.println(naturalNumber.getTextValue());

        
	}

}
