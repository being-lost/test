package com.fff.demo.pojo;

public class SellerShareSet {
    String id;//主键
    String myData_sellerShareSet;//外键


    String unid;
    Integer inviteSharePoint;
    Integer sigPoint;
    Integer sharePoint;
    Integer insuranceFund;
    Integer actionPoint;
    Integer sellerPoint;
    Integer allPoint;
    Integer basePoint;
    Double sharePrecent;
    Double fundPrecent;
    Integer noVip;

    public void setId(String primaryKey) {
        this.id = primaryKey;
    }

    public String getId() {
        return id;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Integer getInviteSharePoint() {
        return inviteSharePoint;
    }

    public void setInviteSharePoint(Integer inviteSharePoint) {
        this.inviteSharePoint = inviteSharePoint;
    }

    public Integer getSigPoint() {
        return sigPoint;
    }

    public void setSigPoint(Integer sigPoint) {
        this.sigPoint = sigPoint;
    }

    public Integer getSharePoint() {
        return sharePoint;
    }

    public void setSharePoint(Integer sharePoint) {
        this.sharePoint = sharePoint;
    }

    public Integer getInsuranceFund() {
        return insuranceFund;
    }

    public void setInsuranceFund(Integer insuranceFund) {
        this.insuranceFund = insuranceFund;
    }

    public Integer getActionPoint() {
        return actionPoint;
    }

    public void setActionPoint(Integer actionPoint) {
        this.actionPoint = actionPoint;
    }

    public Integer getSellerPoint() {
        return sellerPoint;
    }

    public void setSellerPoint(Integer sellerPoint) {
        this.sellerPoint = sellerPoint;
    }

    public Integer getAllPoint() {
        return allPoint;
    }

    public void setAllPoint(Integer allPoint) {
        this.allPoint = allPoint;
    }

    public Integer getBasePoint() {
        return basePoint;
    }

    public void setBasePoint(Integer basePoint) {
        this.basePoint = basePoint;
    }

    public Double getSharePrecent() {
        return sharePrecent;
    }

    public void setSharePrecent(Double sharePrecent) {
        this.sharePrecent = sharePrecent;
    }

    public Double getFundPrecent() {
        return fundPrecent;
    }

    public void setFundPrecent(Double fundPrecent) {
        this.fundPrecent = fundPrecent;
    }

    public Integer getNoVip() {
        return noVip;
    }

    public void setNoVip(Integer noVip) {
        this.noVip = noVip;
    }

    @Override
    public String toString() {
        return "SellerShareSet{" +
                "unid='" + unid + '\'' +
                ", inviteSharePoint=" + inviteSharePoint +
                ", sigPoint=" + sigPoint +
                ", sharePoint=" + sharePoint +
                ", insuranceFund=" + insuranceFund +
                ", actionPoint=" + actionPoint +
                ", sellerPoint=" + sellerPoint +
                ", allPoint=" + allPoint +
                ", basePoint=" + basePoint +
                ", sharePrecent=" + sharePrecent +
                ", fundPrecent=" + fundPrecent +
                ", noVip=" + noVip +
                '}';
    }


}
