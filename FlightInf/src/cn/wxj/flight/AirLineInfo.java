package cn.wxj.flight;

public class AirLineInfo {

//  <company>���麽��</company>
//    HO1252</airlinecode>
//    <startdrome>�����׶����ʻ���</startdrome>
//    �Ϻ����Ź��ʻ���</arrivedrome>
//    <starttime>06:50</starttime>
//    09:05</arrivetime>
//    <mode>320</mode>
//    0</airlinestop>
//    <week>123456��</week>
//�������ݣ�DataSet��Table(0)�ṹΪ 
//Item(Company)���չ�˾��
//Item(AirlineCode)����š�
//Item(StartDrome)����������
//Item(ArriveDrome)���������
//Item(StartTime)����ʱ�䡢
//Item(ArriveTime)����ʱ�䡢
//Item(Mode)���͡�
//Item(AirlineStop)��ͣ
//��Item(Week)�������ڣ����ڣ�

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
     return "AirLineInfo [���չ�˾=" + company + ", �����=" + airlineCode + ", ��������=" + startDrome
             + ", �������=" + arriveDrome + ", ����ʱ��=" + startTime + ", ����ʱ��=" + arriveTime + ", ����="
             + mode + ", ��ͣ=" + airlineStop + ", �������ڣ����ڣ�=" + week + "]";
 }   


}
