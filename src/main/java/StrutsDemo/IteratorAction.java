package StrutsDemo;

import com.opensymphony.xwork2.ActionSupport;

import java.util.ArrayList;
import java.util.List;

public class IteratorAction extends ActionSupport {

    private List<String> list;

    /**
     * execute方法,当Struts2处理用户请求时,在默认配置下调用的方法
     * @return
     */
    public String execute(){
        list = new ArrayList<String>();
        list.add("Jack");
        list.add("Marry");
        list.add("John");
        list.add("John");
        list.add("Bob");
        return SUCCESS;
    }


    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
