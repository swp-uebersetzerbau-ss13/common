package swp_compiler_ss13.common.backend;

import java.io.OutputStream;
import java.util.List;

public interface Backend
{
	void generateTargetCode(List<Quadruple> tac, OutputStream output);
}
