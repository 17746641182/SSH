package StrutsDemo;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {

    //用户输入的姓名
    private String name = "";

    //向用户显示的信息
    private String message = "";

    /**
     * execute方法,当Struts2 处理用户请求时, 在默认配置下调用的方法
     *
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        //根据用户输入的姓名,进行"Hello,XXXX!"的封装
        this.setMessage("Hello," + this.getName() + "!");
        //处理完毕,返回"helloWorld"
        return "helloWorld";
    }


    /**
     * 获取名字
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名字
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取显示消息
     *
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置显示消息
     *
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}
