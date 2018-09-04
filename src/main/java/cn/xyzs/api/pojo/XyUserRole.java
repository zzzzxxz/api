package cn.xyzs.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "XY_USER_ROLE")
public class XyUserRole {

    @Getter
    @Setter
    @Column(name = "UR_ID")
    private String urId;

    @Getter
    @Setter
    @Column(name = "USER_ID")
    private String userd;

    @Getter
    @Setter
    @Column(name = "ROLE_ID")
    private String roled;

}
