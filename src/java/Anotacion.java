package edu.cmu.deiis.types;


import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;


/* @uthor: Tania 
 * Anotacion extends from Annotation
 * This is a simple implementation for
 * Anotacion. 
 */

public class Anotacion extends org.apache.uima.jcas.tcas.Annotation {
 
 public final static int typeIndexID = JCasRegistry.register(Annotation.class);
  
  
  public final static int type = typeIndexID;
  
  
  public int getTypeIndexID() {return typeIndexID;}
 
    protected Anotacion() {}
    
  
  public Anotacion(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  
  public Anotacion(JCas jcas) {
    super(jcas);
    readObject();   
  } 


  public Anotacion(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   


  private void readObject() {}
     
 

  public String getCasProcessorId() {
    if (Anotacion_Type.featOkTst && ((Anotacion_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.Anotacion");
    return jcasType.ll_cas.ll_getStringValue(addr, ((Anotacion_Type)jcasType).casFeatCode_casProcessorId);}
    

  public void setCasProcessorId(String v) {
    if (Anotacion_Type.featOkTst && ((Anotacion_Type)jcasType).casFeat_casProcessorId == null)
      jcasType.jcas.throwFeatMissing("casProcessorId", "edu.cmu.deiis.types.Anotacion");
    jcasType.ll_cas.ll_setStringValue(addr, ((Anotacion_Type)jcasType).casFeatCode_casProcessorId, v);}    
   
    

  public double getConfidence() {
    if (Anotacion_Type.featOkTst && ((Anotacion_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.Anotacion");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((Anotacion_Type)jcasType).casFeatCode_confidence);}
    
 
  public void setConfidence(double v) {
    if (Anotacion_Type.featOkTst && ((Anotacion_Type)jcasType).casFeat_confidence == null)
      jcasType.jcas.throwFeatMissing("confidence", "edu.cmu.deiis.types.Anotacion");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((Anotacion_Type)jcasType).casFeatCode_confidence, v);}    
  }


