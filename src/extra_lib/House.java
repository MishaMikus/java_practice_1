package extra_lib;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class House implements Serializable{
    private String address;
    private List<User> residentList=new ArrayList<>();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<User> getResidentList() {
        return residentList;
    }

    public void setResidentList(List<User> residentList) {
        this.residentList = residentList;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", residentList=" + residentList +
                '}';
    }
}
