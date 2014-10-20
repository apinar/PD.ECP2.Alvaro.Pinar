package factoryMethod.naturalNumber;

public class NaturalNumberManager {

	NaturalNumberCreator creator;

	public NaturalNumber createNaturalNumber(int value) {
		return creator.createNaturalNumber(value);
	}
	
	public void setCreator(NaturalNumberCreator creator) {
		this.creator = creator;
	}
	
}
