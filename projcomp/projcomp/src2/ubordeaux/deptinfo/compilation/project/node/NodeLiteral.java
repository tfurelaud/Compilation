package ubordeaux.deptinfo.compilation.project.node;

import ubordeaux.deptinfo.compilation.project.type.Type;
import ubordeaux.deptinfo.compilation.project.type.TypeString;

public final class NodeLiteral extends NodeExp {

	private Object value;

	public NodeLiteral(Type type, Object value) {
		super();
		this.type = type;
		this.value = value;
	}

	public String toString() {
		return this.getClass().getSimpleName() + '#' + value + ':' + type + '#';
	}

	@Override
	public boolean checksType() {
		super.checksType();
		return true;
	}
	
	public String toDotNodeName() {
		
		TypeString s = new TypeString();
		if(type.equals(s)) {
			return "NodeLiteral " + value.toString().replaceAll("\"", "\\" + "\\"+"\"") ;
		}
		return "NodeLiteral " + value.toString();
	}
	
	@Override
	public NodeLiteral clone() {
		return new NodeLiteral(type, value);
	}
	
}