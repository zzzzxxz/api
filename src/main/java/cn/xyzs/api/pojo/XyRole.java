package cn.xyzs.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "XY_ROLE")
public class XyRole {

    @Getter
    @Setter
    @Column(name = "ROLE_ID")
    private String roleId;

    @Getter
    @Setter
    @Column(name = "ROLE_NAME")
    private String roleName;

    @Getter
    @Setter
    @Column(name = "ROLE_TYPE")
    private String roleType;
}
