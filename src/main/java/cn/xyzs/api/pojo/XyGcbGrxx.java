package cn.xyzs.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "XY_GCB_GRXX")
public class XyGcbGrxx {
    @Id
    @Getter
    @Setter
    private String grId;
    @Getter
    @Setter
    private String grName;
    @Getter
    @Setter
    private String  grIdcard;
    @Getter
    @Setter
    private String  grTel;
    @Getter
    @Setter
    private String  grGz;
    @Getter
    @Setter
    private String  gzZw;
    @Getter
    @Setter
    private String  grLevel;
    @Getter
    @Setter
    private String  grInDate;
    @Getter
    @Setter
    private String  grOutDate;
    @Getter
    @Setter
    private String  grStatu;
    @Getter
    @Setter
    private String  grAddr;
    @Getter
    @Setter
    private String  grBankid;
    @Getter
    @Setter
    private String  grGpsX;
    @Getter
    @Setter
    private String  grGpsY;
    @Getter
    @Setter
    private String  grGpsVersion;
    @Getter
    @Setter
    private String  grOrg;
    @Getter
    @Setter
    private String  grLevelVm;
    @Getter
    @Setter
    private String  password;

}
