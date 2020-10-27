package ubordeaux.deptinfo.compilation.project.environment;
import ubordeaux.deptinfo.compilation.project.type.*;

public interface EnvironmentInt {
	void putVariable(String var, Type type);
	Type getVariableType(String variable);
}
