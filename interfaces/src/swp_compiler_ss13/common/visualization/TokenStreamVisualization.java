package swp_compiler_ss13.common.visualization;

import swp_compiler_ss13.common.lexer.Lexer;

public interface TokenStreamVisualization {
    /**
     * Visualize the token stream
     */
    public void visualizeTokenStream(Lexer lexer);
}