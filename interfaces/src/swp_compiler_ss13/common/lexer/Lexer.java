package swp_compiler_ss13.common.lexer;

import java.io.InputStream;

/**
 * Proposed interface for lexer
 * 
 * @author "Damla Durmaz", "Ferhat Beyaz", "Sebastian Barthel", "Florian Freudenberg"
 * @version 2
 * @see <a target="_top" href="https://github.com/swp-uebersetzerbau-ss13/common/issues/3</a>
 */
public interface Lexer {
	
	/**
	 * Defines the stream for program source. The stream has to be ready for
	 * reading. Normally the lexer will read the complete stream till it ends,
	 * but this is not guaranteed.
	 * 
	 * @param stream
	 */
	public void setSourceStream(InputStream stream);
	
	/** 
	 * As long as not all characters are tokenized, it returns a token with
	 * token.getTokenType() != TokenType.EOF
	 * 
	 * If there are no characters left for tokenization it always returns a
	 * EOF-token.
	 * 
	 * @return a token instance
	 */
	public Token getNextToken();
}