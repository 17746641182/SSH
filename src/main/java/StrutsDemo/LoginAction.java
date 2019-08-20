package StrutsDemo;

import POJO.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import javax.servlet.http.HttpSession;
import java.util.Map;

public class LoginAction extends ActionSupport {


    private User user;

    /**
     * @return
     * @throws Exception
     */
    @Override
    public String execute() throws Exception {
        //用户名为"jason"密码为"2010"时,登录成功
        if ("jason".equals(user.getUserName()) && "2010".equals(user.getPassword())) {
            //获取Session
            Map<String, Object> session = null;
            session = ActionContext.getContext().getSession();
            //将用户名存储至session
            session.put("CURRENT_USER", user.getUserName());
            //登录成功,返回"success"
            this.getUser().setUserName(user.getUserName());

            HttpSession httpSession = ServletActionContext.getRequest().getSession();
            httpSession.setAttribute("pwd", user.getPassword());
            return Action.SUCCESS;
        } else {
            //登录失败,返回"error"
            return Action.ERROR;
        }

    }

    /**
     *
     */
    public void validate() {
        if (user.getUserName() == null || user.getUserName().length() == 0) {
            addFieldError("name", "用户名不能为空");
        }
        if (user.getPassword() == null || user.getPassword().length() == 0) {
            addFieldError("pwd", "密码不能为空");
        }
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
