package cn.wxj.flight;

public class AirLineInfo {

//  <company>吉祥航空</company>
//    HO1252</airlinecode>
//    <startdrome>北京首都国际机场</startdrome>
//    上海虹桥国际机场</arrivedrome>
//    <starttime>06:50</starttime>
//    09:05</arrivetime>
//    <mode>320</mode>
//    0</airlinestop>
//    <week>123456日</week>
//返回数据：DataSet，Table(0)结构为 
//Item(Company)航空公司、
//Item(AirlineCode)航班号、
//Item(StartDrome)出发机场、
//Item(ArriveDrome)到达机场、
//Item(StartTime)出发时间、
//Item(ArriveTime)到达时间、
//Item(Mode)机型、
//Item(AirlineStop)经停
//、Item(Week)飞行周期（星期）

 private String  company;
 private String  airlineCode;
 private String  startDrome;
 private String  arriveDrome;
 private String  startTime;
 private String  arriveTime;
 private String  mode;
 private String  airlineStop;
 private String  week;
 public String getCompany() {
     return company;
 }
 public void setCompany(String company) {
     this.company = company;
 }
 public String getAirlineCode() {
     return airlineCode;
 }
 public void setAirlineCode(String airlineCode) {
     this.airlineCode = airlineCode;
 }
 public String getStartDrome() {
     return startDrome;
 }
 public void setStartDrome(String startDrome) {
     this.startDrome = startDrome;
 }
 public String getArriveDrome() {
     return arriveDrome;
 }
 public void setArriveDrome(String arriveDrome) {
     this.arriveDrome = arriveDrome;
 }
 public String getStartTime() {
     return startTime;
 }
 public void setStartTime(String startTime) {
     this.startTime = startTime;
 }
 public String getArriveTime() {
     return arriveTime;
 }
 public void setArriveTime(String arriveTime) {
     this.arriveTime = arriveTime;
 }
 public String getMode() {
     return mode;
 }
 public void setMode(String mode) {
     this.mode = mode;
 }
 public String getAirlineStop() {
     return airlineStop;
 }
 public void setAirlineStop(String airlineStop) {
     this.airlineStop = airlineStop;
 }
 public String getWeek() {
     return week;
 }
 public void setWeek(String week) {
     this.week = week;
 }

 @Override
 public String toString() {
     return "AirLineInfo [航空公司=" + company + ", 航班号=" + airlineCode + ", 出发机场=" + startDrome
             + ", 到达机场=" + arriveDrome + ", 出发时间=" + startTime + ", 到达时间=" + arriveTime + ", 机型="
             + mode + ", 经停=" + airlineStop + ", 飞行周期（星期）=" + week + "]";
 }   


}
