import models.DonorMatchResult;

import java.util.Comparator;

public class DonorResultsComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        int res=1;
        DonorMatchResult Hap3DonorMatchResult = (DonorMatchResult) o1;
        DonorMatchResult Hap4DonorMatchResult = (DonorMatchResult) o2;

        if(Hap3DonorMatchResult==null){
            Writer.writeToComparisionDeltaFile("\nHap3 object is:" + "NULL");
        }
        if(Hap4DonorMatchResult==null){
            Writer.writeToComparisionDeltaFile("\nHap4 object is:" + "NULL");
        }
        if(Hap3DonorMatchResult != null && Hap4DonorMatchResult !=null) {
            Writer.writeToComparisionDeltaFile("\nHap3:" + Hap3DonorMatchResult.toString());
            Writer.writeToComparisionDeltaFile("\nHap4:" + Hap4DonorMatchResult.toString());
            Writer.writeToComparisionDeltaFile("\n");

            if(Hap3DonorMatchResult.getXOF8_MCAT_ID()!=null){Writer.writeToComparisionDeltaFile("\nXOF8_MCAT_ID is null in Hap3\n");}
            if(Hap4DonorMatchResult.getXOF8_MCAT_ID()!=null){Writer.writeToComparisionDeltaFile("\nXOF8_MCAT_ID is null in Hap4\n");}
            if(!Hap3DonorMatchResult.getXOF8_MCAT_ID().equals(Hap4DonorMatchResult.getXOF8_MCAT_ID()) ){
                        Writer.writeToComparisionDeltaFile("\nXOF8_MCAT_ID does not match\n");
                        Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getXOF8_MCAT_ID());
                        Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getXOF8_MCAT_ID());
            }
        }
        if(Hap3DonorMatchResult.getXOF6_MCAT_ID()!=null){Writer.writeToComparisionDeltaFile("\ngetXOF6_MCAT_ID is null in Hap3\n");}
        if(Hap4DonorMatchResult.getXOF6_MCAT_ID()!=null){Writer.writeToComparisionDeltaFile("\ngetXOF6_MCAT_ID is null in Hap4\n");}
        if(!Hap3DonorMatchResult.getXOF6_MCAT_ID().equals(Hap4DonorMatchResult.getXOF6_MCAT_ID())){
                        Writer.writeToComparisionDeltaFile("\nXOF6_MCAT_ID does not match\n");
                        Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getXOF6_MCAT_ID());
                        Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getXOF6_MCAT_ID());
                    }
        if(Hap3DonorMatchResult.getXOF10_MCAT_ID()!=null){Writer.writeToComparisionDeltaFile("\ngetXOF10_MCAT_ID is null in Hap3\n");}
        if(Hap4DonorMatchResult.getXOF10_MCAT_ID()!=null){Writer.writeToComparisionDeltaFile("\ngetXOF10_MCAT_ID is null in Hap4\n");}

        if(!Hap3DonorMatchResult.getXOF10_MCAT_ID().equals(Hap4DonorMatchResult.getXOF10_MCAT_ID())){
                        Writer.writeToComparisionDeltaFile("\nXOF10_MCAT_ID does not match\n");
                        Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getXOF10_MCAT_ID());
                        Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getXOF10_MCAT_ID());
                    }
        if(Hap3DonorMatchResult.getSIX_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetSIX_MATCH_RATE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getSIX_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetSIX_MATCH_RATE is null in Hap4\n");}

        if(!Hap3DonorMatchResult.getSIX_MATCH_RATE().equals(Hap4DonorMatchResult.getSIX_MATCH_RATE())){
                        Writer.writeToComparisionDeltaFile("\nSIX_MATCH_RATE does not match\n");
                        Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getSIX_MATCH_RATE());
                        Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getSIX_MATCH_RATE());
                    }
        if(Hap3DonorMatchResult.getLOC_MATCH_CNT()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_MATCH_CNT is null in Hap3\n");}
        if(Hap4DonorMatchResult.getLOC_MATCH_CNT()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_MATCH_CNT is null in Hap4\n");}

        if(!Hap3DonorMatchResult.getLOC_MATCH_CNT().equals(Hap4DonorMatchResult.getLOC_MATCH_CNT())){
                        Writer.writeToComparisionDeltaFile("\nLOC_MATCH_CNT does not match\n");
                        Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getLOC_MATCH_CNT());
                        Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getLOC_MATCH_CNT());
                    }

        if(Hap3DonorMatchResult.getLOC_9OF10_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_9OF10_RTE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getLOC_9OF10_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_9OF10_RTE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getLOC_9OF10_RTE().equals(Hap4DonorMatchResult.getLOC_9OF10_RTE())) {
                Writer.writeToComparisionDeltaFile("\nLOC_9OF10_RTE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getLOC_9OF10_RTE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getLOC_9OF10_RTE());
            }
        if(Hap3DonorMatchResult.getLOC_8OF8_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_8OF8_RTE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getLOC_8OF8_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_8OF8_RTE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getLOC_8OF8_RTE().equals(Hap4DonorMatchResult.getLOC_8OF8_RTE())) {
                Writer.writeToComparisionDeltaFile("\nLOC_8OF8_RTE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getLOC_8OF8_RTE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getLOC_8OF8_RTE());
            }
        if(Hap3DonorMatchResult.getLOC_8OF10_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_8OF10_RTE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getLOC_8OF10_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_8OF10_RTE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getLOC_8OF10_RTE().equals(Hap4DonorMatchResult.getLOC_8OF10_RTE())) {
                Writer.writeToComparisionDeltaFile("\nLOC_8OF10_RTE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getLOC_8OF10_RTE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getLOC_8OF10_RTE());
            }
        if(Hap3DonorMatchResult.getLOC_7OF8_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_7OF8_RTE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getLOC_7OF8_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_7OF8_RTE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getLOC_7OF8_RTE().equals(Hap4DonorMatchResult.getLOC_7OF8_RTE())) {
                Writer.writeToComparisionDeltaFile("\nLOC_7OF8_RTE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+ Hap3DonorMatchResult.getLOC_7OF8_RTE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+ Hap4DonorMatchResult.getLOC_7OF8_RTE());
            }
        if(Hap3DonorMatchResult.getLOC_10OF10_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_10OF10_RTE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getLOC_10OF10_RTE()!=null){Writer.writeToComparisionDeltaFile("\ngetLOC_10OF10_RTE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getLOC_10OF10_RTE().equals(Hap4DonorMatchResult.getLOC_10OF10_RTE())) {
                Writer.writeToComparisionDeltaFile("\nLOC_10OF10_RTE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getLOC_10OF10_RTE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getLOC_10OF10_RTE());
            }
            //        if(Hap3DonorMatchResult.getFOUR_MATCH_RATE()==Hap4DonorMatchResult.getFOUR_MATCH_RATE()){
            //            HelperMethods.writeToComparisionDeltaFile("");
            //        }
            //        if(Hap3DonorMatchResult.getFIVE_MATCH_RATE()==Hap4DonorMatchResult.getFIVE_MATCH_RATE()){
            //            HelperMethods.writeToComparisionDeltaFile("");
            //        }
        if(Hap3DonorMatchResult.getDRB1_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetDRB1_MATCH_RATE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getDRB1_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetDRB1_MATCH_RATE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getDRB1_MATCH_RATE().equals(Hap4DonorMatchResult.getDRB1_MATCH_RATE())) {
                Writer.writeToComparisionDeltaFile("\nDRB1_MATCH_RATE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getDRB1_MATCH_RATE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getDRB1_MATCH_RATE());
            }
        if(Hap3DonorMatchResult.getDRB1_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetDRB1_MATCH_GRADE_NBR is null in Hap3\n");}
        if(Hap4DonorMatchResult.getDRB1_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetDRB1_MATCH_GRADE_NBR is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getDRB1_MATCH_GRADE_NBR().equals(Hap4DonorMatchResult.getDRB1_MATCH_GRADE_NBR())) {
                Writer.writeToComparisionDeltaFile("\nDRB1_MATCH_GRADE_NBR does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getDRB1_MATCH_GRADE_NBR());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getDRB1_MATCH_GRADE_NBR());
            }
        if(Hap3DonorMatchResult.getDQB1_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetDQB1_MATCH_RATE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getDQB1_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetDQB1_MATCH_RATE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getDQB1_MATCH_RATE().equals(Hap4DonorMatchResult.getDQB1_MATCH_RATE())) {
                Writer.writeToComparisionDeltaFile("\nDQB1_MATCH_RATE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getDQB1_MATCH_RATE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getDQB1_MATCH_RATE());
            }
        if(Hap3DonorMatchResult.getDQB1_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetDQB1_MATCH_GRADE_NBR is null in Hap3\n");}
        if(Hap4DonorMatchResult.getDQB1_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetDQB1_MATCH_GRADE_NBR is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getDQB1_MATCH_GRADE_NBR().equals(Hap4DonorMatchResult.getDQB1_MATCH_GRADE_NBR())) {
                Writer.writeToComparisionDeltaFile("\nLDQB1_MATCH_GRADE_NBR does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getDQB1_MATCH_GRADE_NBR());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getDQB1_MATCH_GRADE_NBR());
            }
            //        if(Hap3DonorMatchResult.getDONOR_MATCH_RESULT_IID()==Hap4DonorMatchResult.getDONOR_MATCH_RESULT_IID()){
            //            HelperMethods.writeToComparisionDeltaFile("");
            //        }
        if(Hap3DonorMatchResult.getC_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetC_MATCH_RATE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getC_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetC_MATCH_RATE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getC_MATCH_RATE().equals(Hap4DonorMatchResult.getC_MATCH_RATE())) {
                Writer.writeToComparisionDeltaFile("\nC_MATCH_RATE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getC_MATCH_RATE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getC_MATCH_RATE());
            }
            //        if(Hap3DonorMatchResult.getC_MATCH_GRADE_NBR()==Hap4DonorMatchResult.getC_MATCH_GRADE_NBR()){
            //            HelperMethods.writeToComparisionDeltaFile("");
            //        }
            //        if(Hap3DonorMatchResult.getCREATE_DTE()==Hap4DonorMatchResult.getCREATE_DTE()){
            //            HelperMethods.writeToComparisionDeltaFile("");
            //        }
        if(Hap3DonorMatchResult.getB_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetB_MATCH_RATE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getB_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetB_MATCH_RATE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getB_MATCH_RATE().equals(Hap4DonorMatchResult.getB_MATCH_RATE())) {
                Writer.writeToComparisionDeltaFile("\nLOC_9OF10_RTE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getB_MATCH_RATE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getB_MATCH_RATE());
            }
        if(Hap3DonorMatchResult.getB_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetB_MATCH_GRADE_NBR is null in Hap3\n");}
        if(Hap4DonorMatchResult.getB_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetB_MATCH_GRADE_NBR is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getB_MATCH_GRADE_NBR().equals(Hap4DonorMatchResult.getB_MATCH_GRADE_NBR())) {
                Writer.writeToComparisionDeltaFile("\nB_MATCH_RATE() does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getB_MATCH_GRADE_NBR());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getB_MATCH_GRADE_NBR());
            }
        if(Hap3DonorMatchResult.getA_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetA_MATCH_RATE is null in Hap3\n");}
        if(Hap4DonorMatchResult.getA_MATCH_RATE()!=null){Writer.writeToComparisionDeltaFile("\ngetA_MATCH_RATE is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getA_MATCH_RATE().equals(Hap4DonorMatchResult.getA_MATCH_RATE())) {
                Writer.writeToComparisionDeltaFile("\nA_MATCH_RATE does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getA_MATCH_RATE());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getA_MATCH_RATE());
            }
        if(Hap3DonorMatchResult.getA_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetA_MATCH_GRADE_NBR is null in Hap3\n");}
        if(Hap4DonorMatchResult.getA_MATCH_GRADE_NBR()!=null){Writer.writeToComparisionDeltaFile("\ngetA_MATCH_GRADE_NBR is null in Hap4\n");}

        if (!Hap3DonorMatchResult.getA_MATCH_GRADE_NBR().equals(Hap4DonorMatchResult.getA_MATCH_GRADE_NBR())) {
                Writer.writeToComparisionDeltaFile("\nA_MATCH_GRADE_NBR does not match\n");
                Writer.writeToComparisionDeltaFile("Hap3 value:"+Hap3DonorMatchResult.getA_MATCH_GRADE_NBR());
                Writer.writeToComparisionDeltaFile("Hap4 value:"+Hap4DonorMatchResult.getA_MATCH_GRADE_NBR());
            }
            //        if(Hap3DonorMatchResult.getAB_MCAT_ID()==Hap4DonorMatchResult.getAB_MCAT_ID()){
            //            HelperMethods.writeToComparisionDeltaFile("");
            //        }
        return res;
    }

    }

