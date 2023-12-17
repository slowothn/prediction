package com.example.predict;

public class ApiData {
    public static String resultCode = "resultCode";
    public static String resultMsg = "resultMsg";

    public static String dissCd = "dissCd";

    public static String dt = "dt";
    public static String znCd = "znCd";

    public static String lowrnkZnCd = "lowrnkZnCd";
    public static String cnt = "cnt";
    public static String risk = "risk";
    public static String dissRiskXpln = "dissRiskXpln";

//    String resultCode = "resultCode"; //결과 코드
//    String resultMsg = "resultMsg"; //결과 메세지
//
//    String dissCd = "dissCd"; //질병 코드
//
//    String dt = "dt"; //예측일지
//    String znCd = "znCd"; //지역코드
//
//    String lowrnkZnCd = "lowrnkZnCd"; //하위 지역코드
//    String cnt = "cnt"; //질병 예측진료 건수
//    String risk = "risk"; //질병 예측위험도
//    String dissRiskXpln = "dissRiskXpln"; //질병 위험도 지침

    public ApiData(String resultMsg, String resultCode, String dissCd, String dt, String znCd, String lowrnkZnCd, String cnt, String risk, String dissRiskXpln){
        this.resultCode =resultCode;
        this.resultMsg = resultMsg;
        this.dissCd = dissCd;
        this.dt = dt;
        this.znCd = znCd;
        this.lowrnkZnCd = lowrnkZnCd;
        this.cnt =cnt;
        this.risk =risk;
        this.dissRiskXpln = dissRiskXpln;
    }

    @Override
    public String toString(){
        return "ApiData{" + "resultCode= '" + resultCode + '\'' + ", resultMsg= '"+resultMsg + '\''  + ", dissCd= '"+dissCd + '\'' + ", dt= '"+dt + '\'' + ", znCd= '"+znCd + '\'' + ", lowrnkZnCd= '"+lowrnkZnCd + '\'' + ", cnt= '"+cnt + '\'' + ", risk = '"+risk + '\'' + ", dissRiskXpln= '"+dissRiskXpln + '\'' + '}';
    }





}
