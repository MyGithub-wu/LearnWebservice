package cn.wxj.flight;

public class CityInfo {
	private String enCityName;      //  (enCityName)����Ӣ�����ơ�
    private String cnCityName;      //  Item(cnCityName)������������
    private String abbreviation;     // Item(Abbreviation)��д
    public String getEnCityName() {
        return enCityName;
    }
    public void setEnCityName(String enCityName) {
        this.enCityName = enCityName;
    }
    public String getCnCityName() {
        return cnCityName;
    }
    public void setCnCityName(String cnCityName) {
        this.cnCityName = cnCityName;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    @Override
    public String toString() {
        return "CityInfo [����Ӣ������=" + enCityName + ", ������������=" + cnCityName + ", ��д=" + abbreviation
                + "]";
    }

   
}
