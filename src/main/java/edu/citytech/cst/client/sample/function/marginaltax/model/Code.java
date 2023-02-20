package edu.citytech.cst.finance.model;
// SM, HH, MFJ
public enum Code {
   Single_Married_Filing_Separately("SM") ,Married_Filing_Jointly("MFJ"),Heads_of_Household("HH"),
    SM("SM"),MFJ("MFJ"),HH("HH");

   private final String code;

   Code(String code){
       this.code = code;

   }

    public String getCode() {
        return code;
    }
}
