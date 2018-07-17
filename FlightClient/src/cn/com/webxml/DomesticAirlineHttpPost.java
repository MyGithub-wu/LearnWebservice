package cn.com.webxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2018-07-16T21:35:26.717+08:00
 * Generated source version: 3.2.5
 *
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "DomesticAirlineHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DomesticAirlineHttpPost {

    /**
     * <br /><h3>获得这国内飞机航班时刻表Web Services支持的全部城市中英文名称和缩写 DataSet</h3><p>输入参数：无；返回数据：结构为 Item(enCityName)城市英文名称、Item(cnCityName)城市中文名称、Item(Abbreviation)缩写，按城市英文名称升序排列</p><br />
     */
    @WebMethod
    @WebResult(name = "DataSet", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public DataSet getDomesticCity();

    /**
     * <br /><h3>获得航班时刻表 DataSet</h3><p>输入参数：startCity = 出发城市（中文城市名称或缩写、空则默认：上海）；lastCity = 抵达城市（中文城市名称或缩写、空则默认：北京）；theDate = 出发日期（String 格式：yyyy-MM-dd，如：2007-07-02，空则默认当天）；userID = 商业用户ID（免费用户不需要）<br />返回数据：DataSet，Table(0)结构为 Item(Company)航空公司、Item(AirlineCode)航班号、Item(StartDrome)出发机场、Item(ArriveDrome)到达机场、Item(StartTime)出发时间、Item(ArriveTime)到达时间、Item(Mode)机型、Item(AirlineStop)经停、Item(Week)飞行周期（星期）</p><br />
     */
    @WebMethod
    @WebResult(name = "DataSet", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    public DataSet getDomesticAirlinesTime(
        @WebParam(partName = "startCity", name = "startCity", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String startCity,
        @WebParam(partName = "lastCity", name = "lastCity", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String lastCity,
        @WebParam(partName = "theDate", name = "theDate", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String theDate,
        @WebParam(partName = "userID", name = "userID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );
}
