package com.fff.demo.pojo;



public class MyData {
    private Integer id;//主键
    private Integer goodId;
    private Integer chainsActionId;
    private String name;
    private String description;
    private Integer numb;
    private String url;
    private Integer sale;
    private Double price;
    private Double activityPrice;
    private String unit;
    private Integer refundNumb;
    private Double weight;
    private Boolean isOutLink;
    private String outLink;
    private Double taibaoPrice;
    private Double sellerPrice;
    private Double commission;
    private Integer shopType;
    private Boolean isActivity;
    private Double sharePrice;
    private Boolean isCouponCard;
    private Double sellerPoint;
    private String unid;

    private SellerShareSet sellerShareSet;

    private Boolean zeroBuy;
    private Integer type;
    private Integer categoryId;
    private Integer state;

    private String details;

    private String extra;
    private String expressType;

    private AccountBaseSeller accountBaseSeller;

    private String createdAt;
    private String updatedAt;
    private Integer gdeliveryTemplateId;
    private String gdeliveryTemplateName;
    private String sellerSetJson;





    @Override
    public String toString() {
        return "MyData{" +
                "id=" + id +
                ", goodId=" + goodId +
                ", chainsActionId=" + chainsActionId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numb=" + numb +
                ", url='" + url + '\'' +
                ", sale=" + sale +
                ", price=" + price +
                ", activityPrice=" + activityPrice +
                ", unit='" + unit + '\'' +
                ", refundNumb=" + refundNumb +
                ", weight=" + weight +
                ", isOutLink=" + isOutLink +
                ", outLink='" + outLink + '\'' +
                ", taibaoPrice=" + taibaoPrice +
                ", sellerPrice=" + sellerPrice +
                ", commission=" + commission +
                ", shopType=" + shopType +
                ", isActivity=" + isActivity +
                ", sharePrice=" + sharePrice +
                ", isCouponCard=" + isCouponCard +
                ", sellerPoint=" + sellerPoint +
                ", unid='" + unid + '\'' +
                ", sellerShareSet=" + sellerShareSet +
                ", zeroBuy=" + zeroBuy +
                ", type=" + type +
                ", categoryId=" + categoryId +
                ", state=" + state +
                ", details='" + details + '\'' +
                ", extra='" + extra + '\'' +
                ", expressType='" + expressType + '\'' +
                ", accountBaseSeller=" + accountBaseSeller +
                ", createdAt='" + createdAt + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", gdeliveryTemplateId=" + gdeliveryTemplateId +
                ", gdeliveryTemplateName='" + gdeliveryTemplateName + '\'' +
                ", sellerSetJson='" + sellerSetJson + '\'' +
                '}';
    }

    public String getSellerSetJson() {
        return sellerSetJson;
    }

    public void setSellerSetJson(String sellerSetJson) {
        this.sellerSetJson = sellerSetJson;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getChainsActionId() {
        return chainsActionId;
    }

    public void setChainsActionId(Integer chainsActionId) {
        this.chainsActionId = chainsActionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumb() {
        return numb;
    }

    public void setNumb(Integer numb) {
        this.numb = numb;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getActivityPrice() {
        return activityPrice;
    }

    public void setActivityPrice(Double activityPrice) {
        this.activityPrice = activityPrice;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Integer getRefundNumb() {
        return refundNumb;
    }

    public void setRefundNumb(Integer refundNumb) {
        this.refundNumb = refundNumb;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Boolean getIsOutLink() {
        return isOutLink;
    }
    public String getOutLink() {
        return outLink;
    }

    public void setOutLink(String outLink) {
        this.outLink = outLink;
    }

    public Double getTaibaoPrice() {
        return taibaoPrice;
    }

    public void setTaibaoPrice(Double taibaoPrice) {
        this.taibaoPrice = taibaoPrice;
    }

    public Double getSellerPrice() {
        return sellerPrice;
    }

    public void setSellerPrice(Double sellerPrice) {
        this.sellerPrice = sellerPrice;
    }

    public Double getCommission() {
        return commission;
    }

    public void setCommission(Double commission) {
        this.commission = commission;
    }

    public Integer getShopType() {
        return shopType;
    }

    public void setShopType(Integer shopType) {
        this.shopType = shopType;
    }

    public Boolean getActivity() {
        return isActivity;
    }

    public void setActivity(Boolean activity) {
        isActivity = activity;
    }

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public Boolean getCouponCard() {
        return isCouponCard;
    }

    public void setCouponCard(Boolean couponCard) {
        isCouponCard = couponCard;
    }

    public Double getSellerPoint() {
        return sellerPoint;
    }

    public void setSellerPoint(Double sellerPoint) {
        this.sellerPoint = sellerPoint;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public SellerShareSet getSellerShareSet() {
        return sellerShareSet;
    }

    public void setSellerShareSet(SellerShareSet sellerShareSet) {
        this.sellerShareSet = sellerShareSet;

    }

    public Boolean getZeroBuy() {
        return zeroBuy;
    }

    public void setZeroBuy(Boolean zeroBuy) {
        this.zeroBuy = zeroBuy;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public String getExpressType() {
        return expressType;
    }

    public void setExpressType(String expressType) {
        this.expressType = expressType;
    }

    public AccountBaseSeller getAccountBaseSeller() {
        return accountBaseSeller;
    }

    public void setAccountBaseSeller(AccountBaseSeller accountBaseSeller) {
        this.accountBaseSeller = accountBaseSeller;

    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getGdeliveryTemplateId() {
        return gdeliveryTemplateId;
    }

    public void setGdeliveryTemplateId(Integer gdeliveryTemplateId) {
        this.gdeliveryTemplateId = gdeliveryTemplateId;
    }

    public String getGdeliveryTemplateName() {
        return gdeliveryTemplateName;
    }

    public void setGdeliveryTemplateName(String gdeliveryTemplateName) {
        this.gdeliveryTemplateName = gdeliveryTemplateName;
    }

    public void setIsOutLink(Boolean outLink) {
        this.isOutLink = outLink;
    }
}
