package ubordeaux.deptinfo.compilation.project.environment;
import java.util.HashMap;
import java.util.Map;

public class EnvironmentValue {
	
	private Map<String, Object> hashmap;
	private String name;

	public EnvironmentValue(String name) {
		this.name = name;
		this.hashmap = new HashMap<String, Object>();
	}

	public void putVariable(String variable, Object value) {
		hashmap.put(variable, value);
		System.out.println("Enregistre : " + variable + " -> " + value);
	}

	public Object getVariableType(String variable,Object value) {
		System.out.println("Retrouve : " + variable + " -> " + hashmap.get(variable));
		return hashmap.get(variable);
	}
}
