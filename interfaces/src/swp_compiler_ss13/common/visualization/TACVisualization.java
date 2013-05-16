package swp_compiler_ss13.common.visualization;

import java.util.List;

import swp_compiler_ss13.common.backend.Quadruple;

public interface TACVisualization {
    /**
     * Visualize the tac
     */
    public void visualizeTAC(List<Quadruple> tac);
}