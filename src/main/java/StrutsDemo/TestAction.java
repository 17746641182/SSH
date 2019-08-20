package StrutsDemo;

import com.opensymphony.xwork2.ActionSupport;

public class TestAction extends ActionSupport {

    public String page1(){
        System.out.println("==============================");
        System.out.println("这是page1方法");
        return ActionSupport.SUCCESS;
    }

    public String page2(){
        System.out.println("===============================");
        System.out.println("这是page2方法");
        return ActionSupport.SUCCESS;
    }

}
