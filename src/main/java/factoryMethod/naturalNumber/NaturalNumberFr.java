package factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber{

	private static final String[] textValue = {"zéro", "un", "deux", "trois", "quatre", "cinq"};
	
	public NaturalNumberFr(int value) {
        this.setValue(value);
    }

    @Override
    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumberFr.textValue[this.value];
        } else {
            return "???";
        }
    }

}