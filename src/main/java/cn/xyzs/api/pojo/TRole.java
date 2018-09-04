package cn.xyzs.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "XY_USER_ROLE")
public class TRole {
    @Id
    @Getter
    @Setter
    private String urId;
    @Column(name = "USER_ID")
    @Getter
    @Setter
    private String USER_ID;
    @Column(name = "ROLE_ID")
    @Getter
    @Setter
    private String ROLE_ID;

}
