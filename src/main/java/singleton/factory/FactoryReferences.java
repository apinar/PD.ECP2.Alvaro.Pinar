package singleton.factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryReferences {
    private Map<String, Integer> references;
    private int reference;
    private static FactoryReferences factoryReferences = new FactoryReferences();

    private FactoryReferences() {
    	this.references = new HashMap<>();
    	this.reference = 0;
    }
    
    public static FactoryReferences getFactory() {
    	return factoryReferences;
    }

    public int getReference(String key) {
        Integer result = factoryReferences.references.get(key);
        if (result == null) {
        	factoryReferences.references.put(key, factoryReferences.reference);
            result = factoryReferences.reference;
            reference++;
        }
        return result;
    }

    public void removeReference(String key) {
    	factoryReferences.references.remove(key);
    }

}