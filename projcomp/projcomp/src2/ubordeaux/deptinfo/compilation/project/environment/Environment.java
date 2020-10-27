package ubordeaux.deptinfo.compilation.project.environment;
import java.util.HashMap;
import ubordeaux.deptinfo.compilation.project.type.*;
import java.util.Map;

public class Environment implements EnvironmentInt {
	
	private Map<String, Type> hashmap;
	private String name;

	public Environment(String name) {
		this.name = name;
		this.hashmap = new HashMap<String, Type>();
	}

	@Override
	public void putVariable(String variable, Type type) {
		hashmap.put(variable, type);
		//System.out.println("Enregistre : " + variable + " -> " + type);
	}

	@Override
	public Type getVariableType(String variable) {
		//System.out.println("Retrouve : " + variable + " -> " + hashmap.get(variable));
		return hashmap.get(variable);
	}
}
