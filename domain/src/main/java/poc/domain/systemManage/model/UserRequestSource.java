package poc.domain.systemManage.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestSource {
    /**
     * 用户ID
     */
    private Integer userId;
    /**
     * 登录用户名
     */
    private String loginName;
    /**
     * 登录密码
     */
    private String loginPassword;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 真实姓名
     */
    private String realName;
    /**
     * 联系电话
     */
    private String tel;
    /**
     * 所属机构
     */
    private String organization;
    /**
     * 所属部门
     */
    private String department;
    /**
     * 所属区县
     */
    private String county;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 用户状态 0正常 1停用 2注销
     */
    private String userStatus;
    /**
     * 逻辑删除，1逻辑删除，0未删除
     */
    private String isDelete;

    private Date createTime;

    private String city;

    private String regionLevel;

    private String userType;

    private String office;
    private String position;
}
