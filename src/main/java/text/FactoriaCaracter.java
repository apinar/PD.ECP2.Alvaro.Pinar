package text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {

private Map<Character, Caracter> map;
	
	private static FactoriaCaracter factoria;
	
	private FactoriaCaracter(){
		map = new HashMap<Character, Caracter>();
	}
	
	public static FactoriaCaracter getFactoria() {
		if(factoria == null){
			factoria = new FactoriaCaracter();
		}
		return factoria;
	}

	public Caracter get(char c) {
		if(map.containsKey(c)){
			return map.get(c);
		}else{
			Caracter caracter = new Caracter(c);
			map.put(c, caracter);
            return caracter;
		}
	}

}
