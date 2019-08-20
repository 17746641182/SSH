package StrutsDemo;

import POJO.Users;
import Service.UsersService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;

public class HouseAction extends ActionSupport {

    private Users users;

    private UsersService us = new UsersService();

    public String execute() {
        boolean flag = us.LoginSer(users.getUserName(), users.getPassword());
        if (flag) {
            HttpSession session = ServletActionContext.getRequest().getSession();
            session.setAttribute("userName", users.getUserName());
            session.setAttribute("password", users.getPassword());
            return SUCCESS;
        } else {
            return ERROR;
        }

    }

    public void validate() {
        System.out.println(users.toString());
        if (users.getUserName() == null || users.getUserName().length() == 0) {
            System.out.println("name===");
            addFieldError("name", "用户名不能为空");
        }

        if (this.users.getPassword() == null || this.users.getPassword().length() == 0) {
            System.out.println("pwd====");
            addFieldError("pwd", "密码不能为空");
        }

        System.out.println("===========" + this.getFieldErrors().toString());
    }


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }
}
