package cn.xyzs.api.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "XY_CUSTOMER_INFO")
public class XyCustomerInfo {
    @Id
    @Setter
    @Getter
    @Column(name="CTR_CODE")
    private String ctrCode;
    @Setter
    @Getter
    @Column(name="CTR_CRT_DATE")
    private String ctrCrtDate;
    @Setter
    @Getter
    @Column(name="CTR_NAME")
    private String ctrName;
    @Setter
    @Getter
    @Column(name="CTR_TEL")
    private String ctrTel;
    @Setter
    @Getter
    @Column(name="CTR_CARDID")
    private String ctrCardid;
    @Setter
    @Getter
    @Column(name="CTR_ADDR")
    private String ctrAddr;
    @Setter
    @Getter
    @Column(name="CTR_AREA")
    private Integer ctrArea;
    @Setter
    @Getter
    @Column(name="CTR_STRUCTURE")
    private String ctrStructure;
    @Setter
    @Getter
    @Column(name="CTR_FLOOR")
    private Integer ctrFloor;
    @Setter
    @Getter
    @Column(name="CTR_LIFT")
    private String ctrLift;
    @Setter
    @Getter
    @Column(name="CTR_PRJ_TYPE")
    private String ctrPrjType;
    @Setter
    @Getter
    @Column(name="CTR_QT_RANGE")
    private String ctrQtRang;
    @Setter
    @Getter
    @Column(name="CTR_QT_TYPE")
    private String ctrQtType;
    @Setter
    @Getter
    @Column(name="RG_VER_CODE")
    private String rgVerCode;
    @Setter
    @Getter
    @Column(name="CTR_WAITER")
    private String ctrWaiter;
    @Setter
    @Getter
    @Column(name="CTR_ORG")
    private String ctrOrg;
    @Setter
    @Getter
    @Column(name="CTR_SJS")
    private String ctrSjs;
    @Setter
    @Getter
    @Column(name="CTR_GCJL")
    private String ctrGcjl;
    @Setter
    @Getter
    @Column(name="CTR_CLDD")
    private String ctrCldd;
    @Setter
    @Getter
    @Column(name="CTR_ROWID")
    private String ctrRowid;
    @Setter
    @Getter
    @Column(name="CTR_AREA_MA")
    private String ctrAreaMa;
    @Setter
    @Getter
    @Column(name="CTR_PRO_ORG")
    private String ctrProOrg;
    @Setter
    @Getter
    @Column(name="CTR_KG_DATE")
    private String ctrKgDate;
    @Setter
    @Getter
    @Column(name="CTR_STATU")
    private String ctrStatu;
    @Setter
    @Getter
    @Column(name="CTR_DRAW")
    private String ctrDraw;
    @Setter
    @Getter
    @Column(name="DRAW_STATU")
    private String drawStatu;
    @Setter
    @Getter
    @Column(name="CTR_X")
    private String ctrX;
    @Setter
    @Getter
    @Column(name="CTR_Y")
    private String ctrY;
    @Setter
    @Getter
    @Column(name="CTR_MAP_VERSION")
    private String ctrMapVersion;
}
