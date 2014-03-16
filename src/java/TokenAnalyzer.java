import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import edu.cmu.deiis.types.Annotation;
import edu.cmu.deiis.types.Token;


public class TokenAnalyzer {
	
	/* @uthor: Tania 
	 * TokenAnalyzer extends from Annotation
	 * This is a simple implementation for
	 * ToeknAnalyzer. 
	 */
	public class TokenAnalyzer  extends Annotation {
	  
	  
	  public final static int typeIndexID = JCasRegistry.register(Token.class);
	  
	  
	  public final static int type = typeIndexID;
	 
	  
	  public int getTypeIndexID() {return typeIndexID;}
	 
	  
	  protected TokenAnalyzer () {}
	    
	  
	  public TokenAnalyzer (int addr, TOP_Type type) {
	    super(addr, type);
	    readObject();
	  }
	  
	  
	  public TokenAnalyzer (JCas jcas) {
	    super(jcas);
	    readObject();   
	  } 

	    
	  public TokenAnalyzer (JCas jcas, int begin, int end) {
	    super(jcas);
	    setBegin(begin);
	    setEnd(end);
	    readObject();
	  }   

	  
	  private void readObject() {}
	     
	}

}
